package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.Test;

import browsers.browser_setup;
import page.Objects.HeaderSection;
import page.Objects.UseCasesSection;

public class TestUseCasesSection extends browser_setup {

	////////////////////////////////////////////////////////// TEST HEADER SECTION ////////////////////////////////////////////////////////// //////////////////////////////////////////////////////////////

	@Test(priority = 0)
	public void test_liveShopping_option_txt() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_liveShopping_option_txt();
	}
    
	@Test(priority = 1)
	public void test_liveShopping_option_icon() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_liveShopping_option_icon();
	}
	
	@Test(priority = 2)
	public void test_healthtech_option_txt() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_healthtech_option_txt();
	}
    
	@Test(priority = 3)
	public void test_healthtech_option_icon() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_healthtech_option_icon();
	}
	
	@Test(priority = 4)
	public void test_social_option_txt() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_social_option_txt();
	}
    
	@Test(priority = 5)
	public void test_social_option_icon() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_social_option_icon();
	}
	
	@Test(priority = 6)
	public void test_edtech_option_txt() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_edtech_option_txt();
	}
    
	@Test(priority = 7)
	public void test_edtech_option_icon() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_edtech_option_icon();
	}
	
	@Test(priority = 8)
	public void test_bottom_text() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_bottom_text();
	}
    
	@Test(priority = 9)
	public void test_ContactUs_button() {
		UseCasesSection use_obj = new UseCasesSection(driver);
		use_obj.verify_ContactUs_button();
	}

}

