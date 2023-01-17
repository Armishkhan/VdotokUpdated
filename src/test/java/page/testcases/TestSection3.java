package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Objects.Section3;

public class TestSection3 {

	WebDriver driver;
	String driverPath = "/usr/local/bin/chromedriver";

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chromedriver.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}
	////////////////////////////////////////////////////////// TEST SECTION-3 ////////////////////////////////////////////////////////// 

	// Test Body Section3

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

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
