package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsers.browser_setup;
import page.Objects.FooterSection;

public class TestFooterSection extends browser_setup {

	// Test Footer Section1

	@Test(priority = 0)
	public void test_footer_vdotok_icon() {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_vdotok_icon();
	}

	@Test(priority = 1)
	public void test_footer_descriptive_txt() {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_descriptive_txt();
	}

	@Test(priority = 2)
	public void test_footer_copyright_txt() {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_copyright_txt();
	}

	// Test Footer Section2

	@Test(priority = 3)
	public void test_footer_vdotok_txt() {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_vdotok_txt();
	}

	@Test(priority = 4)
	public void test_footer_beta_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_beta_btn();
	}

	@Test(priority = 5)
	public void test_footer_about_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_about_btn();
	}

	@Test(priority = 6)
	public void test_footer_pricing_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_pricing_btn();
	}

	@Test(priority = 7)
	public void test_footer_documentation_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_documentation_btn();
	}

	@Test(priority = 8)
	public void test_footer_FAQ_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_FAQ_btn();
	}

	// Test Footer Section3

	@Test(priority = 9)
	public void test_footer_usecases_txt() {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_usecases_txt();
	}

	@Test(priority = 10)
	public void test_footer_shopping_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_shopping_btn();
	}

	@Test(priority = 11)
	public void test_footer_medtech_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_medtech_btn();
	}

	// Test Footer Section4

	@Test(priority = 12)
	public void test_footer_ContactUs_txt() {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_ContactUs_txt();
	}

	@Test(priority = 13)
	public void test_footer_email_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_email_btn();
	}

	@Test(priority = 14)
	public void test_footer_facebook_img() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_facebook_img();
	}

	@Test(priority = 15)
	public void test_footer_facebook_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_facebook_btn();
	}

	@Test(priority = 16)
	public void test_footer_insta_img() {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_insta_img();
	}

	@Test(priority = 17)
	public void test_footer_insta_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_insta_btn();
	}

	@Test(priority = 18)
	public void test_footer_linkedIn_img() {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_linkedIn_img();
	}

	@Test(priority = 19)
	public void test_footer_linkedIn_btn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_linkedIn_btn();
	}

	// Test Back to Top

	@Test(priority = 20)
	public void test_footer_backToTop_imgBtn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_backToTop_imgBtn();
	}

	@Test(priority = 21)
	public void test_footer_backToTop_txtBtn() throws InterruptedException {
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_backToTop_txtBtn();
	}

}
