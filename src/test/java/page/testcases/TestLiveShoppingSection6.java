package page.testcases;

import org.testng.annotations.Test;
import browsers.browser_setup;
import page.Objects.LiveShoppingSection6;

public class TestLiveShoppingSection6 extends browser_setup {

	////////////////////////////////////////////////////////// TEST HEADER SECTION ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 0)
	public void test_sec6_txt()  {
		LiveShoppingSection6 LS6_obj = new LiveShoppingSection6(driver);
		LS6_obj.verify_sec6_txt();
	}
	
	@Test(priority = 1)
	public void test_sec6_left_img()  {
		LiveShoppingSection6 LS6_obj = new LiveShoppingSection6(driver);
		LS6_obj.verify_sec6_left_img();
	}

	@Test(priority = 2)
	public void test_sec6_togee_link() throws InterruptedException  {
		LiveShoppingSection6 LS6_obj = new LiveShoppingSection6(driver);
		LS6_obj.verify_sec6_togee_link();
	}
	
	@Test(priority = 3)
	public void test_sec6_togee_card()  {
		LiveShoppingSection6 LS6_obj = new LiveShoppingSection6(driver);
		LS6_obj.verify_sec6_togee_card();
	}
	

	@Test(priority = 4)
	public void test_sec6_togee_txt()  {
		LiveShoppingSection6 LS6_obj = new LiveShoppingSection6(driver);
		LS6_obj.verify_sec6_togee_txt();
	}
	
	@Test(priority = 5)
	public void test_sec6_bottom_img()  {
		LiveShoppingSection6 LS6_obj = new LiveShoppingSection6(driver);
		LS6_obj.verify_sec6_bottom_img();
	}

}