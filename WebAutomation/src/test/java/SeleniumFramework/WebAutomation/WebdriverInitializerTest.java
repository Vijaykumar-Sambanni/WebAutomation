package SeleniumFramework.WebAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WebdriverInitializerTest {

	
	@Test
	public void print()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void driverSetup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
