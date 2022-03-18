package singleton.pattern;

public class TestSingleTon {

	public static void main(String[] args) {
		LoginPage loginPage = LoginPage.getInstance();
		loginPage.login();
	}
}
