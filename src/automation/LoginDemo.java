package automation;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
	
	driver.findElement(By.xpath("//input[@id='terms']")).click();
	
	driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );
	
	boolean isDashboardVisible =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='ProtoCommerce Home']"))).isDisplayed();
	
	System.out.println("Dashboard visible: " + isDashboardVisible);
	}

}
