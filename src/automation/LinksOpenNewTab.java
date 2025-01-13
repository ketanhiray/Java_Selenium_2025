package automation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOpenNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement footer = driver.findElement(By.id("gf-BIG"));

		WebElement colmndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		for (int i = 1; i < colmndriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);

			colmndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
		}
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

		driver.quit();

	}

}
