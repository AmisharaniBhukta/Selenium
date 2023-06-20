package demos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MovefromParentwindowtoChildwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.findElement(By.className("blinkingText")).click();
		
		//give all the id of parent and child
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String>it=windows.iterator();
		String parentId=it.next();
		String childtId=it.next();
		
		//move parent window to childwindow
		driver.switchTo().window(childtId);
		
		System.out.println(driver.findElement(By.className("im-para red")).getText());
		driver.findElement(By.className("im-para red"));
		String emailId=driver.findElement(By.className("im-para red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window("parentId");
		driver.findElement(By.id("username")).sendKeys("emailId");
		
		

	}

}
