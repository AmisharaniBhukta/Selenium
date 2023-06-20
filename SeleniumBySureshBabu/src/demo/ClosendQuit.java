package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosendQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("http://primusbank.qedgetech.com/");
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		driver.close();
		driver.quit();

	}

}
