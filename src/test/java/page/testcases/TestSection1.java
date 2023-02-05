package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsers.browser_setup;
import page.Objects.Section1;

public class TestSection1 extends browser_setup {

	////////////////////////////////////////////////////////// TEST SECTION-1 ////////////////////////////////////////////////////////////

	// Test main body
	@Test(priority = 0)
	public void test_smooth_toggle() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_smooth_toggle();
	}

	@Test(priority = 1)
	public void test_smooth_txt() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_smooth_txt();
	}

	@Test(priority = 2)
	public void test_scalable_toggle() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_scalable_toggle();
	}

	@Test(priority = 3)
	public void test_scalable_txt() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_scalable_txt();
	}

	@Test(priority = 4)
	public void test_secure_toggle() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_secure_toggle();
	}

	@Test(priority = 5)
	public void test_secure_txt() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_secure_txt();
	}

	@Test(priority = 6)
	public void test_body_title() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_body_title_txt();
	}

	@Test(priority = 7)
	public void test_body_description() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_body_description_txt();
	}

	// Test Body Section1

	@Test(priority = 8)
	public void test_sec1_txt() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_sec1_txt();
	}

	@Test(priority = 9)
	public void test_sec1_btn1() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_sec1_exploreBtn();
	}

	@Test(priority = 10)
	public void test_sec1_btn2() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_sec1_workBtn();
	}

	@Test(priority = 11)
	public void test_sec1_img() {
		Section1 sec1_obj = new Section1(driver);
		sec1_obj.verify_sec1_img();
	}

}
