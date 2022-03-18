package factory.pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyIeDriver implements DriverManager {
	
	WebDriver driver;
	@Override
	public void intializeDriver() {
		WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        driver.get("https://www.google.com");
		System.out.println("initialized IE");
	}
 
 
}
