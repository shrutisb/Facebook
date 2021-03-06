package script;

import org.testng.annotations.Test;

import generic.Base_tset;
import generic.Excel;
import pom.Homepage;
import pom.Loginpage;
import pom.Messagerpage;

public class Facebook_tc3 extends Base_tset
{
@Test
public void test() throws InterruptedException
{
	String un = Excel.Excelsheet(Path, "Sheet1", 1, 1);
	String p = Excel.Excelsheet(Path, "Sheet1", 1, 2);
	Loginpage l=new Loginpage(driver);
	l.email(un);
	l.password(p);
	l.login(driver);
	Thread.sleep(10000);
	Homepage h=new Homepage(driver);
	h.msgr(driver);
	Thread.sleep(6000);
	h.setting();
	Messagerpage mp=new Messagerpage(driver);
	mp.delete();
	Thread.sleep(6000);
	mp.cancle();
	Thread.sleep(6000);
	h.profile(driver);
	h.downbtn();
	Thread.sleep(6000);
	h.logout(driver);
	Thread.sleep(6000);
}
}
