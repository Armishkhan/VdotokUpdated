package page.testcases;


import org.testng.annotations.Test;
import browsers.browser_setup;
import page.Objects.LiveShoppingSection5;

public class TestLiveShoppingSection5 extends browser_setup {

	////////////////////////////////////////////////////////// TEST HEADER SECTION ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
	@Test(priority = 0)
	public void test_sec5_txt()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_txt();
	}
	
	@Test(priority = 1)
	public void test_sec5_card1_icon()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card1_icon();
	}
	
	@Test(priority = 2)
	public void test_sec5_card1_txt()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card1_txt();
	}
	
	@Test(priority = 3)
	public void test_sec5_card2_icon()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card2_icon();
	}
	
	@Test(priority = 4)
	public void test_sec5_card2_txt()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card2_txt();
	}
	
	@Test(priority = 5)
	public void test_sec5_card3_icon()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card3_icon();
	}
	
	@Test(priority = 6)
	public void test_sec5_card3_txt()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card3_txt();
	}
	
	@Test(priority = 7)
	public void test_sec5_card4_icon()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card4_icon();
	}
	
	@Test(priority = 8)
	public void test_sec5_card4_txt()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card4_txt();
	}
	
	@Test(priority = 9)
	public void test_sec5_card5_icon()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card5_icon();
	}
	
	@Test(priority = 10)
	public void test_sec5_card5_txt()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card5_txt();
	}
	
	@Test(priority = 9)
	public void test_sec5_card6_icon()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card6_icon();
	}
	
	@Test(priority = 10)
	public void test_sec5_card6_txt()  {
		LiveShoppingSection5 LS5_obj = new LiveShoppingSection5(driver);
		LS5_obj.verify_sec5_card6_txt();
	}
	
}	