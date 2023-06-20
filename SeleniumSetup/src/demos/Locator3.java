package demos;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver","chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		
		//Traverse from parent element to child element using xpath
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//div/button[1]/following-sibling::button[1]
		//move from paarent to child and child to sibling
		System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());

		//child to parent (//button[1]/parent::div)
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
	}

}
