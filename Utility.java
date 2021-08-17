package calculatortesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Utility {
 
  WebDriver driver;
  public void driversetting() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
  }
  
	public WebElement findelementmethod(By objby)
	{
		WebElement temp=driver.findElement(objby);
		return temp;
	}
}
