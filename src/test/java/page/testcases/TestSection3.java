package page.testcases;

import org.testng.annotations.Test;
import browsers.browser_setup;
import page.Objects.Section3;

public class TestSection3 extends browser_setup {
	
	////////////////////////////////////////////////////////// TEST SECTION-3 ////////////////////////////////////////////////////////// 

	//Test Body Section3

	@Test(priority = 0)
	public void test_sec3_txt() {
		Section3 sec3_obj = new Section3(driver);
		sec3_obj.verify_sec3_txt();
	}

	
	@Test(priority = 1)
	public void test_sec3_btn1() {
		Section3 sec3_obj = new Section3(driver);
		sec3_obj.verify_sec3_TryBtn();
	}

	@Test(priority = 2)
	public void test_sec3_img() {
		Section3 sec3_obj = new Section3(driver);
		sec3_obj.verify_sec3_img();
	}
	
}
