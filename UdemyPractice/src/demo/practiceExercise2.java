package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		String url="https://simple.wikipedia.org/wiki/Main_Page";
		driver.get(url);
		
		//find the help and click on it
		driver.findElement(By.linkText("Help")).click();
		
		//back to the previous page
		driver.navigate().back();
		
		//go backto help page
		driver.navigate().forward();
		
		driver.navigate().to(url);
		
		//refresh the command
		driver.navigate().refresh();
		
		driver.quit();
		
		

	}

}
