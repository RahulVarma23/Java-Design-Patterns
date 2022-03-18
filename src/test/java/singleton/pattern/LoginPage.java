package singleton.pattern;

public class LoginPage {

	private static LoginPage loginPage;
	
	private LoginPage() {
		
	}
	
	public static LoginPage getInstance() {
		if(loginPage==null) {
			synchronized(LoginPage.class) {
				loginPage=new LoginPage();		
			}			
		}	
		return loginPage;
	}
	
	void login() {
		System.out.println("login to application");
	}
}
