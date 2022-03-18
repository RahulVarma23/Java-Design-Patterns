package factory.pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyChromeDriver implements DriverManager{

	WebDriver driver;
	@Override
	public void intializeDriver() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		System.out.println("initialized chrome");
	}
}
