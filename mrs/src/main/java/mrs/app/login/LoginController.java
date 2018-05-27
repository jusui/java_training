package mrs.app.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//
// login/loginForm.html を表示するコントローラ
//

@Controller
public class LoginController {
	@RequestMapping("loginForm")
	String loginForm() {
		return "login/loginForm";
	}
}
