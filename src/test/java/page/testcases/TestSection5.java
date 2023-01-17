package page.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Objects.Section5;

public class TestSection5 {

	WebDriver driver;
	String driverPath = "/usr/local/bin/chromedriver";

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chromedriver.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	////////////////////////////////////////////////////////// TEST SECTION-5 ////////////////////////////////////////////////////////// 

	// Test Section5

	@Test(priority = 0)
	public void test_sec5_txt() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_sec5_txt();
	}

	@Test(priority = 1)
	public void test_sec5_btn() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_sec5_btn();
	}

	// Test Section5 Card1

	@Test(priority = 2)
	public void test_card1_img() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card1_img();
	}

	@Test(priority = 3)
	public void test_card1_toggle() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card1_toggle();
	}

	@Test(priority = 4)
	public void test_card1_txt() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card1_txt();
	}

	// Test Section5 Card2

	@Test(priority = 5)
	public void test_card2_img() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card2_img();
	}

	@Test(priority = 6)
	public void test_card2_toggle() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card2_toggle();
	}

	@Test(priority = 7)
	public void test_card2_txt() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card2_txt();
	}

	// Test Section5 Card3

	@Test(priority = 8)
	public void test_card3_img() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card3_img();
	}

	@Test(priority = 9)
	public void test_card3_toggle() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card3_toggle();
	}

	@Test(priority = 10)
	public void test_card3_txt() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card3_txt();
	}

	// Test Section5 Card4

	@Test(priority = 11)
	public void test_card4_Topimg() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card4_Topimg();
	}

	@Test(priority = 12)
	public void test_card4_txt() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card4_txt();
	}

	@Test(priority = 13)
	public void test_card4_Btmimg() {
		Section5 sec5_obj = new Section5(driver);
		sec5_obj.verify_card4_Btmimg();
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
