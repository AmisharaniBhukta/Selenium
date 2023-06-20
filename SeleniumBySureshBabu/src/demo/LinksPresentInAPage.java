package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksPresentInAPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		//driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		driver.findElement(By.linkText("Site Map")).click();
		
		List<WebElement> links=driver.findElements(By.linkText("Home"));
		System.out.println(links.size());
		
		driver.get("http://facebook.com/");
		List<WebElement> links1=driver.findElements(By.tagName("a"));
		System.out.println(links1.size());
		
		driver.close();
		

	}

}
