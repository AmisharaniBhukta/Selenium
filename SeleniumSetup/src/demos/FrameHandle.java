package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		
		//search number of frame
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		
		driver.findElement(By.className("demo-frame"));
		
		Actions a=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("draggable"));
		
		//trag oneframe to another
		a.dragAndDrop(source, target).build().perform();
		
		//driver search in ther page
		driver.switchTo().defaultContent();
		
		
		

	}

}
