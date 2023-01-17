package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.Test;
import page.Objects.HeaderSection;

public class TestHeaderSection {

	WebDriver driver;
	String driverPath = "/usr/local/bin/chromedriver";

	@BeforeMethod

	public void setup() {

		System.setProperty("webdriver.chromedriver.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	////////////////////////////////////////////////////////// TEST HEADER SECTION ////////////////////////////////////////////////////////// //////////////////////////////////////////////////////////////

	@Test(priority = 0)
	public void test_title() {
		HeaderSection header_obj = new HeaderSection(driver);
		header_obj.verify_title();
	}

	// Test Header

	@Test(priority = 1)
	public void test_logo() {
		HeaderSection header_obj = new HeaderSection(driver);
		header_obj.verify_logo();
	}

	@Test(priority = 2)
	public void test_usecase() {
		HeaderSection header_obj = new HeaderSection(driver);
		header_obj.verify_usecases_option();
	}

	@Test(priority = 3)
	public void test_docs() {
		HeaderSection header_obj = new HeaderSection(driver);
		header_obj.verify_docs_option();
	}

	@Test(priority = 4)
	public void test_pricing() {
		HeaderSection header_obj = new HeaderSection(driver);
		header_obj.verify_pricing_option();
	}

	@Test(priority = 5)
	public void test_blogs() {
		HeaderSection header_obj = new HeaderSection(driver);
		header_obj.verify_blogs_option();
	}

	@Test(priority = 6)
	public void test_loginbtn() {
		HeaderSection header_obj = new HeaderSection(driver);
		header_obj.verify_login_button();
	}

	@Test(priority = 7)
	public void test_try_hdr_btn() {
		HeaderSection header_obj = new HeaderSection(driver);
		header_obj.verify_tryforfree_button();
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}

