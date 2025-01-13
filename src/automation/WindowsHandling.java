package automation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='blinkingText'][1]")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		String paraentid = it.next();
		String childid = it.next();

		driver.switchTo().window(childid);

		String emailid = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1]
				.split("with")[0].trim();

		System.out.println(emailid);
		//Thread.sleep(2000);
		driver.switchTo().window(paraentid);

		driver.findElement(By.id("username")).sendKeys(emailid);

	}

}
