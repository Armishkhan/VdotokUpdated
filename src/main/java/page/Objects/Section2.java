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

public class Section2 {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(Section2.class.getName());

	public Section2(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	@FindBy(xpath = "//div[@class=\"sectionheading\"]//p[contains(text(),'2')]")
	WebElement yellow_dot_sec2;
	@FindBy(xpath = "//div[@class=\"sectionheading\"]//p[contains(text(),'What we offer')]")
	WebElement yelllow_dot_sec2_txt;
	@FindBy(xpath = "//div//img[@src=\"/static/media/plus-many-more.d99006d565ccdac8fb82.webp\"]")
	WebElement img_sec2;
	@FindBy(xpath = "//div[@id=\"root\"]//div[3]//div[@class=\"slidergrp\"]//img")
	WebElement multiplay_logo_sec2;
	@FindBy(xpath = "//div//p[@class=\" sliderhide slidernarrowtext typekit_BodySmallRegular webkit_primary_grey\"]")
	WebElement pre_txt_sec2;
	@FindBy(xpath = "//div[@id=\"root\"]//div[3]//div[2][@class=\"sectioncontent\"]//p[2]")
	WebElement title_txt_sec2;
	@FindBy(xpath = "//div[@id=\"root\"]//div[3]//div[2][@class=\"sectioncontent\"]//p[3]")
	WebElement descriptive_txt1_sec2;
	@FindBy(xpath = "//div[@id=\"root\"]//div[3]//div[2][@class=\"sectioncontent\"]//p[4]")
	WebElement descriptive_txt2_sec2;
	@FindBy(xpath = "//div[@id=\"root\"]//div[3]//div[@class=\"slidergrp\"]//p")
	WebElement multiplay_txt_sec2;
	@FindBy(xpath = "//div[@id=\"root\"]//div[3]//div[4]//div[2]//div[2]//button[@class=\"s2btnblue Darkbluebtn\"]")
	WebElement try_btn_sec2;
	@FindBy(xpath = "//div[@id=\"root\"]//div[3]//div[4]//div[2]//div[2]//button[@class=\"s2btnwhite Whitebtn\"]")
	WebElement work_btn_sec2;
	@FindBy(xpath = "//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]")
	WebElement cancel_login;

	public void verify_sec2_txt() {
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(yellow_dot_sec2));
		boolean Element_Present = yellow_dot_sec2.isDisplayed();
		Assert.assertTrue(Element_Present);
		String actual_txtt = yellow_dot_sec2.getText();
		Assert.assertEquals(actual_txtt, "2");
		log.info("section-2 found in the body");

		wait.until(ExpectedConditions.visibilityOf(yelllow_dot_sec2_txt));
		String actual_txt = yelllow_dot_sec2_txt.getText();
		Assert.assertEquals(actual_txt, "What we offer");
		log.info("Section-2 started");

		wait.until(ExpectedConditions.visibilityOf(pre_txt_sec2));
		String actual_txt1 = pre_txt_sec2.getText();
		Assert.assertEquals(actual_txt1, "We know what’s trending");
		log.info("pre text in Section-2 matched with the expected text");

		wait.until(ExpectedConditions.visibilityOf(title_txt_sec2));
		String actual_txt4 = title_txt_sec2.getText();
		Assert.assertEquals(actual_txt4, "Time for live experience");
		log.info("title of the Section-2 matched with the expected title");

		wait.until(ExpectedConditions.visibilityOf(multiplay_txt_sec2));
		String actual_txt5 = multiplay_txt_sec2.getText();
		Assert.assertEquals(actual_txt5, "Multiplay service provider");
		log.info("multiplay logo is displayed in section 2");

		wait.until(ExpectedConditions.visibilityOf(descriptive_txt1_sec2));
		String actual_txt2 = descriptive_txt1_sec2.getText();
		Assert.assertEquals(actual_txt2,
				"Integrate live streaming, screen sharing, video and voice calls into your app or product.");

		wait.until(ExpectedConditions.visibilityOf(descriptive_txt2_sec2));
		String actual_txt3 = descriptive_txt2_sec2.getText();
		Assert.assertEquals(actual_txt3,
				"VdoTok's mission is to accelerate the world's transition from messaging/text to live media by making it easy, quick and inexpensive for any business.");

		log.info("Descriptive text of Section-2 matched with the expected text");
	}

	public void verify_sec2_TryBtn() {
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.elementToBeClickable(try_btn_sec2));
		String actual_txt = try_btn_sec2.getText();
		Assert.assertEquals(actual_txt, "TRY FOR FREE");
		try_btn_sec2.click();
		log.info("Clicked on the try for free button in section 2");
		wait.until(ExpectedConditions.elementToBeClickable(cancel_login));
		log.info("Try for free button in section 2 is working fine");
		cancel_login.click();
	}

	public void verify_sec2_workBtn() {
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.elementToBeClickable(work_btn_sec2));
		String actual_txt = work_btn_sec2.getText();
		Assert.assertEquals(actual_txt, "HOW DOES IT WORK");
		work_btn_sec2.click();
		log.info("Clicked on the how does it work button in section 2");
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/FAQ");
		log.info("user is moved to FAQ page on tapping the How does it work button in section 2 ");
	}

	public void verify_sec2_img() {
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(img_sec2));
		boolean Element_Present = img_sec2.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Section-2 image is displayed");
	}

	public void verify_sec2_MultiplayLogo() {
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(multiplay_logo_sec2));
		boolean Element_Present = multiplay_logo_sec2.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Multiplay logo is displayed in section 2");

	}
}
