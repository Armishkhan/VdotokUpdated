package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsers.browser_setup;
import page.Objects.Section8;

public class TestSection8 extends browser_setup {

   //////////////////////////////////////////////////////////TEST SECTION-8 /////////////////////////////////////////////////////////////////////

   //Test Section8

	@Test(priority = 0)
	public void test_sec8_txt() {
		Section8 sec8_obj = new Section8(driver);
		sec8_obj.verify_sec8_txt();
	}

	@Test(priority = 1)
	public void test_sec8_img() {
		Section8 sec8_obj = new Section8(driver);
		sec8_obj.verify_sec8_img();
	}

	@Test(priority = 2)
	public void test_sec8_tryBtn() {
		Section8 sec8_obj = new Section8(driver);
		sec8_obj.verify_sec8_tryBtn();
	}

}
