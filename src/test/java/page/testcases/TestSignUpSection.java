package page.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsers.browser_setup;
import page.Objects.SignInSection;
import page.Objects.SignUpSection;

public class TestSignUpSection extends browser_setup {
/*
	@Test(priority = 0)
	public void test_vdotok_logo() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_vdotok_logo();
	}
	
	@Test(priority = 1)
	public void test_title_text() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_title_text();
	}
	
	@Test(priority = 2)
	public void test_first_name() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_first_name();
	}
		
	@Test(priority = 3)
	public void test_last_name() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_last_name();
	}
	
	@Test(priority = 4)
	public void test_email() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_email();
	}
	
	@Test(priority = 5)
	public void verify_country() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_country();
	}
	
	@Test(priority = 6)
	public void test_CountryDropdown() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_CountryDropdown();
	}
	
	@Test(priority = 7)
	public void test_password_field() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_password_field();
	}
		
	@Test(priority = 8)
	public void test_PasswordVisibility_icon() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_PasswordVisibility_icon();
	}
*/	
	@Test(priority = 9)
	public void test_signUp_form() throws IOException {
		SignUpSection signUp_obj = new SignUpSection(driver);	
		signUp_obj.verify_signUp_form();
	}
/*
	@Test(priority = 10)
	public void test_bottom_txt() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_bottom_txt();
	}
	
	@Test(priority = 11)
	public void test_bottom_checkbox() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_bottom_checkbox();
	}
	
	@Test(priority = 12)
	public void test_signUp_option() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_signUp_option();
	}
	

	@Test(priority = 13)
	public void test_cross_icon() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_cross_icon();
	}
	
	@Test(priority = 14)
	public void test_privacy_policy() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_privacy_policy();
	}
	
	@Test(priority = 15)
	public void test_TermsOfServices() {
		SignUpSection signUp_obj = new SignUpSection(driver);
		signUp_obj.verify_TermsOfServices();
	}
*/
}