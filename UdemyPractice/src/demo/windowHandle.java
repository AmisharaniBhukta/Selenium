package demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
		//get window handle of current window and print it
		String handle1=driver.getWindowHandle();
		System.out.println(handle1);
		
		//get handles of all open windows
		Set<String> handle2=driver.getWindowHandles();
		System.out.println(handle1);
		
		driver.quit();

	}

}
