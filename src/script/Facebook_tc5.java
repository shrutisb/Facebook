package script;

import org.testng.annotations.Test;

import generic.Base_tset;
import generic.Excel;
import pom.Eventpage;
import pom.Homepage;
import pom.Loginpage;

public class Facebook_tc5 extends Base_tset
{
@Test
public void action() throws InterruptedException
{
	String un = Excel.Excelsheet(Path, "Sheet1", 1, 1);
	String p = Excel.Excelsheet(Path, "Sheet1", 1, 2);
	Loginpage l=new Loginpage(driver);
	l.email(un);
	l.password(p);
	l.login(driver);
	Thread.sleep(10000);
		
	Homepage h=new Homepage(driver);
		h.event();
		Thread.sleep(5000);
		
		Eventpage e=new Eventpage(driver);
		Thread.sleep(7000);
	e.film();
	Thread.sleep(8000);
	driver.navigate().back();
	Thread.sleep(8000);
	e.dance();
	Thread.sleep(8000);

	h.downbtn();
	Thread.sleep(4000);
	h.logout(driver);
	Thread.sleep(3000);
	
		
}
}
