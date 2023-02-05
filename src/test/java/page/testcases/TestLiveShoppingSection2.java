package page.testcases;

import org.testng.annotations.Test;
import browsers.browser_setup;
import page.Objects.LiveShoppingSection2;

public class TestLiveShoppingSection2 extends browser_setup {

	////////////////////////////////////////////////////////// TEST HEADER SECTION //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 0)
	public void test_sec2_txt() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_txt();
	}

	@Test(priority = 1)
	public void test_sec2_vdotok_icon() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_vdotok_icon();
	}

	@Test(priority = 2)
	public void test_sec2_card1_txt() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card1_txt();
	}

	@Test(priority = 3)
	public void test_sec2_card1_liveImg() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card1_liveImg();
	}

	@Test(priority = 4)
	public void test_sec2_card1_likeImg() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card1_likeImg();
	}

	@Test(priority = 5)
	public void test_sec2_card1_makeupImg() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card1_makeupImg();
	}

	@Test(priority = 5)
	public void test_sec2_card1_plusImg() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card1_plusImg();
	}

	@Test(priority = 6)
	public void test_sec2_card1_Vline1() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card1_Vline1();
	}

	@Test(priority = 7)
	public void test_sec2_card2_txt() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card2_txt();
	}

	@Test(priority = 8)
	public void test_sec2_card2_img() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card2_img();
	}

	@Test(priority = 9)
	public void test_sec2_card3_txt() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card3_txt();
	}

	@Test(priority = 10)
	public void test_sec2_card3_img() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card3_img();
	}

	@Test(priority = 11)
	public void test_sec2_card1_Hline1() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card1_Hline1();
	}

	@Test(priority = 12)
	public void test_sec2_card4_txt() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card4_txt();
	}

	@Test(priority = 13)
	public void test_sec2_card4_img() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card4_img();
	}

	@Test(priority = 14)
	public void test_sec2_card5_txt() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card5_txt();
	}

	@Test(priority = 15)
	public void test_sec2_card5_img() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card5_img();
	}

	@Test(priority = 16)
	public void test_sec2_card5_Vline1() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card5_Vline1();
	}

	@Test(priority = 17)
	public void test_sec2_card6_txt() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card6_txt();
	}

	@Test(priority = 18)
	public void test_sec2_card6_img() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card6_img();
	}

	@Test(priority = 19)
	public void test_sec2_card6_live_button() {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_card6_live_button();
	}

	@Test(priority = 20)
	public void test_sec2_bottom_txt() throws InterruptedException {
		LiveShoppingSection2 LS2_obj = new LiveShoppingSection2(driver);
		LS2_obj.verify_sec2_bottom_txt();
	}

}