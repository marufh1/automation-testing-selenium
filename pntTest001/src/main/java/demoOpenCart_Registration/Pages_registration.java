package demoOpenCart_Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages_registration {
	WebDriver driver;

	@FindBy(id = "input-firstname")
	WebElement firstname;
	
	@FindBy(id = "input-lastname")
	WebElement lastname;
	
	@FindBy(id = "input-email")
	WebElement email;

	@FindBy(id = "input-telephone")
	WebElement telephone;
	
	@FindBy(id = "input-password")
	WebElement password;
	
	@FindBy(id = "input-confirm")
	WebElement confirm_password;
	
	@FindBy(name = "agree")
	WebElement license_aggrement_agree;
	
	@FindBy(css="input[type='submit']")
	WebElement continue_registration;
	
	@FindBy(css = "#content > h1")
	WebElement header_after_reg;
	
	public Pages_registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void provide_firstname(String fname) {
		firstname.sendKeys(fname);
		
	}

	public void provide_lastname(String lname) {
		lastname.sendKeys(lname);
		
	}

	public void provide_email(String emal) {
		email.sendKeys(emal);
		
	}

	public void provide_telephone(String tel) {
		telephone.sendKeys(tel);
		
	}

	public void provide_password(String pass) {
		password.sendKeys(pass);
		
	}

	public void provide_confirm_password(String conPass) {
		confirm_password.sendKeys(conPass);
		
	}

	public void provide_license_agred() {
		license_aggrement_agree.click();
		
	}

	public void Click_continueButton() {
		continue_registration.click();
		
	}
}
