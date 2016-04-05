package service;

import javax.servlet.http.HttpSession;

public class LoginService {
	public static boolean isLogin(HttpSession session) {
		if(session.getAttribute("user")!=null && !session.getAttribute("user").equals("")) {
			return true;
		}
		return false;
		
	}
}
