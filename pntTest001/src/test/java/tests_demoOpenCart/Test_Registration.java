package tests_demoOpenCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demoOpenCart_Registration.Pages_registration;

public class Test_Registration {
	public WebDriver driver = new ChromeDriver();
	
	Pages_registration demoOpencartReg = new Pages_registration(driver);
	
	@BeforeTest
	public void beforeTest() {
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test 
	public void registration_Poisitive() {
		demoOpencartReg.provide_firstname("Maruf");
		demoOpencartReg.provide_lastname("Hossain");
		demoOpencartReg.provide_email("mhossain@mail.com");
		demoOpencartReg.provide_telephone("123123");
		demoOpencartReg.provide_password("12345");
		demoOpencartReg.provide_confirm_password("12345");
		demoOpencartReg.provide_license_agred();
		demoOpencartReg.Click_continueButton();
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);
	}
}
