package factory.pattern;
public class FactoryPatternTest {

	public static void main(String[] args) {
//		DriverManager driverManager = DriverManagerFactory.getManager("Chrome");
//		driverManager.intializeDriver();
		
		DriverManager driverManager1 = DriverManagerFactoryWithCapabilities.getManagerWithCapabilities("chrome");
		driverManager1.intializeDriver();
		
	}
}
