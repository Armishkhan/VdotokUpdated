package page.testcases;

import org.testng.annotations.Test;
import browsers.browser_setup;
import page.Objects.LiveShoppingSection4;

public class TestLiveShoppingSection4 extends browser_setup {

	////////////////////////////////////////////////////////// TEST HEADER SECTION ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 0)
	public void test_sec4_txt()  {
		LiveShoppingSection4 LS4_obj = new LiveShoppingSection4(driver);
		LS4_obj.verify_sec4_txt();
	}
	
	@Test(priority = 1)
	public void test_sec4_LS_button() throws InterruptedException  {
		LiveShoppingSection4 LS4_obj = new LiveShoppingSection4(driver);
		LS4_obj.verify_sec4_LS_button();
	}

	@Test(priority = 2)
	public void test_sec4_020_button() throws InterruptedException {
		LiveShoppingSection4 LS4_obj = new LiveShoppingSection4(driver);
		LS4_obj.verify_sec4_020_button();
		
	}
	
	@Test(priority = 3)
	public void test_sec4_SS_button() throws InterruptedException {
		LiveShoppingSection4 LS4_obj = new LiveShoppingSection4(driver);
		LS4_obj.verify_sec4_SS_button();
		
	}
	
	@Test(priority = 4)
	public void test_sec4_MandM_button() throws InterruptedException {
		LiveShoppingSection4 LS4_obj = new LiveShoppingSection4(driver);
		LS4_obj.verify_sec4_MandM_button();
		
	}
	
	@Test(priority = 5)
	public void test_sec4_EF_button() throws InterruptedException {
		LiveShoppingSection4 LS4_obj = new LiveShoppingSection4(driver);
		LS4_obj.verify_sec4_EF_button();
		
	}
	
	@Test(priority = 6)
	public void test_sec4_Mess_button() throws InterruptedException {
		LiveShoppingSection4 LS4_obj = new LiveShoppingSection4(driver);
		LS4_obj.verify_sec4_Mess_button();
		
	}
	
	@Test(priority = 7)
	public void test_sec4_FS_button() throws InterruptedException {
		LiveShoppingSection4 LS4_obj = new LiveShoppingSection4(driver);
		LS4_obj.verify_sec4_FS_button();
		
	}
	
}	