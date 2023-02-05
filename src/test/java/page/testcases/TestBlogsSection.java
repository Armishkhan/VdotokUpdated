package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsers.browser_setup;
import page.Objects.BlogsSection;

public class TestBlogsSection extends browser_setup {

    //////////////////////////////////////////////////////////TEST BLOGS SECTION /////////////////////////////////////////////////////////////////////

    //Test Blogs

	@Test(priority = 0)
	public void test_blogs_sec_title() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blogs_sec_title();
	}

    //Test Blog1

	@Test(priority = 1)
	public void test_blog1_img() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog1_img();
	}

	@Test(priority = 2)
	public void test_blog1_btn() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog1_btn();
	}

	@Test(priority = 3)
	public void test_blog1_txt() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog1_txt();
	}

    //Test Blog2

	@Test(priority = 4)
	public void test_blog2_img() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog2_img();
	}

	@Test(priority = 5)
	public void test_blog2_btn() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog2_btn();
	}

	@Test(priority = 6)
	public void test_blog2_txt() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog2_txt();
	}

    //Test Blog3

	@Test(priority = 7)
	public void test_blog3_img() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog3_img();
	}

	@Test(priority = 8)
	public void test_blog3_btn() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog3_btn();
	}

	@Test(priority = 9)
	public void test_blog3_txt() {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog3_txt();
	}

    //Test scroller1

	@Test(priority = 10)
	public void test_scrollable_btn1() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_scrollable_btn1();
	}

    //Test Blog4

	@Test(priority = 11)
	public void test_blog4_img() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog4_img();
	}

	@Test(priority = 12)
	public void test_blog4_btn() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog4_btn();
	}

	@Test(priority = 13)
	public void test_blog4_txt() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog4_txt();
	}

    //Test Blog5

	@Test(priority = 14)
	public void test_blog5_img() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog5_img();
	}

	@Test(priority = 15)
	public void test_blog5_btn() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog5_btn();
	}

	@Test(priority = 16)
	public void test_blog5_txt() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog5_txt();
	}

    //Test Blog6

	@Test(priority = 17)
	public void test_blog6_img() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog6_img();
	}

	@Test(priority = 18)
	public void test_blog6_btn() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog6_btn();
	}

	@Test(priority = 19)
	public void test_blog6_txt() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog6_txt();
	}

    //Test Scroller2

	@Test(priority = 20)
	public void test_scrollable_btn2() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_scrollable_btn1();
	}

    //Test Blog7

	@Test(priority = 21)
	public void test_blog7_img() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog7_img();
	}

	@Test(priority = 22)
	public void test_blog7_btn() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog7_btn();
	}

	@Test(priority = 23)
	public void test_blog7_txt() throws InterruptedException {
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blogs7_txt();
	}

}