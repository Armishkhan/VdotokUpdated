package page.testcases;

import org.testng.annotations.Test;
import browsers.browser_setup;
import page.Objects.LiveShoppingSection1;

public class TestLiveShoppingSection1 extends browser_setup {

	////////////////////////////////////////////////////////// TEST HEADER SECTION////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test(priority = 0)
	public void test_sec1_txt() {
		LiveShoppingSection1 LS1_obj = new LiveShoppingSection1(driver);
		LS1_obj.verify_sec1_txt();
	}

	@Test(priority = 1)
	public void test_sec1_startButton() {
		LiveShoppingSection1 LS1_obj = new LiveShoppingSection1(driver);
		LS1_obj.verify_sec1_startButton();
	}

	@Test(priority = 2)
	public void test_ceo_img() {
		LiveShoppingSection1 LS1_obj = new LiveShoppingSection1(driver);
		LS1_obj.verify_ceo_img();
	}

	@Test(priority = 3)
	public void test_ceo_txt() {
		LiveShoppingSection1 LS1_obj = new LiveShoppingSection1(driver);
		LS1_obj.verify_ceo_txt();
	}

	@Test(priority = 4)
	public void test_five_stars() {
		LiveShoppingSection1 LS1_obj = new LiveShoppingSection1(driver);
		LS1_obj.verify_five_stars();
	}

	@Test(priority = 5)
	public void test_right_img() {
		LiveShoppingSection1 LS1_obj = new LiveShoppingSection1(driver);
		LS1_obj.verify_right_img();
	}

}