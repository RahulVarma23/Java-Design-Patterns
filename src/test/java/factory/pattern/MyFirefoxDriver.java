package factory.pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirefoxDriver implements DriverManager {
	
	WebDriver driver;
	@Override
	public void intializeDriver() {
		WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
		System.out.println("initialized firefox");
	}
 
}
