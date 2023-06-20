package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDateFromCalender {

	private static final int May = 0;

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 	WebDriver driver=new ChromeDriver();
		 	
		 	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		 	driver.get("http://flights.qedgetech.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("Register")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.name("dob")).click();
			
			String dob="21/May/1998";
			String[] temp= dob.split("/");
			String dt=temp[0];
			String mon=temp[1];
			String yr=temp[2];
			
			Thread.sleep(2000);
			
			WebElement month=driver.findElement(By.className("ui-datepicker-month"));
			Select mlist=new Select(month);
			mlist.selectByVisibleText(mon);
			
			Thread.sleep(2000);
			
			WebElement year=driver.findElement(By.className("ui-datepicker-year"));
			Select ylist=new Select(year);
			ylist.selectByVisibleText(yr);
			
			Thread.sleep(2000);
			//find date
			WebElement calender=driver.findElement(By.className("ui-datepicker-calendar"));	
			
			Thread.sleep(2000);
			
			List<WebElement> rows=driver.findElements(By.tagName("tr"));
			for(int i=0; i<rows.size();i++)
			{
				List<WebElement> cols=driver.findElements(By.tagName("td"));
				for(int j=0; j<cols.size();j++)
				{
					String caldt=cols.get(j).getText();
					if(caldt.equals(dt))
					{
						cols.get(j).click();
						break;
					}
				}
			}
			
			
			
			
			
			

	}

}
