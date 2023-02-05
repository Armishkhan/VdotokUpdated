package page.testcases;


import org.testng.annotations.Test;
import browsers.browser_setup;
import page.Objects.LiveShoppingSection7;

public class TestLiveShoppingSection7 extends browser_setup {

	////////////////////////////////////////////////////////// TEST HEADER SECTION ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 0)
	public void test_sec6_txt()  {
		LiveShoppingSection7 LS7_obj = new LiveShoppingSection7(driver);
		LS7_obj.verify_sec7_txt();
	}
	
	@Test(priority = 1)
	public void test_sec7_bottom_img()  {
		LiveShoppingSection7 LS7_obj = new LiveShoppingSection7(driver);
		LS7_obj.verify_sec7_bottom_img();
	}
	
	@Test(priority = 2)
	public void test_sec7_try_button() throws InterruptedException  {
		LiveShoppingSection7 LS7_obj = new LiveShoppingSection7(driver);
		LS7_obj.verify_sec7_try_button();
	}
}