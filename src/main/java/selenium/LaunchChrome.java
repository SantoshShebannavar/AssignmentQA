package selenium;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C://Users//santosh_shebannavar//Downloads//chromedriver_win32//chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C://Users//santosh_shebannavar//Downloads//geckodriver-v0.33.0-win-aarch64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
