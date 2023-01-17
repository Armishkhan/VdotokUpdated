package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Objects.TestimonialsSection;

public class TestTestimonialsSection {

	WebDriver driver;
	String driverPath = "/usr/local/bin/chromedriver";

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chromedriver.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

    //////////////////////////////////////////////////////////TEST TESTIMONIALS SECTION /////////////////////////////////////////////////////////////////////

    //Test Testimonials

	@Test(priority = 0)
	public void test_testimonials_txt() {
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonials_txt();
	}

    //Test Testimonials Card1

	@Test(priority = 1)
	public void test_testimonial_card1_img() {
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card1_img();
	}

	@Test(priority = 2)
	public void test_testimonial_card1_logo() {
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card1_logo();
	}

	@Test(priority = 3)
	public void test_testimonial_card1_txt() {
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card1_txt();
	}

    //Test Testimonials Card2

	@Test(priority = 4)
	public void test_testimonial_card2_img() {
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card2_img();
	}

	@Test(priority = 5)
	public void test_testimonial_card2_logo() {
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card2_logo();
	}

	@Test(priority = 6)
	public void test_testimonial_card2_txt() {
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card2_txt();
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}

