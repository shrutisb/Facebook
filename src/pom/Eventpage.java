package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Eventpage extends Basepage
{
@FindBy(xpath="//a[.='Film']")
private WebElement filmlink;

@FindBy(xpath="//a[.='Dance']")
private WebElement dancelink;

public Eventpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void film()
{
	filmlink.click();
}
public void dance()
{
	//JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,100)");
	//Thread.sleep(3000);
	dancelink.click();
	
}
}
