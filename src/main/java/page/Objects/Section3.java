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

public class Section3 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(Section3.class.getName());

	public Section3(WebDriver driver) {
		//BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	// section3
	@FindBy(xpath = "//div[@class=\"sectionheading\"]//p[contains(text(),'3')]")
	WebElement yellow_dot_sec3;
	@FindBy(xpath = "//div[@class=\"sectionheading\"]//p[contains(text(),'Join live revolution')]")
	WebElement yelllow_dot_sec3_txt;
	@FindBy(xpath = "//div//img[@src=\"/static/media/Phone.e7965dae561561cee2fe.webp\"]")
	WebElement img_sec3;
	@FindBy(xpath = "//div[@id=\"root\"]//div[5]//div[3]//p[@class=\"sliderhide slidernarrowtext typekit_BodySmallRegular webkit_primary_grey\"]")
	WebElement pre_txt_sec3;
	@FindBy(xpath = "//div[@id=\"root\"]//div[5]//div[3]//p[2][@class=\"sliderboldtext typekit_h3 webkit_primary_black\"]")
	WebElement title_txt_sec3;
	@FindBy(xpath = "//div[@id=\"root\"]//div[5]//div[3]//p[3][@class=\"slidernarrowtext typekit_BodySmallRegular webkit_primary_grey eltspace\"]")
	WebElement descriptive_txt1_sec3;
	@FindBy(xpath = "//div[@id=\"root\"]//div[5]//div[3]//div//p[@class=\"_st3 sliderdescription webkit_primary_black typekit_BodyRegular\"]")
	WebElement descriptive_txt2_sec3;
	@FindBy(xpath = "//div[@id=\"root\"]//div[5]//div[3]//div//button[@class=\"s3btnblue Darkbluebtn \"]")
	WebElement try_btn_sec3;
	@FindBy(xpath = "//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]")
	WebElement cancel_login;

	public void verify_sec3_txt() {

		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(yellow_dot_sec3));
		boolean Element_Present = yellow_dot_sec3.isDisplayed();
		Assert.assertTrue(Element_Present);
		String actual_txtt = yellow_dot_sec3.getText();
		Assert.assertEquals(actual_txtt, "3");
		log.info("section-3 found in the body");

		wait.until(ExpectedConditions.visibilityOf(yelllow_dot_sec3_txt));
		String actual_txt = yelllow_dot_sec3_txt.getText();
		Assert.assertEquals(actual_txt, "Join live revolution");
		log.info("Section-3 started");

		wait.until(ExpectedConditions.visibilityOf(pre_txt_sec3));
		String actual_txt1 = pre_txt_sec3.getText();
		Assert.assertEquals(actual_txt1, "Welcome to the new era");
		log.info("pre text in Section-3 matched with the expected text");

		wait.until(ExpectedConditions.visibilityOf(title_txt_sec3));
		String actual_txt4 = title_txt_sec3.getText();
		Assert.assertEquals(actual_txt4, "Become a trendsetter");
		log.info("title of the Section-3 matched with the expected title");

		wait.until(ExpectedConditions.visibilityOf(descriptive_txt1_sec3));
		String actual_txt2 = descriptive_txt1_sec3.getText();
		Assert.assertEquals(actual_txt2,
				"Open the world of live media & web3 and bring your customers to a new engaging reality");

		wait.until(ExpectedConditions.visibilityOf(descriptive_txt2_sec3));
		String actual_txt3 = descriptive_txt2_sec3.getText();
		Assert.assertEquals(actual_txt3,
				"In-built live streaming, video & voice calls are just a beginning. Our R&D department is already developing solutions for connected cities, cars & Metaverse. Become a part of this journey and make sure that your product is always at the cutting edge of technology.");
		log.info("Descriptive text of Section-3 matched with the expected text");
	}

	public void verify_sec3_TryBtn() {

		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.elementToBeClickable(try_btn_sec3));
		String actual_txt = try_btn_sec3.getText();
		Assert.assertEquals(actual_txt, "TRY FOR FREE");
		try_btn_sec3.click();
		log.info("Clicked on the try for free button in section 3");
		wait.until(ExpectedConditions.elementToBeClickable(cancel_login));
		cancel_login.click();
		log.info("Try for free button in section 3 is working fine");
	}

	public void verify_sec3_img() {

		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(img_sec3));
		boolean Element_Present = img_sec3.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Section-3 image is displayed");
	}

}
