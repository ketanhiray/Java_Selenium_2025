package automation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpalicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String[] expectiteams = { "Carrot", "Tomato", "Cucumber" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String productname = products.get(i).getText();

			List ExpectedList = Arrays.asList(expectiteams);

			if (ExpectedList.contains(productname)) {

				driver.findElements(By.xpath("//Button[.='ADD TO CART']")).get(i).click();
				//Thread.sleep(3000);
				driver.findElement(By.xpath("(//img[@alt='Cart'])[1]")).click();

				System.out.println(driver.findElement(By.cssSelector("div[class*='product-info'] ")).getText());
				// driver.close();
				// break;

			}

		}
	}
}