package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	@FindBy (xpath ="//a[@id='signup-button']")
	private WebElement createNewAccount;
	
	@FindBy (xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy (xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Nextbutton;
	
	@FindBy (xpath ="//select[@id='day']")
	private WebElement birthDate;
	
	//Select s=new Select(birthDate);
	//s.selectByvalue();
	
	
	public  void SignupPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void sendcreatAccount(){
		createNewAccount.click();
		
	}
	public void sendfirstName() {
		firstName.sendKeys("sonu");
	}
	public void senelastName() {
		lastName.sendKeys("sd123");
	}
	public void nextbutton() {
		Nextbutton.click();
	}
	
}
