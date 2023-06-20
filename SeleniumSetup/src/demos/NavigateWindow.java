package demos;

import java.util.Set;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.io.File;

import java.io.IOException;

public class NavigateWindow {

	private static final String FileUtiles = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//tell how many windoiw open
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		//search the 1st window id
		String parentWindowId= it.next();
		String childWindowId= it.next();
		
		driver.switchTo().window(childWindowId);
		driver.get("https://rahulshettyacademy.com/#/index");
		
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();

		driver.switchTo().window(parentWindowId);
		
		//driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
		//driver.quit();
		
		
		//Taking screenshot
		
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		//capture the screenshpt in file format
		File file=name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));


	}

}
