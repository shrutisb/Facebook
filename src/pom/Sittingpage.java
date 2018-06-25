package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Sittingpage extends Basepage
{
@FindBy(xpath="(//div[@class='linkWrap noCount'])[6]")
private WebElement blockngbtn;

public Sittingpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void block(WebDriver driver)
{
	Basepage.verifyelements(blockngbtn, driver);
	blockngbtn.click();
}
}
