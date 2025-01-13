package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class CountFooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		WebElement footer= driver.findElement(By.id("gf-BIG"));
		
		System.out.println("Footer Links:"+ footer.findElements(By.tagName("a")).size());
		
		driver.quit();

	}

}
