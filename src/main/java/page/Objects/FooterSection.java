package page.Objects;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class FooterSection {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(VdotokHome.class.getName());

	public FooterSection(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	// Test Footer
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[1]//div//img")
	WebElement footer_vdotok_icon;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[1]//div[2]//p[@class=\"paraStyle typekit_BodyRegular webkit_primary_grey\"]")
	WebElement footer_descriptive_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerDownDiv\"]//div")
	WebElement footer_copyright_txt;

	public void verify_footer_vdotok_icon() {
		js.executeScript("window.scrollBy(0,7300)");
		wait.until(ExpectedConditions.visibilityOf(footer_vdotok_icon));
		boolean Element_Present = footer_vdotok_icon.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Vdotok icon is displayed in the footer");
	}

	public void verify_footer_descriptive_txt() {
		js.executeScript("window.scrollBy(0,7300)");
		wait.until(ExpectedConditions.visibilityOf(footer_descriptive_txt));
		String actual_txt = footer_descriptive_txt.getText();
		Assert.assertEquals(actual_txt,
				"Build powerful communication solutions for Live Shopping, MedTech, IoT & Social Networking");
		log.info("vdotok description is displayed in the footer");
	}

	public void verify_footer_copyright_txt() {
		js.executeScript("window.scrollBy(0,7300)");
		wait.until(ExpectedConditions.visibilityOf(footer_copyright_txt));
		String actual_txt = footer_copyright_txt.getText();
		Assert.assertEquals(actual_txt, "© 2023, VdoTok AB");
		log.info("copyright text is displayed in the footer");
	}

	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[@class=\"linkHead\"]")
	WebElement footer_vdotok_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//p[1]")
	WebElement footer_beta_btn;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//a[1]")
	WebElement footer_about_btn;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//a[2]")
	WebElement footer_pricing_btn;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//a[3]")
	WebElement footer_documentation_btn;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//a[4]")
	WebElement footer_FAQ_btn;
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"signup_container\"]//div[@id=\"modalmain-signup\"]//div[@id=\"navmodal-signup\"]//div[@class=\"login partition\"]//p[@class=\"heading-signin typekit_h3 webkit_primary_h\"]")
	WebElement signIn_title;
	@FindBy(xpath = "//div[@class=\"paycontent\"]//p[1]")
	WebElement sec6_title_txt;
	@FindBy(xpath = "//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]")
	WebElement cancel_login;

	public void verify_footer_vdotok_txt() {
		js.executeScript("window.scrollBy(0,7300)");
		wait.until(ExpectedConditions.visibilityOf(footer_vdotok_txt));
		String actual_txt = footer_vdotok_txt.getText();
		Assert.assertEquals(actual_txt, "This is VdoTok");
		log.info("vdotok text is displayed in the footer");
	}

	public void verify_footer_beta_btn() throws InterruptedException {
		// js.executeScript("window.scrollBy(0,7300)");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_beta_btn));
		String actual_txt1 = footer_beta_btn.getText();
		Assert.assertEquals(actual_txt1, "Try VdoTok Beta");
		footer_beta_btn.click();
		log.info("clicked on vdotok beta option in the footer");
		wait.until(ExpectedConditions.elementToBeClickable(cancel_login));
		log.info("Sign up pop up has been displayed on clicking the vdotok beta option in the footer");
		cancel_login.click();

	}

	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@class=\"main_vision\"]//div//div//h2")
	WebElement our_vision_title;

	public void verify_footer_about_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_about_btn));
		String actual_txt1 = footer_about_btn.getText();
		Assert.assertEquals(actual_txt1, "About");
		footer_about_btn.click();
		log.info("clicked on About option in the footer ");
		wait.until(ExpectedConditions.elementToBeClickable(our_vision_title));
		log.info("user has been navigated to the relative page on clicking the about option in the footer");
		String actual_txt2 = our_vision_title.getText();
		Assert.assertEquals(actual_txt2, "Our Vision");

	}

	public void verify_footer_pricing_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_pricing_btn));
		String actual_txt1 = footer_pricing_btn.getText();
		Assert.assertEquals(actual_txt1, "Pricing");
		footer_pricing_btn.click();
		log.info("clicked on Pricing option in the footer");
		wait.until(ExpectedConditions.elementToBeClickable(sec6_title_txt));
		log.info("user has been navigated to the Section-6 on clicking the Pricing option in the footer");
		String actual_txt2 = sec6_title_txt.getText();
		Assert.assertEquals(actual_txt2, "Pay as you grow");

	}

	public void verify_footer_documentation_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_documentation_btn));
		String actual_txt1 = footer_documentation_btn.getText();
		Assert.assertEquals(actual_txt1, "Documentation");
		footer_documentation_btn.click();
		log.info("clicked on Documentation option in the footer");
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/");
		log.info("user has been navigated to the docs page on clicking Documentation option in the footer");
	}

	public void verify_footer_FAQ_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_FAQ_btn));
		String actual_txt1 = footer_FAQ_btn.getText();
		Assert.assertEquals(actual_txt1, "FAQ");
		footer_FAQ_btn.click();
		log.info("clicked on FAQ option in the footer");
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/FAQ");
		log.info("user has been navigated to the FAQ page on clicking the FAQ option in the footer");
	}

	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[2]//div[@class=\"linkHead\"]")
	WebElement footer_usecases_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[2]//div[2]//a[1]")
	WebElement footer_shopping_btn;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[2]//div[2]//a[2]")
	WebElement footer_medtech_btn;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[2]//div[2]//a[3]")
	WebElement footer_network_btn;

	public void verify_footer_usecases_txt() {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.visibilityOf(footer_usecases_txt));
		String actual_txt = footer_usecases_txt.getText();
		Assert.assertEquals(actual_txt, "Use cases");
		log.info("Usecases displayed in the footer");
	}

	public void verify_footer_shopping_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_shopping_btn));
		String actual_txt1 = footer_shopping_btn.getText();
		Assert.assertEquals(actual_txt1, "Live Shopping");
		footer_shopping_btn.click();
		log.info("clicked on Live Shopping option in the footer");
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/liveshopping");
		log.info("user has been navigated to the LIVE SHOPPING page on clicking LIVE SHOPPING option in the footer");
	}

	public void verify_footer_medtech_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_medtech_btn));
		String actual_txt1 = footer_medtech_btn.getText();
		Assert.assertEquals(actual_txt1, "MedTech");
		footer_medtech_btn.click();
		log.info("clicked on MedTech option in the footer");
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/healthtech");
		log.info("user has been navigated to the health tech page on clicking medtech option in the footer");
	}
	/*
	 * public void verify_footer_network_btn() {
	 * js.executeScript("window.scrollBy(0,7000)");
	 * wait.until(ExpectedConditions.elementToBeClickable(footer_network_btn));
	 * String actual_txt1= footer_network_btn.getText();
	 * Assert.assertEquals(actual_txt1, "Social Network");
	 * footer_network_btn.click(); String winHandleBefore =
	 * driver.getWindowHandle(); for(String winHandle : driver.getWindowHandles()) {
	 * driver.switchTo().window(winHandle); } String actual_url =
	 * driver.getCurrentUrl(); Assert.assertEquals(actual_url,
	 * "https://vdotok.com/healthtech"); }
	 */

	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"contactMainDiv contactfooterDiv\"]//div[@class=\"linkHead contactusmbl\"]")
	WebElement footer_ContactUs_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"contactMainDiv contactfooterDiv\"]//p")
	WebElement footer_email_btn;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerUpDiv\"]//div[3]//div[@class=\"iconDiv\"]//div[1]//img")
	WebElement footer_facebook_img;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerUpDiv\"]//div[3]//div[@class=\"iconDiv\"]//div[2]//img")
	WebElement footer_insta_img;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerUpDiv\"]//div[3]//div[@class=\"iconDiv\"]//div[3]//img")
	WebElement footer_linkedIn_img;

	public void verify_footer_ContactUs_txt() {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.visibilityOf(footer_ContactUs_txt));
		String actual_txt = footer_ContactUs_txt.getText();
		Assert.assertEquals(actual_txt, "Contact us");
		log.info("contact us option displayed in the footer");
	}

	public void verify_footer_email_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_email_btn));
		String actual_txt1 = footer_email_btn.getText();
		Assert.assertEquals(actual_txt1, "E-mail: info@vdotok.com");
		footer_email_btn.click();
		log.info("clicked on the email option in the footer");
	}

	public void verify_footer_facebook_img() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(footer_facebook_img));
		boolean Element_Present = footer_facebook_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Facebook icon displayed in the footer");
	}

	public void verify_footer_facebook_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_facebook_img));
		footer_facebook_img.click();
		log.info("clicked on the facebook icon in the footer");
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://web.facebook.com/vdotok/?_rdc=1&_rdr");
		log.info("user has been navigated to the vdotok facebook page");
	}

	public void verify_footer_insta_img() {
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.visibilityOf(footer_insta_img));
		boolean Element_Present = footer_insta_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("instagram icon displayed in the footer");
	}

	public void verify_footer_insta_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_insta_img));
		footer_insta_img.click();
		log.info("clicked on the instagram icon in the footer");
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://www.instagram.com/vdotok/");
		log.info("user has been navigated to the vdotok instagram page");
	}

	public void verify_footer_linkedIn_img() {
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.visibilityOf(footer_linkedIn_img));
		boolean Element_Present = footer_linkedIn_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("linkedin icon displayed in the footer");
	}

	public void verify_footer_linkedIn_btn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_linkedIn_img));
		footer_linkedIn_img.click();
		log.info("clicked on the linkedin icon in the footer");
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://www.linkedin.com/company/vdotok/");
		log.info("user has been navigated to the vdotok linkedin page");
	}

	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerDownDiv\"]//p//img")
	WebElement footer_backToTop_imgBtn;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerDownDiv\"]//p[@class=\"footerBack\"]")
	WebElement footer_backToTop_txtBtn;
	@FindBy(xpath = "//img[@id=\"vdtbrandlogo\"]")
	WebElement header_logo;

	public void verify_footer_backToTop_imgBtn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_backToTop_imgBtn));
		footer_backToTop_imgBtn.click();
		log.info("clicked on the back to top icon in the footer");
		boolean logoPresent = header_logo.isDisplayed();
		Assert.assertTrue(logoPresent);
		log.info("user has been navigated to the top of the page");

	}

	public void verify_footer_backToTop_txtBtn() throws InterruptedException {
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(footer_backToTop_txtBtn));
		footer_backToTop_txtBtn.click();
		log.info("clicked on the back to top tet in the footer");
		boolean logoPresent = header_logo.isDisplayed();
		Assert.assertTrue(logoPresent);
		log.info("user has been navigated to the top of the page");

	}
}