package mrs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import mrs.domain.service.user.ReservationUserDetailsService;

@Configuration
@EnableWebSecurity // Spring Security の Web連携機能を有効化
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	ReservationUserDetailsService userDetailsService;

	@Bean
	PasswordEncoder passwordEncoder() {
		// BCrypt を使用したエンコードアルゴリズムを使用
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/js/**", "/css/**").permitAll() // /js以下と/css以下へのアクセスは常に許可
				.antMatchers("/**").authenticated() // 上記以外へのアクセスは認証を要求
				.and()
				.formLogin().loginPage("/loginForm") // ログイン画面
				.loginProcessingUrl("/login") // 認証URL
				.usernameParameter("username")
				.passwordParameter("password")
				.defaultSuccessUrl("/rooms", true) // 認証成功時・失敗時の遷移先を設定
				.failureUrl("/loginForm?error=true").permitAll(); // ログイン画面，認証URL，認証失敗時の遷移先へのアクセスは常に許可
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// 指定のUserDetailsServiceとPasswordEncoderを使用して認証処理
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

}
