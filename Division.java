package calculatortesting;

import org.testng.annotations.Test;

public class Division extends Utility {

	objectrepository objrepo=new objectrepository();	
	@Test(priority=1)
	public void intidriver()
	{
		driversetting();
	}
	
	@Test(priority=2)
	public void navigate() 
	{
		findelementmethod(objrepo.btn4).click();
		findelementmethod(objrepo.btn0).click();
		findelementmethod(objrepo.btn0).click();
		findelementmethod(objrepo.btn0).click();
		
		findelementmethod(objrepo.btndivision).click();
		
		findelementmethod(objrepo.btn2).click();
		findelementmethod(objrepo.btn0).click();
		findelementmethod(objrepo.btn0).click();
	}
}
