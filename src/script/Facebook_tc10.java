package script;

import org.testng.annotations.Test;

import generic.Base_tset;
import generic.Excel;
import pom.Homepage;
import pom.Loginpage;
import pom.Sittingpage;

public class Facebook_tc10 extends Base_tset
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
	h.setting1(driver);
	Sittingpage s=new Sittingpage(driver);
s.block(driver);

h.downbtn();
h.logout(driver);

}
}

