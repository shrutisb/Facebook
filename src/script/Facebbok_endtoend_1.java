package script;

import org.testng.annotations.Test;

import generic.Base_tset;
import generic.Excel;
import pom.Frndlist;
import pom.Homepage;
import pom.Loginpage;
import pom.Profilepage;

public class Facebbok_endtoend_1  extends Base_tset{

	@Test
	public void test() throws InterruptedException 
	{
		String un = Excel.Excelsheet(Path, "Sheet1", 1, 1);
		String p = Excel.Excelsheet(Path, "Sheet1", 1, 2);
		Loginpage l=new Loginpage(driver);
		l.email(un);
		l.password(p);
		l.login(driver);
		Thread.sleep(9000);
		Homepage h=new Homepage(driver);
		h.seeMore(driver);
		h.frndlist(driver);
		Frndlist f=new Frndlist(driver);
		Thread.sleep(6000);
		f.frndlist();
		Profilepage prf=new Profilepage(driver);
		Thread.sleep(10000);
		prf.searchfrd("Sweety singh(rimjhim)");
		Thread.sleep(6000);
				
	}
	
	

	

	

}
