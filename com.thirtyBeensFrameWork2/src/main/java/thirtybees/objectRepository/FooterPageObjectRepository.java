package thirtybees.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import thirtybees.base.LogBase;

public class FooterPageObjectRepository extends LogBase {
WebElement driver;


@FindBy(xpath="//*[@id='blockcms-footer']/nav/ul/li")
public List<WebElement> informationCols;
	
@FindBy(xpath="//*[@id='blockmyaccountfooter']/ul/li")	
public List<WebElement> myAccountCols;
	
@FindBy(xpath="//*[@id='blockcontactinfos']/address/ul/li")	
public List<WebElement> storeInformationCols;	

@FindBy(xpath="//a[@title='Specials']")
public WebElement specialElement;

@FindBy(xpath="//a[@title='New products']")
public WebElement newProducts;

@FindBy(xpath="//a[@title='Top sellers']")
public WebElement topSellersElement;

@FindBy(xpath="//a[@title='Our stores']")
public WebElement ourStoreElement;

@FindBy(xpath="//a[@title='Sitemap']")
public WebElement SitemapElement;

@FindBy(xpath="//a[@title='Manage my customer account']")
public WebElement myAccount;

@FindBy(xpath="//a[@title='My credit slips']")
public WebElement myCreditSleep;

@FindBy(xpath="//a[@title='Sign out']")
public WebElement logOut;

@FindBy(xpath="//a[@title='My addresses']")
public WebElement myAddress;


@FindBy(xpath="//a[@title='Facebook']")
public WebElement facebook;

@FindBy(id="email")
public WebElement email;

@FindBy(id="pass")
public WebElement password;

@FindBy(xpath="//input[@data-testid='royal_login_button']")
public WebElement Login;

@FindBy(xpath="//i[@class='icon icon-twitter icon-2x icon-fw']")
public WebElement TwitterEle;

@FindBy(id="newsletter-input")
public WebElement newsletterInput;

@FindBy(xpath="//button[@aria-label='Sign up']")
public WebElement clickOn_signUp;

@FindBy(xpath="//div[@class='alert alert-danger']")
public WebElement alertFor_alreadyRegister;

@FindBy(xpath="//div[@class='alert alert-success']")
public WebElement alertFor_newRegister;
}
