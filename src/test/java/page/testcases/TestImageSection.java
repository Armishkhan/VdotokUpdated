package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsers.browser_setup;
import page.Objects.ImageSection;

public class TestImageSection extends browser_setup {

	////////////////////////////////////////////////////////// TEST IMAGE-SECTION /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// Test Image Section
	@Test(priority = 0)
	public void test_image_section_txt() {
		ImageSection imgSec_obj = new ImageSection(driver);
		imgSec_obj.verify_text();
	}

	@Test(priority = 1)
	public void test_right_image() {
		ImageSection imgSec_obj = new ImageSection(driver);
		imgSec_obj.verify_image();
	}

	@Test(priority = 2)
	public void test_sec1_tryBtn() {
		ImageSection imgSec_obj = new ImageSection(driver);
		imgSec_obj.verify_sec1_tryBtn();
	}

	@Test(priority = 3)
	public void test_sec1_DemoBtn() {
		ImageSection imgSec_obj = new ImageSection(driver);
		imgSec_obj.verify_sec1_DemoBtn();
	}

}
