package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Profilepage  extends Basepage
{
	@FindBy(xpath="//input[@placeholder='Search for your friends']")
	private WebElement searchforfrndbox;
	@FindBy(xpath="//a[.='Photos']")
	private WebElement photobtn;
	
	public Profilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void photo(WebDriver driver)
	{
		Basepage.verifyelements(photobtn, driver);
		photobtn.click();
	}
	public void searchfrd(String frnd)
	{
		searchforfrndbox.sendKeys(frnd);
	}
}
