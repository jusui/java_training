package mrs.domain.service.reservation;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.ReservableRoomId;
import mrs.domain.model.Reservation;
import mrs.domain.model.RoleName;
import mrs.domain.model.User;
import mrs.domain.repository.reservation.ReservationRepository;
import mrs.domain.repository.room.ReservableRoomRepository;

@Service
@Transactional
public class ReservationService {

	// 指定日付の予約一覧処理を実装
	@Autowired
	ReservationRepository reservationRepository;

	// def findReservations
	public List<Reservation> findReservations(ReservableRoomId reservableRoomId) {
		return reservationRepository.findByReservableRoom_ReservableRoomIdOrderByStartTimeAsc(reservableRoomId);
	}

	//
	// 予約処理
	//
	@Autowired
	ReservableRoomRepository reservableRoomRepository;

	public Reservation reserve(Reservation reservation) {
		ReservableRoomId reservableRoomId = reservation.getReservableRoom().getReservableRoomId();

		// 悲観ロック：同タイミングで重複予約を防止
		ReservableRoom reservable = reservableRoomRepository.findOneForUpdateByReservableRoomId(reservableRoomId);
		// 空き部屋かどうかチェック
		// ReservableRoom reservable = reservableRoomRepository.findOne(reservableRoomId);

		if (reservable == null) {
			throw new UnavailableReservationException("この日付・部屋は予約できません。");
		}

		// 重複チェック
		boolean overlap = reservationRepository.findByReservableRoom_ReservableRoomIdOrderByStartTimeAsc(reservableRoomId)
				.stream()
				.anyMatch(x -> x.overlap(reservation));
		if (overlap) {
			throw new AlreadyReservedException("入力の時間帯はすでに予約済です。");
		}

		// 予約情報の登録
		reservationRepository.save(reservation);

		return reservation;
	} // 予約処理

	//
	// 予約キャンセル
	//

	// メソッドの実行前に適用するアクセスポリシーを指定する:@PreAuthorize
	@PreAuthorize("hasRole('ADMIN') or #reservation.user.userId == principal.user.userId")
	// @Pで明示的に引数名を指定できる(本来はクラスに出力されているデバッグ情報から引数名を解決する仕組み)
	public void cancel(@P("reservation") Reservation reservation) {
		reservationRepository.delete(reservation);
	} // 予約キャンセル

	public Reservation findOne(Integer reservationId) {
		// TODO 自動生成されたメソッド・スタブ
		return reservationRepository.findOne(reservationId);
	}

	public void cancel(Integer reservationId, User requestUser) {
		// TODO 自動生成されたメソッド・スタブ
		Reservation reservation = reservationRepository.findOne(reservationId);
		if ( RoleName.ADMIN != requestUser.getRoleName() && !Objects.equals(reservation.getUser().getUserId(), requestUser.getUserId())) {
			throw new IllegalStateException("キャンセルは許可できません。");
		}
		reservationRepository.delete(reservation);
	}

}
