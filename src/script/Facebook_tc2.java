package script;

import org.testng.annotations.Test;

import generic.Base_tset;
import generic.Excel;
import pom.Homepage;
import pom.Loginpage;

public class Facebook_tc2 extends Base_tset
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
	//driver.switchTo().alert();
	Homepage h=new Homepage(driver);
	h.msgr(driver);
	Thread.sleep(8000);
	driver.navigate().back();
	Thread.sleep(8000);
	h.market();
	Thread.sleep(8000);
	driver.navigate().back();
	Thread.sleep(8000);
	h.downbtn();
	Thread.sleep(8000);
	h.logout(driver);
	Thread.sleep(5000);
}
}
