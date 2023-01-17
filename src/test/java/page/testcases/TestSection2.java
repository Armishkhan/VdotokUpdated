package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Objects.Section2;

public class TestSection2 {

	WebDriver driver;
	String driverPath = "/usr/local/bin/chromedriver";

	@BeforeMethod

	public void setup() {

		System.setProperty("webdriver.chromedriver.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	////////////////////////////////////////////////////////// TEST SECTION-2 //////////////////////////////////////////////////////////
	// Test Body Section-2
	@Test(priority = 0)
	public void test_sec2_txt() {
		Section2 sec2_obj = new Section2(driver);
		sec2_obj.verify_sec2_txt();
	}

	@Test(priority = 1)
	public void test_sec2_btn1() {
		Section2 sec2_obj = new Section2(driver);
		sec2_obj.verify_sec2_TryBtn();
	}

	@Test(priority = 2)
	public void test_sec2_btn2() {
		Section2 sec2_obj = new Section2(driver);
		sec2_obj.verify_sec2_workBtn();
	}

	@Test(priority = 3)
	public void test_sec2_img() {
		Section2 sec2_obj = new Section2(driver);
		sec2_obj.verify_sec2_img();
	}

	@Test(priority = 4)
	public void test_multiplay_logo() {
		Section2 sec2_obj = new Section2(driver);
		sec2_obj.verify_sec2_MultiplayLogo();
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
