package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver(); 
		
		driver.get("http://primusbank.qedgetech.com/");
		
		driver.findElement(By.linkText("Site Map")).click();
		
		String expectedURL="sitemap";
		
		String actualUrl=driver.getCurrentUrl();
		
		if(actualUrl.toLowerCase().contains(expectedURL.toLowerCase()))
	    {
	    	System.out.println("Test is pass");
	    }
	    else {System.out.println("Test is fail");}
		

	    driver.close();

	}

}
