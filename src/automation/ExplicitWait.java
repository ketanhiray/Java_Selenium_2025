package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).sendKeys("PNQ");
			driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input[@type='text']")).sendKeys("BLR");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")));

			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			// driver.quit();
		}
	}
}
