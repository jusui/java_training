package mrs.domain.service.user;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import mrs.domain.model.User;

public class ReservationUserDetails implements UserDetails {
	private final User user;

	public ReservationUserDetails(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// RoneName型のenumをSpring SecurityのGrantedAuthorityに変換. プレフィックスとして「 ROLE_ 」をつけないと動かない
		return AuthorityUtils.createAuthorityList("ROLE_" + this.user.getRoleName().name());
	}

	@Override
	public String getPassword() {
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return this.user.getUserId();
	}

	//
	// 以下メソッドについての記述
	// アカウント期限切れ，アカウントロック，パスワード有効期限切れ，アカウント無効化に関するプロパティは使用しない
	//
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
