package demos;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddIteamsToCard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(3000);

		String[] itemsNeeded= {"Cucumber","carrot"};
		addItems(driver,itemsNeeded);

			
		}



	private static void addItems(WebDriver driver, String[] itemsNeeded) {
		// TODO Auto-generated method stub
		
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<=products.size();i++)
		{
			
			
			//format the actual vegetable names using split(Cucumber - 1 Kg=Cucumber)
			String[]name=products.get(i).getText().split("-");
			
			//Remove all the whitespaces
			String formatedName=name[0].trim();
			
			//check items are present or not
			
			//covert array to arraylist
			 List al = Arrays.asList(itemsNeeded);
			
			 int j=0;
			 
			 //search for multi products 
			if(al.contains("formatedName")) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();	
				
				if(j==itemsNeeded.length) {
					break;
				}
			}
		}
	}
}
		

			
		
	

	
	


