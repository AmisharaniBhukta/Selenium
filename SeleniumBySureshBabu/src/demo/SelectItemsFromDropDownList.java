package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemsFromDropDownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(5000);
		
		WebElement dropdownListDay=driver.findElement(By.id("day"));
		
		//object creation
		Select dropdown = new Select(dropdownListDay);
		
		//select by value
		dropdown.selectByValue("4");
		
		//driver.close();

	}

}
