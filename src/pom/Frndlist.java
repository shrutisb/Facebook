package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Frndlist extends Basepage
{
	@FindBy(linkText="See All Friends")
	private WebElement seeallfrnd;
	
	public Frndlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void frndlist()
	{
		seeallfrnd.click();
	}
	
}
