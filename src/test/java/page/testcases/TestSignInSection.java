package page.testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod; 
import page.Objects.SignInSection;

public class TestSignInSection {

	WebDriver driver;
	String driverPath = "/usr/local/bin/chromedriver";

	@BeforeMethod

	public void setup() {

		System.setProperty("webdriver.chromedriver.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void test_vdotok_logo() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_vdotok_logo();
	}

	@Test(priority = 1)
	public void test_signIn_txt() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_signIn_txt();
	}
	
	@Test(priority = 2)
	public void test_descriptive_txt() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_descriptive_txt();
	}

	@Test(priority = 3)
	public void test_email_field() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_email_field("k164080@nu.edu.pk");
	}
	
	@Test(priority = 4)
	public void test_password_field() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_password_field("Armish1234$");
	}

	@Test(priority = 5)
	public void test_password_type() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_password_type("Armish1234$");
	}

	@Test(priority = 6)
	public void test_forgotPassword_option() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_forgotPassword_option();
	}
	
	@Test(priority = 7)
	public void test_PasswordVisibility_icon() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_PasswordVisibility_icon("Armish1234$");
	}
	
	@Test(priority = 8)
	public void verify_login_button() throws InterruptedException {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_login_button("k164080@nu.edu.pk", "Armish1234$");
	}
	
	@Test(priority = 9)
	public void test_bottom_txt() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_bottom_txt();
	}
	
	@Test(priority = 10)
	public void test_signIn_option() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_signUp_option();
	}
	
	@Test(priority = 10)
	public void test_cross_icon() {
		SignInSection signin_obj = new SignInSection(driver);
		signin_obj.verify_cross_icon();
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}

}