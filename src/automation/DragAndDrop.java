package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		Actions a = new Actions(driver);

		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));

		a.dragAndDrop(Source, dest).build().perform();

	}

}
