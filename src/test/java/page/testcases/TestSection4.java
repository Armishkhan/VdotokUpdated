package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsers.browser_setup;
import page.Objects.Section4;

public class TestSection4 extends browser_setup {

	////////////////////////////////////////////////////////// TEST SECTION-4 ////////////////////////////////////////////////////////// 

	// Test Section4

	@Test(priority = 0)
	public void test_sec4_txt() {
		Section4 sec4_obj = new Section4(driver);
		sec4_obj.verify_sec4_txt();
	}

	@Test(priority = 1)
	public void test_sec4_img() {
		Section4 sec4_obj = new Section4(driver);
		sec4_obj.verify_sec4_img();
	}

}
