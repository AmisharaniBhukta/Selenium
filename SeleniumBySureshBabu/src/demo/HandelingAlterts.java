package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingAlterts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://primusbank.qedgetech.com/");
		 
		 driver.findElement(By.name("txtuId")).sendKeys("Amisha");
		 driver.findElement(By.name("txtPword")).sendKeys("amisha123");
		 driver.findElement(By.name("login")).click();	
			
		// String alert=driver.switchTo().alert().getText();
		 //System.out.println(alert);
		 
		// driver.switchTo().alert().accept();

		 Alert alert=driver.switchTo().alert();
		  if(alert.getText().contains("InCorrect"))
		  {
			alert.accept();
		  }
		  else {
			  alert.dismiss();
		  }
	}

}
