package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DropDownDynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("WebDriver.Chrome.Driver", "D://chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();
		//(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']) //a[@value='PNQ']
	}

}
