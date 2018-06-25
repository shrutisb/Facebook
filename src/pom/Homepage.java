package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Homepage extends Basepage
{
@FindBy(xpath="(//span[.='Settings'])[2]")
private WebElement Sittingbtn;
@FindBy(xpath="//div[.='Friend lists']")
private WebElement friendlist;

@FindBy(xpath="//div[@id='userNavigationLabel']")
private WebElement ddown;

@FindBy(xpath="//div[.='Messenger']")
private WebElement mssgrbtn;

@FindBy(xpath="//div[.='Marketplace']")
private WebElement mrktbtn;

@FindBy(xpath="(//span[@class='_54nh'])[9]")
private WebElement logoutbtn;

@FindBy(xpath="(//div[@class='_5blh _4-0h'])[22]")
private WebElement settng;

@FindBy(xpath="(//span[.='Er Shruti'])[2]")
private WebElement profilebtn;

@FindBy(xpath="//div[@id='fbNotificationsJewel']")
private WebElement notificationbtn;
@FindBy(xpath="(//div[@class='linkWrap noCount'])[5]")
private WebElement eventbtn;
@FindBy(xpath="//div[.='Memories']")
private WebElement memoriesbtn;
@FindBy(xpath="//div[.='Pages']")
private WebElement pagebtn;
@FindBy(xpath="//div[.='Saved']")
private WebElement savebtn;
@FindBy(xpath="//a[.='Photos']")  
private WebElement photobtn;
@FindBy(xpath="(//a[.='See more...'])[2]")   
private WebElement seemorebtn;

public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void seeMore(WebDriver driver)
{
	Basepage.verifyelements(seemorebtn, driver);
	seemorebtn.click();
}
public void photo(WebDriver driver)
{
	Basepage.verifyelements(photobtn, driver);
	photobtn.click();
}
public void setting1(WebDriver driver)
{
	Basepage.verifyelements(Sittingbtn, driver);
	Sittingbtn.click();
}
public void saved(WebDriver driver)
{
	Basepage.verifyelements(savebtn, driver);
	savebtn.click();
}
public void offer(WebDriver driver)
{
	Basepage.verifyelements(pagebtn, driver);
	pagebtn.click();
}
public void frndlist(WebDriver driver)
{
	Basepage.verifyelements(friendlist, driver);
	friendlist.click();
}
public void downbtn()
{
	ddown.click();
}
public void msgr(WebDriver driver)
{
	Basepage.verifyelements(mssgrbtn, driver);
	mssgrbtn.click();	
}
public void market()
{
	mrktbtn.click();
}
public void logout(WebDriver driver)
{
	Basepage.verifyelements(logoutbtn, driver);
	logoutbtn.click();
}
public void setting()
{
	settng.click();
}
public void profile(WebDriver driver)
{
	Basepage.verifyelements(profilebtn, driver);
	profilebtn.click();	
}
public void notification()
{
	notificationbtn.click();
}
public void event()
{
	eventbtn.click();
}
public void memories(WebDriver driver)
{
	Basepage.verifyelements(memoriesbtn, driver);
	memoriesbtn.click();
}
}
