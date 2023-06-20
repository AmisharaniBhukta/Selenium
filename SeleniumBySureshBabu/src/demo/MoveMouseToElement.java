package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouseToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");
		
		driver.manage().window().maximize();
		
		//create object for action class 
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		
		WebElement electronic=driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div[1]/div[2]/ul/li[4]/a/span[2]"));
		
		act.moveToElement(electronic);
		
		act.build().perform();
	
		

	}

}
