package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
	}

}
