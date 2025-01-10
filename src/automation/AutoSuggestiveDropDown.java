package automation;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.Chrome.Driver", "D://chromedrivr.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options) {
			
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
			
		}
		
	}

}
