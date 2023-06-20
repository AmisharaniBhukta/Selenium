package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with selecttag findthe location of the dropedownlist
		WebElement staticdropdownlist=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//create object
		Select dropdown = new Select(staticdropdownlist);
		
		//select from dropdown list by index
		dropdown.selectByIndex(3);
		
		//select 1st selected option from dropdown list
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		
		//select by visibility
		dropdown.selectByVisibleText("AED");
		
		Thread.sleep(2000);
		
		//select by value
		dropdown.selectByValue("INR");
		

	}

}
