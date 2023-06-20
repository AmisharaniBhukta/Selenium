package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumConfig {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		
		//Lunch the website
		String baseUrl="https://www.google.com/";
		driver.get(baseUrl);
		
		//Get current page title
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		
		//Get currenturl
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//Get pagesource of Current page
		String pgSource=driver.getPageSource();
		System.out.println(pgSource);
		
		//Close current window
		driver.close();
		
		//Close all rfelated windows and kill all sessions
		driver.quit();
		

	}

}
