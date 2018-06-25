package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage {

public static  void verifyelements(WebElement element,WebDriver driver)
{
	try{
	WebDriverWait wait=new WebDriverWait(driver,20);
	
	
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present",true);
	}
	catch(Exception e)
	{
		Reporter.log("element is not present",true);
		Assert.fail();
	}
	

	}
public static  void verifytitle(String title,WebDriver driver)
{
	try{
		
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.titleContains(title));
	Reporter.log("title is matching", true);
	}
	catch(Exception e)
	{
		Reporter.log("title is not matching", true);
		Assert.fail();
	}
	
}
}
