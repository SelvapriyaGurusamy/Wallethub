package wallet.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wallet.utils.BaseClass;

public class pageFactory extends BaseClass {

	public pageFactory() {
		
			PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(xpath="(//span[text()='Reviews'])[1]")
	private WebElement reviews;
	public WebElement getReviews() {
		return reviews;
		}
	
	@FindBy(xpath="(//*[name()='svg']/*[name()='g']/*[name()='path' and @fill='#4ae0e1'])[14]")
	private WebElement starshighlight;
	public WebElement getStarsHighlight() {
		return starshighlight;
		
	}
	@FindBy(xpath="(//span[@class='dropdown-placeholder'])[2]")
	private WebElement select;
	public WebElement getSelect() {
		return select;
		
	}
	
	@FindBy(xpath="//li[text()='Health Insurance']")
	private WebElement healthinsurance;
	public WebElement getHealthInsurance() {
		return healthinsurance;
		
	}
	
	@FindBy(xpath="//div[@class='android']/*[name()='textarea']")
	private WebElement typereviewcommands;
	public WebElement getTypeReviewCommands() {
		return typereviewcommands;
		
	}
	
	@FindBy(xpath="//div[text()='Submit']")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement clicklogin;
	public WebElement getClickLogin() {
		return clicklogin;
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement emailaddress;
	public WebElement getEmailAddress() {
		return emailaddress;
	}
	
	
	@FindBy(xpath="(//input[@type='password']")
	private WebElement password;
	public WebElement getPassWord() {
		return password;
	}
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement loginbutton;
	public WebElement getLoginButton() {
		return loginbutton;
		
	}
	
	@FindBy(xpath="//span[text()='selvapriyamuruganece']")
	private WebElement gotoprofile;
	public WebElement getGoToProfile() {
		return gotoprofile;
		
	}
	
	@FindBy(xpath="//a[text()='Profile']")
	private WebElement profiletag;
	public WebElement getProfileTag() {
		return profiletag;
		
	}
	
	@FindBy(xpath="//a[text()='Test Insurance Company']")
	private WebElement testinsurance;
	public WebElement getTestInsurance() {
		return testinsurance;
		
	}
	
	@FindBy(xpath="//article[@class='rvtab-citem rvtab-item-user ng-enter-element")
	private WebElement myreview;
	public WebElement getMyReview() {
		return myreview;
		
	}
	
}
