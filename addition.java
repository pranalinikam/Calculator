package calculatortesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addition extends Utility {
 
	objectrepository objrepo=new objectrepository();
		
	@Test(priority=1)
	public void intidriver()
	{
		driversetting();
	}
	
	@Test(priority=2)
	public void navigate() 
	{
		findelementmethod(objrepo.btnsubstraction).click();
		findelementmethod(objrepo.btn2).click();
		findelementmethod(objrepo.btn3).click();
		findelementmethod(objrepo.btn4).click();
		findelementmethod(objrepo.btn2).click();
		findelementmethod(objrepo.btn3).click();
		findelementmethod(objrepo.btn4).click();
		
		findelementmethod(objrepo.btnaddition).click();
		
		findelementmethod(objrepo.btn3).click();
		findelementmethod(objrepo.btn4).click();
		findelementmethod(objrepo.btn5).click();
		findelementmethod(objrepo.btn3).click();
		findelementmethod(objrepo.btn4).click();
		findelementmethod(objrepo.btn5).click();

	}
	}
