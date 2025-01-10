package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

public class CalenderSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(300);

		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-current-day')]")).click();

		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))

		{
			System.out.println("it's enabled");
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);

		}

		driver.close();

	}

}
