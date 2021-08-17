package calculatortesting;

import org.testng.annotations.Test;

public class multiplication extends Utility {
  
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
		findelementmethod(objrepo.btn2).click();
		findelementmethod(objrepo.btn3).click();
		
		findelementmethod(objrepo.btnmultiplication).click();
		
		findelementmethod(objrepo.btn5).click();
		findelementmethod(objrepo.btn2).click();
		findelementmethod(objrepo.btn5).click();
	}
}
