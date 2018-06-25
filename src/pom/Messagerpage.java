package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Messagerpage extends Basepage
{
@FindBy(xpath="(//span[.='Delete'])[2]")
private WebElement deletebtn;

@FindBy(xpath="//button[.='Cancel']")
private WebElement canclebtn;

@FindBy(xpath="//div[@class='_1mf _1mj']")
private WebElement smsbtn;

 public Messagerpage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
public void delete()
{
	deletebtn.click();
}
public void cancle()
{
	canclebtn.click();
}
public void sms(String sm,WebDriver driver)
{
	Basepage.verifyelements(smsbtn,driver);
	smsbtn.sendKeys(sm);
}
}
