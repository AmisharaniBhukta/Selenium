package demos;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver","chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open the page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//1>find element by id
		driver.findElement(By.id("inputUsername")).sendKeys("Amisha");
		
		//2>find element by name
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		//3>find element by css locator
		driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.className("p.error")).getText());
		
		//4>find element by Link text
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//waiting time
		Thread.sleep(2000);
		
		//5> find element by xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		
		//clear method is used to clear the text
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		//index method use in xpath selector
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("sonali@gmail.com");
		
		//index method used in css-selector
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		
		//traver parent to child in xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7008815432");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//parent child traverse in css selector
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("rahulshettyacademy");
		

	}

}
