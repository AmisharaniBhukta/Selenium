package demos;
import java.time.Duration;

//import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver","chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String password=getpassword(driver);
		
		//open the page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//1>find element by id
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//2>find element by name
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		//3>find element by css locator
		driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.className("p.error")).getText());
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		driver.close();

	}

	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		
		
	//	System.getProperty("webdriver.chrome.driver","chromedriver.exe ");
	//	WebDriver driver=new ChromeDriver();
		
		//open the page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Forgot Password
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//parent child traverse in css selector
		String passwordtext=(driver.findElement(By.cssSelector("form p")).getText());
		String[] passwordArray=passwordtext.split("'");
		String password=passwordArray[1].split("'")[0];
		return password;
		
		
		
		
	}
}
