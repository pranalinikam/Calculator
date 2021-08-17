package calculatortesting;

import org.testng.annotations.Test;

public class Substraction extends Utility {
	objectrepository objrepo=new objectrepository();	
	@Test(priority=1)
	public void intidriver()
	{
		driversetting();
	}
	
	@Test(priority=2)
	public void navigate() 
	{
		findelementmethod(objrepo.btn2).click();
		findelementmethod(objrepo.btn3).click();
		findelementmethod(objrepo.btn4).click();
		findelementmethod(objrepo.btn8).click();
		findelementmethod(objrepo.btn2).click();
		findelementmethod(objrepo.btn3).click();
		
		findelementmethod(objrepo.btnsubstraction).click();
		findelementmethod(objrepo.btnsubstraction).click();
		
		findelementmethod(objrepo.btn2).click();
		findelementmethod(objrepo.btn3).click();
		findelementmethod(objrepo.btn0).click();
		findelementmethod(objrepo.btn9).click();
		findelementmethod(objrepo.btn4).click();
		findelementmethod(objrepo.btn8).click();
		findelementmethod(objrepo.btn2).click();
		findelementmethod(objrepo.btn3).click();
		
	}
}
