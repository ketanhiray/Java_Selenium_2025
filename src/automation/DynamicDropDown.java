package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		List<WebElement> options = driver.findElements(By.xpath("//div[@id='dropdownGroup1']//a"));

		for (WebElement option : options) {

			System.out.println(option.getText());

			if (option.getText().equalsIgnoreCase("Ahmedabad (AMD)")) {

				option.click();
				Assert.assertTrue(true, "Ahmedabad (AMD)");
				break;
			}

		}

		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		List<WebElement> options2 = driver.findElements(By.xpath("//div[@id='dropdownGroup1']//a"));
		for (WebElement option : options2) {

			System.out.println(option.getText());

			if (option.getText().equalsIgnoreCase("Pune (PNQ)")) {

				option.click();
				Assert.assertTrue(true, "Pune (PNQ)");
			}
		}
	}

}
