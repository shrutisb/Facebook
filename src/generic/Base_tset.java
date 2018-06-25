package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_tset implements Constant {

	
	
	public	WebDriver driver;

@BeforeMethod
public void openapp()
{
System.setProperty(GECKO_KEY, GECKO_VALUE);
driver=new FirefoxDriver();
String Url=Excel.Excelsheet(Path, "Sheet1", 1, 0);
driver.get(Url);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
@AfterMethod
public void closeapp()
{
	driver.quit();
}
	}

