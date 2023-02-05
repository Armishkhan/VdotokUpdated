package page.testcases;


import org.testng.annotations.Test;
import browsers.browser_setup;
import page.Objects.LiveShoppingSection3;

public class TestLiveShoppingSection3 extends browser_setup {

	////////////////////////////////////////////////////////// TEST HEADER SECTION ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 /*  
	@Test(priority = 0)
	public void test_sec3_title() {
		LiveShoppingSection3 LS3_obj = new LiveShoppingSection3(driver);
		LS3_obj.verify_sec3_title();
	}
*/	
	@Test(priority = 1)
	public void test_sec3_card1_icon() {
		LiveShoppingSection3 LS3_obj = new LiveShoppingSection3(driver);
		LS3_obj.verify_sec3_card1_icon();
	}
	
	@Test(priority = 2)
	public void test_sec3_card1_txt() {
		LiveShoppingSection3 LS3_obj = new LiveShoppingSection3(driver);
		LS3_obj.verify_sec3_card1_txt();
	}
	
	@Test(priority = 3)
	public void test_sec3_card2_icon() {
		LiveShoppingSection3 LS3_obj = new LiveShoppingSection3(driver);
		LS3_obj.verify_sec3_card2_icon();
	}
	
	@Test(priority = 4)
	public void test_sec3_card2_txt() {
		LiveShoppingSection3 LS3_obj = new LiveShoppingSection3(driver);
		LS3_obj.verify_sec3_card2_txt();
	}
	
	@Test(priority = 5)
	public void test_sec3_card3_icon() {
		LiveShoppingSection3 LS3_obj = new LiveShoppingSection3(driver);
		LS3_obj.verify_sec3_card3_icon();
	}
	
	@Test(priority = 6)
	public void test_sec3_card3_txt() {
		LiveShoppingSection3 LS3_obj = new LiveShoppingSection3(driver);
		LS3_obj.verify_sec3_card3_txt();
	}
	
	@Test(priority = 7)
	public void test_sec3_card4_icon() {
		LiveShoppingSection3 LS3_obj = new LiveShoppingSection3(driver);
		LS3_obj.verify_sec3_card4_icon();
	}
	
	@Test(priority = 8)
	public void test_sec3_card4_txt() {
		LiveShoppingSection3 LS3_obj = new LiveShoppingSection3(driver);
		LS3_obj.verify_sec3_card4_txt();
	}
	
}