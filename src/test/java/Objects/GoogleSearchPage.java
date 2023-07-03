package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchbox = By.xpath("//textarea[@name='q']");
	
	public void searchgoogle(String searchiput) throws InterruptedException {
		
		driver.findElement(searchbox).sendKeys(searchiput);
		Thread.sleep(3000);
		
	}

}
