package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//open 
		String url="https://www.economist.com/";
		driver.get(url);
		
		//get pagetitle name
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		
		//get title length
		int length=driver.getTitle().length();
		System.out.println(length);
		
		//get page url
		String pgUrl=driver.getCurrentUrl();
		System.out.print(pgUrl);
		
		if(pgUrl.equals(url))
		{
			System.out.println("Correctr url is opened");
		}else {	System.out.println("Incorrect url");}
		
		//get pagesource
		String pgSource=driver.getPageSource();
		System.out.println(pgSource);
		
		//get the length of page source
		int pgSourceLength=driver.getPageSource().length();
		System.out.println(pgSourceLength);
		
		//close the browser
		//driver.close();
		driver.quit();

	}

}
