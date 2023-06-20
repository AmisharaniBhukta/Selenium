package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRowsInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/tools/forex");
		
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.className("dataTable"));
		
		List<WebElement> lists=table.findElements(By.tagName("tr"));
		
		System.out.println(lists.size());
		
		for(int i=0; i<lists.size();i++)
		{
			System.out.println(lists.get(i).getText());
		}
		
		

	}

}
