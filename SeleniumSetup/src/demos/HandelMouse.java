package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;



import org.openqa.selenium.chrome.ChromeDriver;

public class HandelMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.get("www.amazon.com");
		
		WebElement move=driver.findElement(By.id(""));
		WebElement textbox=driver.findElement(By.id(""));
		
		//Action class
		Actions a=new Actions(driver);
		
		//move the curser to that place
		a.moveToElement(move).contextClick().build().perform();
		//contextClick()--context click used rightclick on the specific element
		
		
		a.moveToElement(textbox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		
		
		
		
	}

}
