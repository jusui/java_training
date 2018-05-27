package mrs.app.reservation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.ReservableRoomId;
import mrs.domain.model.Reservation;
import mrs.domain.service.reservation.AlreadyReservedException;
import mrs.domain.service.reservation.ReservationService;
import mrs.domain.service.reservation.UnavailableReservationException;
import mrs.domain.service.room.RoomService;
import mrs.domain.service.user.ReservationUserDetails;

@Controller
@RequestMapping("reservations/{date}/{roomId}")
public class ReservationsController_org {
	@Autowired
	RoomService roomService;
	@Autowired
	ReservationService reservationService;

	@ModelAttribute
	ReservationForm setUpForm() {
		ReservationForm form = new ReservationForm();
		// デフォルト値
		form.setStartTime(LocalTime.of(9, 0));
		form.setEndTime(LocalTime.of(10, 0));
		return form;
	}

	@RequestMapping(method = RequestMethod.GET)
	String reserveForm(
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable("date") LocalDate date,
			@PathVariable("roomId") Integer roomId, Model model) {
		ReservableRoomId reservableRoomId = new ReservableRoomId(roomId, date);
		List<Reservation> reservations = reservationService.findReservations(reservableRoomId);

		LocalTime baseTime = LocalTime.of(0, 0);
		// Make a LocalDate object 30/min
		// for 認証ユーザ
		List<LocalTime> timeList = IntStream.range(0, 24 * 2)
				.mapToObj(i -> baseTime.plusMinutes(30 * i)).collect(Collectors.toList());
		model.addAttribute("room", roomService.findMeetingRoom(roomId));
		model.addAttribute("reservations", reservations);
		model.addAttribute("timeList", timeList);
		// model.addAttribute("user", dummyUser());
		return "reservation/reserveForm";
	}

	//
	// 予約処理：reserve()
	//
	// (1)予約処理：Text
	@RequestMapping(method = RequestMethod.POST)
	String reserve(@Validated ReservationForm form, BindingResult bindingResult,
			@AuthenticationPrincipal ReservationUserDetails userDetails,
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable("date") LocalDate date,
			@PathVariable("roomId") Integer roomId, Model model) {
		// 入力チェックでエラーの有無を確認, エラーならフォーム表示画面へ遷移
		if ( bindingResult.hasErrors() ) {
			return reserveForm(date, roomId, model);
		}

		// def reservableRoom
		ReservableRoom reservableRoom = new ReservableRoom(new ReservableRoomId(roomId, date));
		Reservation reservation = new Reservation();
		reservation.setStartTime(form.getStartTime());
		reservation.setEndTime(form.getEndTime());
		reservation.setReservableRoom(reservableRoom);
		//reservation.setUser(dummyUser());
		reservation.setUser(userDetails.getUser());

		try {
			reservationService.reserve(reservation);
		} catch(UnavailableReservationException | AlreadyReservedException e )  {
			// 例外処理：予約失敗メッセージ
			model.addAttribute("error", e.getMessage());
			return reserveForm(date, roomId, model);
		}
		// 予約成功：予約一覧表示画面へリダイレクト
		return "redirect:/reservations/{date}/{roomId}";
	}

	//
	// 予約取り消し：cancel()
	//
	@RequestMapping(method = RequestMethod.POST, params = "cancel")
	String cancel(@RequestParam("reservationId") Integer reservationId,
			@PathVariable("roomId") Integer roomId,
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable("date") LocalDate date,
			Model model) {

		// ReservationUserDetailsから認証済のUserオブジェクトを取得し，予約処理に使用
		// User user = userDetails.getUser();
		try {
			Reservation reservation = reservationService.findOne(reservationId);
			reservationService.cancel(reservation);
			// ハンドリングする例外を org.springframework.security.access.AccessDeniedExceptinonに変更
		} catch (AccessDeniedException e) {
			model.addAttribute("error", e.getMessage());
			return reserveForm(date, roomId, model);
		}
		return "redirect:/reservations/{date}/{roomId}";

	}
}
