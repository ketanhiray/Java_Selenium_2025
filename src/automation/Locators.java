package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div/a[text()='Forgot your password?']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ketan");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("testketan@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9834000000");
		//button[@class='reset-pwd-btn']
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String[] pass= driver.findElement(By.xpath("//p[@class='infoMsg']")).getText().split("'");
		System.out.println(pass[1]);
		//rahulshettyacademy
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Ketan");
		driver.findElement(By.name("inputPassword")).sendKeys(pass[1].trim());
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String msg2 = driver.findElement(By.cssSelector(".login-container p")).getText();
		String msg1 = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		
		System.out.println(msg1);
		System.out.println(msg2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Log Out'])[1]")).click();
		driver.close();
	}

}
