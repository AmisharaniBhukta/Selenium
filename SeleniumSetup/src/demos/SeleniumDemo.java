package demos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring respective driver 
	System.getProperty("webdriver.chrome.driver","chromedriver.exe ");
	
	 WebDriver driver= new ChromeDriver();
	
	 driver.get("https://google.com");
	 driver.navigate().to("https://rahulshettyacademy.com/");
	 driver.navigate().back();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	// System.out.println(driver.getTitle());
	// System.out.println(driver.getCurrentUrl());
	//Thread.sleep(2000);
	
	// driver.get("https://facebook.com");
	 //driver.navigate().to("http://facebook.com");
	 
	 //driver.quit();
	//driver.close();

	}

}
