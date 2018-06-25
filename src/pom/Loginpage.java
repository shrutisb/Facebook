package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Loginpage extends Basepage

{
@FindBy(id="email")
private WebElement eamiltb;

@FindBy(id="pass")
private WebElement passtb;

@FindBy(xpath="//input[@value='Log In']")
private WebElement loginbtn;
 
public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void email(String us)
{
	eamiltb.sendKeys(us);
}
public void password(String pwd)
{
	passtb.sendKeys(pwd);
}
public void login(WebDriver driver)
{
	Basepage.verifyelements(loginbtn, driver);
			
	loginbtn.click();
}
}
