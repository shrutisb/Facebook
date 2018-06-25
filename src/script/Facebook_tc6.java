package script;

import org.testng.annotations.Test;

import generic.Base_tset;
import generic.Excel;
import pom.Homepage;
import pom.Loginpage;
import pom.Messagerpage;

public class Facebook_tc6 extends Base_tset
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
Thread.sleep(9000);
Homepage h=new Homepage(driver);
h.msgr(driver);
Messagerpage m=new Messagerpage(driver);



}
}
