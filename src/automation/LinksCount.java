package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class LinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice");

		System.out.println("Total Links :" + driver.findElements(By.tagName("a")).size());

		driver.quit();

	}

}
