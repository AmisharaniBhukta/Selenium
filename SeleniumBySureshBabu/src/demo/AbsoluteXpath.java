package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    WebDriver driver=new ChromeDriver();
	   // System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHUKTA\\Desktop\\Test Folder");
		
		driver.get("https://www.snapdeal.com");
		
		driver.manage().window().maximize();
		
		driver.wait(2000);
		
		driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div[1]/div[2]/ul/li[4]/a/span[2]")).click();
		
	
		
	}

}
