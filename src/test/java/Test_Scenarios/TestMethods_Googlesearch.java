package Test_Scenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import Objects.GoogleSearchPage;

public class TestMethods_Googlesearch {

	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	public void searchoperator() throws InterruptedException {
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.searchgoogle("Facebook");
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
