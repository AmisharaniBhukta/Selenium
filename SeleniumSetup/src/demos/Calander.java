package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		//System.out.println(driver.findElement(By.className("ctl00$mainContent$view_date2")).isEnabled());
	}

}
