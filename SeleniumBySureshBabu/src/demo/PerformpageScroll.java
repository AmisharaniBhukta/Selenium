package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class PerformpageScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
			
			driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			js.executeScript("window.scrollBy(500,0)");
			
			Thread.sleep(2000);
			
			WebElement source=driver.findElement(By.id("draggable"));
			WebElement target=driver.findElement(By.id("droppable"));		
			
			Actions act=new Actions(driver);
			act.dragAndDrop(source,target);
			act.build().perform();
			
		

	}

}
