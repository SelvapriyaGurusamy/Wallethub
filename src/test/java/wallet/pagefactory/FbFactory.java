package wallet.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wallet.utils.BaseClass;

public class FbFactory extends BaseClass {
	public FbFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailid;

	public WebElement getEmailid() {
		return emailid;
	}
	
	@FindBy(id="pass")
	private WebElement password1;

	public WebElement getPassword1() {
		return password1;
	}
	
	@FindBy(id="loginbutton")
	private WebElement loginbutton;

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
