package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionDisplayedCapture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		
		WebElement parent=driver.findElement(By.className("G43f7e"));
	    List<WebElement> suggetionList=parent.findElements(By.tagName("li"));
	    
	   // int size=suggetionList.size();
	    
	    System.out.println(suggetionList.size());
	    
	    for(int i=0;i<suggetionList.size();i++)
	    {
	    	System.out.println(suggetionList.get(i).getText());
	    }

	    driver.close();
	}

}
