package automation;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("Webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver =new FirefoxDriver();
		String[] expectiteams = { "Carrot", "Tomato", "Cucumber" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String productname = products.get(i).getText();

			List ExpectedList = Arrays.asList(expectiteams);

			if (ExpectedList.contains(productname)) {

				driver.findElements(By.xpath("//Button[.='ADD TO CART']")).get(i).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//img[@alt='Cart'])[1]")).click();

				System.out.println(driver.findElement(By.cssSelector("div[class*='product-info'] ")).getText());
				// driver.close();
				// break;
			}

		}

	}

}
