package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.LoginPage;
import Methods.SignupPage;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\AASel_1\\chromedriver_win32 (2)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://m.facebook.com/login.php?next=https%3A%2F%2Fm.facebook.com%2Fnotifications.php&refsrc=deprecated&_rdr");
		
		LoginPage login = new LoginPage(driver);
		login.sendpassword();
		login.sendpassword();
		login.clickonLoginButton();
		
		
		SignupPage login1 = new SignupPage();
		
		login1.sendcreatAccount();
		login1.sendfirstName();
		login1.senelastName();
		login1.nextbutton();
	}

}
