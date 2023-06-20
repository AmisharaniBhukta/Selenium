package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoBrowserNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		
		//open facebook page
		driver.navigate().to("https://www.facebook.com/");
		
		//maximise the window
		driver.manage().window().maximize();
		
		//get the title
		String pageTitle=driver.getTitle();
		//print the title
		System.out.println(pageTitle);
		
		//delete all open window
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.close();
		
		

	}

}
