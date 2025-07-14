package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();

		WebElement options = driver.findElement(By.id("dropdown-class-example"));

		Select dropdown = new Select(options);

		dropdown.selectByValue("option3");
		
	}

}
