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

public class Section1 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(Section1.class.getName());

	public Section1(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[1]//img[@src=\"/static/media/toggle.d17c168685faa938121d59c5802bb74e.svg\"]")
	WebElement smooth_toggle;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[1]//p[@class=\"texttoggle eltspace webkit_primary_h typekit_LabelXL\"]")
	WebElement smooth_txt;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[2]//img[@src=\"/static/media/toggle.d17c168685faa938121d59c5802bb74e.svg\"]")
	WebElement scalable_toggle;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[2]//p[@class=\"texttoggle eltspace webkit_primary_h typekit_LabelXL\"]")
	WebElement scalable_txt;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[3]//img[@src=\"/static/media/toggle.d17c168685faa938121d59c5802bb74e.svg\"]")
	WebElement secure_toggle;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[3]//p[@class=\"texttoggle eltspace webkit_primary_h typekit_LabelXL\"]")
	WebElement secure_txt;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"SliderTextbolddiv animate__animated animate__bounce\"]//p[1]")
	WebElement body_title;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"SliderTextbolddiv animate__animated animate__bounce\"]//p[2]")
	WebElement body_description;

	public void verify_smooth_toggle() {
		wait.until(ExpectedConditions.visibilityOf(smooth_toggle));
		boolean IMGPresent = smooth_toggle.isDisplayed();
		Assert.assertTrue(IMGPresent);
		log.info("Toggle displayed for Smooth option in the body section");
	}

	public void verify_smooth_txt() {
		String expected_txt = "Smooth";
		wait.until(ExpectedConditions.visibilityOf(smooth_txt));
		String actual_txt = smooth_txt.getText();
		Assert.assertEquals(actual_txt, expected_txt);
		log.info("Smooth option displyed in the body section");
	}

	public void verify_scalable_toggle() {
		wait.until(ExpectedConditions.visibilityOf(scalable_toggle));
		boolean IMGPresent = scalable_toggle.isDisplayed();
		Assert.assertTrue(IMGPresent);
		log.info("Toggle displayed for Scalable option in the body section");
	}

	public void verify_scalable_txt() {
		String expected_txt = "Scalable";
		wait.until(ExpectedConditions.visibilityOf(scalable_txt));
		String actual_txt = scalable_txt.getText();
		Assert.assertEquals(actual_txt, expected_txt);
		log.info("Scalable option displyed in the body section");
	}

	public void verify_secure_toggle() {
		wait.until(ExpectedConditions.visibilityOf(secure_toggle));
		boolean IMGPresent = secure_toggle.isDisplayed();
		Assert.assertTrue(IMGPresent);
		log.info("Toggle displayed for Secure option in the body section");
	}

	public void verify_secure_txt() {
		String expected_txt = "Secure";
		wait.until(ExpectedConditions.visibilityOf(secure_txt));
		String actual_txt = secure_txt.getText();
		Assert.assertEquals(actual_txt, expected_txt);
		log.info("Secure option displyed in the body section");
	}

	public void verify_body_title_txt() {
		wait.until(ExpectedConditions.visibilityOf(body_title));
		String actual_txt = body_title.getText();
		Assert.assertEquals(actual_txt, "Why integrating live media with VdoTok?");
		log.info("Title od the body displayed and matched with the expected title");
	}

	public void verify_body_description_txt() {
		wait.until(ExpectedConditions.visibilityOf(body_description));
		String actual_txt = body_description.getText();
		Assert.assertEquals(actual_txt, "Enter a new, post-pandemic era with your business. Together with us.");
		log.info("Description of the body displayed and matched with the expected description");

	}

	// section1
	@FindBy(xpath = "//div[@class=\"sectionheading\"]//p[contains(text(),'1')]")
	WebElement yellow_dot_sec1;
	@FindBy(xpath = "//div[@class=\"sectionheading\"]//p[contains(text(),'Messaging is old...')]")
	WebElement yelllow_dot_sec1_txt;
	@FindBy(xpath = "//div[@class=\"section aos-init aos-animate\"]//img[@src=\"/static/media/Img.002ee1f260dc2c2d92b3.webp\"]")
	WebElement img_sec1;
	@FindBy(xpath = "//div[@class=\"sectioncontent\"]//p[contains(text(),'What have we learned during the pandemic?')]")
	WebElement pre_txt_sec1;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"section aos-init aos-animate\"]//div[3]//p[@class=\"sliderboldtext typekit_h3 webkit_primary_black\"]")
	WebElement title_txt_sec1;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"section aos-init aos-animate\"]//div[3]//p[@class=\"slidernarrowtext typekit_BodySmallRegular webkit_primary_grey eltspace\"]")
	WebElement descriptive_txt1_sec1;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"section aos-init aos-animate\"]//div[3]//p[@class=\"sliderdescription webkit_primary_black typekit_BodyRegular\"]")
	WebElement descriptive_txt2_sec1;
	@FindBy(xpath = "//button[@class=\"Darkbluebtn explore \"]")
	WebElement explore_btn_sec1;
	@FindBy(xpath = "//button[@class=\"workingbtn Whitebtn\"]")
	WebElement work_btn_sec1;
	@FindBy(xpath = "//div[@class=\"sectionheading\"]//p[contains(text(),'3')]")
	WebElement yellow_dot_sec3;

	public void verify_sec1_txt() {
		js.executeScript("window.scrollBy(0,800)");
		wait.until(ExpectedConditions.visibilityOf(yellow_dot_sec1));
		boolean Element_Present = yellow_dot_sec1.isDisplayed();
		Assert.assertTrue(Element_Present);
		String actual_txtt = yellow_dot_sec1.getText();
		Assert.assertEquals(actual_txtt, "1");
		log.info("section-1 found in the body");

		wait.until(ExpectedConditions.visibilityOf(yelllow_dot_sec1_txt));
		String actual_txt = yelllow_dot_sec1_txt.getText();
		Assert.assertEquals(actual_txt, "Messaging is old...");
		log.info("Section-1 started");

		wait.until(ExpectedConditions.visibilityOf(pre_txt_sec1));
		String actual_txt1 = pre_txt_sec1.getText();
		Assert.assertEquals(actual_txt1, "What have we learned during the pandemic?");
		log.info("pre text in Section-1 matched with the expected text");

		wait.until(ExpectedConditions.visibilityOf(title_txt_sec1));
		String actual_txt4 = title_txt_sec1.getText();
		Assert.assertEquals(actual_txt4, "Messaging is so 2020");
		log.info("title of the Section-1 matched with the expected title");

		wait.until(ExpectedConditions.visibilityOf(descriptive_txt1_sec1));
		String actual_txt2 = descriptive_txt1_sec1.getText();
		Assert.assertEquals(actual_txt2, "It’s time to say goodbye to chat bots, decision trees and live chat queues.");

		wait.until(ExpectedConditions.visibilityOf(descriptive_txt2_sec1));
		String actual_txt3 = descriptive_txt2_sec1.getText();
		Assert.assertEquals(actual_txt3,
				"Work, shopping, seeing a doctor, training... The pandemic has pushed us to do many things online. Today a quick, personal and engaging live experience with your product or service has transitioned from “a nice to have” to “a must”.");
		log.info("Description of Section-1 matched with the expected text");
	}

	public void verify_sec1_img() {
		js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.visibilityOf(img_sec1));
		boolean Element_Present = img_sec1.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Section-1 image is displayed");
	}

	public void verify_sec1_exploreBtn() {
		js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.elementToBeClickable(explore_btn_sec1));
		String actual_txt = explore_btn_sec1.getText();
		Assert.assertEquals(actual_txt, "EXPLORE ALTERNATIVES");
		explore_btn_sec1.click();
		log.info("clicked on the explore alternatives button in section-1");
		wait.until(ExpectedConditions.visibilityOf(yellow_dot_sec3));
		boolean Element_Present = yellow_dot_sec3.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("user is moved to section 3 on clicking the explore alternatives button in section 1");
	}

	public void verify_sec1_workBtn() {
		js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.elementToBeClickable(work_btn_sec1));
		String actual_txt = work_btn_sec1.getText();
		Assert.assertEquals(actual_txt, "HOW DOES IT WORK");
		work_btn_sec1.click();
		log.info("clicked on the explore alternatives button in section-1");
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/FAQ");
		log.info("user is moved to FAQ page on tapping the How does it work button in section 1 ");
	}

}
