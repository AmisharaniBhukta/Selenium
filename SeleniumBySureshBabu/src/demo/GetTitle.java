package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		
		driver.manage().deleteAllCookies();
		
	    driver.findElement(By.linkText("Gmail")).click();
	    String currentUrl= driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    
	    String expectedValue="Gmail";
	    
	    String actualValue=driver.getTitle();
	    
	    if(actualValue.toLowerCase().contains(expectedValue.toLowerCase()))
	    {
	    	System.out.println("Test is pass");
	    }
	    else {System.out.println("Test is fail");}
		

	    driver.close();
	}

}
