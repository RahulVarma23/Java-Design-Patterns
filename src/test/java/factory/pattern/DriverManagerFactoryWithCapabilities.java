package factory.pattern;

public class DriverManagerFactoryWithCapabilities {

	    public static DriverManager getManagerWithCapabilities(String type) {
	        DriverManager driverManager = null;
	        switch (type.toUpperCase()) {
	            case "CHROME":
	                driverManager = new MyChromeDriverWithCapabilities();
	                break;
	            case "FIREFOX":
	                driverManager = new MyFirefoxDriverWithCapabilities();
	                break;
	            default:
	                System.out.println("pls provide appropriate browser");
	        }       
	        return driverManager;
	    }
}
