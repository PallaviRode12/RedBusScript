package ReadBusScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedbusAutomationScript {


		
		public static void main(String[] args)throws  InterruptedException {
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--start-maximized");
			
		WebDriver driver=new ChromeDriver(options);
			driver.get("https://www.redbus.in/");
			
		By SearchButton=By.xpath("//div[contains(@class, \"srcDestWrapper___bc5ef1\")and @role=\"button\"]");
			WebElement Button=driver.findElement(SearchButton);
			Button.click();
			
		Thread.sleep(4000);
		WebElement SearchBoxEle= driver.switchTo().activeElement();
		SearchBoxEle.sendKeys("Mumbai");
		
			
		
			
			
			
			
		
		
		
		
		
		
		

	}

}
