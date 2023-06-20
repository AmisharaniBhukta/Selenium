package demos;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.getProperty("webdriver.chrome.driver","chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		driver.get("http://google.com");//get is used for the fully loaded the page
		
		//navigate to another page
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		//back to the page
		driver.navigate().back();
		
		//Forward to the page
		driver.navigate().forward();
		
		driver.close();

	}

}
