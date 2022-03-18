package factory.pattern;

public class DriverManagerFactory {

	    public static DriverManager getManager(String type) {
	        DriverManager driverManager = null;
	        switch (type.toUpperCase()) {
	            case "CHROME":
	                driverManager = new MyChromeDriver();
	                break;
	            case "FIREFOX":
	                driverManager = new MyFirefoxDriver();
	                break;
	            case "IE":
	            	driverManager = new MyIeDriver();
	                break;
	            default:
	                System.out.println("pls provide appropriate browser");
	        }       
	        return driverManager;
	    }
}
