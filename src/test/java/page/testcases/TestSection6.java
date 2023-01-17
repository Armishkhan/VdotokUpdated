package page.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Objects.Section6;

public class TestSection6 {

	WebDriver driver;
	String driverPath = "/usr/local/bin/chromedriver";

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chromedriver.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}
   //////////////////////////////////////////////////////////TEST SECTION-6 /////////////////////////////////////////////////////////////////////

   //Test Section6

	@Test(priority = 0)
	public void test_sec6_txt() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_txt();
	}

    //Test Section6 Card1

	@Test(priority = 1)
	public void test_sec6_card1_img() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card1_img();
	}

	@Test(priority = 2)
	public void test_sec6_card1_txt() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card1_txt();
	}

    //Test Section6 Card2

	@Test(priority = 3)
	public void test_sec6_card2_img() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card2_img();
	}

	@Test(priority = 4)
	public void test_sec6_card2_txt() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card2_txt();
	}

    //Test Section6 Card3

	@Test(priority = 5)
	public void test_sec6_card3_sliders() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_sliders();
	}

	@Test(priority = 6)
	public void test_sec6_card3_inputs() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_inputs();
	}

	@Test(priority = 7)
	public void test_sec6_card3_txt() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_txt();
	}

	@Test(priority = 8)
	public void test_sec6_card3_startBtn() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_startBtn();
	}

	@Test(priority = 9)
	public void test_sec6_card3_contactBtn() {
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_contactBtn();
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
