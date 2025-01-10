package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class CheckboxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("WebDriver.Chrome.Driver", "D://chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

		//WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();
	}

}
