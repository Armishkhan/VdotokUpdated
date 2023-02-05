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

public class Section5 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(Section5.class.getName());

	public Section5(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	// Section5
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//p[@class=\"webkit_primary_black typekit_h2 otherunique\"]")
	WebElement title_txt_sec5;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//p[2][@class=\"othersdescription typekit_BodyRegular webkit_primary_black\"]")
	WebElement descriptive_txt_sec5;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"headerbtns\"]//button")
	WebElement try_btn_sec5;
	@FindBy(xpath = "//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]")
	WebElement cancel_login;

	public void verify_sec5_txt() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(title_txt_sec5));
		String actual_txtt = title_txt_sec5.getText();
		Assert.assertEquals(actual_txtt, "What others are building");
		log.info("title of the Section-5 matched with the expected title");

		wait.until(ExpectedConditions.visibilityOf(descriptive_txt_sec5));
		String actual_txt = descriptive_txt_sec5.getText();
		Assert.assertEquals(actual_txt,
				"Build HD quality connections for one-to-one, one-to-many, many-to-many calls & streaming.");
		log.info("Descriptive text of Section-4 matched with the expected text");
	}

	public void verify_sec5_btn() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.elementToBeClickable(try_btn_sec5));
		String actual_txt = try_btn_sec5.getText();
		Assert.assertEquals(actual_txt, "TRY FOR FREE");
		try_btn_sec5.click();
		log.info("Clicked on the try for free button in section 5");
		wait.until(ExpectedConditions.elementToBeClickable(cancel_login));
		log.info("Try for free button in section 5 is working fine");
		cancel_login.click();
	}

	// Section5 Card1
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"circle\"]//img[@src=\"/static/media/blueimg.d9b9d5a945d3094eb3bf.png\"]")
	WebElement img_card1;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"circle\"]//img[@src=\"/static/media/blueimg.d9b9d5a945d3094eb3bf.png\"]")
	WebElement toggle_card1;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"otherscontent\"]//p[@class=\"cardheading webkit_GreenGrass typekit_LabelXXL\"]")
	WebElement title_card1;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"otherscontent\"]//p[2][@class=\"card_p webkit_GreenGrass typekit_BodySmallRegular\"]")
	WebElement opt1_card1;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"otherscontent\"]//p[3][@class=\"card_p webkit_GreenGrass typekit_BodySmallRegular\"]")
	WebElement opt2_card1;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"otherscontent\"]//p[4][@class=\"card_p webkit_GreenGrass typekit_BodySmallRegular\"]")
	WebElement opt3_card1;

	public void verify_card1_img() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(img_card1));
		boolean Element_Present = img_card1.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Img is displayed for Card-1 in section 5");
	}

	public void verify_card1_toggle() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(toggle_card1));
		boolean Element_Present = toggle_card1.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("toggle is displayed for Card-1 in section 5");
	}

	public void verify_card1_txt() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(title_card1));
		String actual_txtt = title_card1.getText();
		Assert.assertEquals(actual_txtt, "Live\n" + "shopping app");

		wait.until(ExpectedConditions.visibilityOf(opt1_card1));
		String actual_txt = opt1_card1.getText();
		Assert.assertEquals(actual_txt, "- Live streaming");

		wait.until(ExpectedConditions.visibilityOf(opt2_card1));
		String actual_txt1 = opt2_card1.getText();
		Assert.assertEquals(actual_txt1, "- Social engagement");

		wait.until(ExpectedConditions.visibilityOf(opt3_card1));
		String actual_txt2 = opt3_card1.getText();
		Assert.assertEquals(actual_txt2, "- Messaging");

		log.info("Descriptive text of Card-1 matched with the expected text in section 5");
	}

	// Section5 Card2
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"bottomcircle\"]//img[@src=\"/static/media/yellowimg.3ed0407ce37a039f14f1.png\"]")
	WebElement img_card2;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"toggle\"]//img[@src=\"/static/media/yellow.17dbeffd4422b01a459358e3e7861e59.svg\"]")
	WebElement toggle_card2;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[@class=\"cardheading webkit_YellowDark typekit_LabelXXL\"]")
	WebElement title_card2;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[2][@class=\"card_p webkit_YellowDark typekit_BodySmallRegular\"]")
	WebElement opt1_card2;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[3][@class=\"card_p webkit_YellowDark typekit_BodySmallRegular\"]")
	WebElement opt2_card2;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[4][@class=\"card_p webkit_YellowDark typekit_BodySmallRegular\"]")
	WebElement opt3_card2;

	public void verify_card2_img() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(img_card2));
		boolean Element_Present = img_card2.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Img is displayed for Card-2 in section 5");
	}

	public void verify_card2_toggle() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(toggle_card2));
		boolean Element_Present = toggle_card2.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("toggle is displayed for Card-2 in section 5");
	}

	public void verify_card2_txt() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(title_card2));
		String actual_txtt = title_card2.getText();
		Assert.assertEquals(actual_txtt, "Online\n" + "education platform");

		wait.until(ExpectedConditions.visibilityOf(opt1_card2));
		String actual_txt = opt1_card2.getText();
		Assert.assertEquals(actual_txt, "- Webinars");

		wait.until(ExpectedConditions.visibilityOf(opt2_card2));
		String actual_txt1 = opt2_card2.getText();
		Assert.assertEquals(actual_txt1, "- Screen sharing");

		wait.until(ExpectedConditions.visibilityOf(opt3_card2));
		String actual_txt2 = opt3_card2.getText();
		Assert.assertEquals(actual_txt2, "- Video calls");

		log.info("Descriptive text of Card-2 matched with the expected text in section 5");
	}

	// Section5 Card3
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"circle\"]//img[@src=\"/static/media/purpleimg.c7b365e23bcd6d3da09c.png\"]")
	WebElement img_card3;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"toggle\"]//img[@src=\"/static/media/purple.298179639a9052f6e44e24ab45312289.svg\"]")
	WebElement toggle_card3;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[@class=\"cardheading webkit_Bluemoon typekit_LabelXXL\"]")
	WebElement title_card3;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"otherscontent\"]//p[2]")
	WebElement opt1_card3;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"otherscontent\"]//p[3]")
	WebElement opt2_card3;
	@FindBy(xpath = "//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"otherscontent\"]//p[4]")
	WebElement opt3_card3;

	public void verify_card3_img() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(img_card3));
		boolean Element_Present = img_card3.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Section-4 image is displayed");
		log.info("Img is displayed for Card-3 in section 5");
	}

	public void verify_card3_toggle() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(toggle_card3));
		boolean Element_Present = toggle_card3.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("toggle is displayed for Card-3 in section 5");
	}

	public void verify_card3_txt() {
		js.executeScript("window.scrollBy(0,3500)");
		wait.until(ExpectedConditions.visibilityOf(title_card3));
		String actual_txtt = title_card3.getText();
		Assert.assertEquals(actual_txtt, "Online\n" + "doctor");

		wait.until(ExpectedConditions.visibilityOf(opt1_card3));
		String actual_txt = opt1_card3.getText();
		Assert.assertEquals(actual_txt, "- Voice & video calls");

		wait.until(ExpectedConditions.visibilityOf(opt2_card3));
		String actual_txt1 = opt2_card3.getText();
		Assert.assertEquals(actual_txt1, "- Messaging");

		wait.until(ExpectedConditions.visibilityOf(opt3_card3));
		String actual_txt2 = opt3_card3.getText();
		Assert.assertEquals(actual_txt2, "- Remote monitoring");

		log.info("Descriptive text of Card-3 matched with the expected text in section 5");
	}

	// Section5 Card4
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"nclass\"]//div[@class=\"othersmins\"]//img[1]")
	WebElement TopImg_card4;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"nclass\"]//div[@class=\"othersmins\"]//p[1]")
	WebElement txt1_card4;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"nclass\"]//div[@class=\"othersmins\"]//p[2]")
	WebElement txt2_card4;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"nclass\"]//div[@class=\"othersmins\"]//img[2]")
	WebElement BottomImg_card4;

	public void verify_card4_Topimg() {
		js.executeScript("window.scrollBy(0,3700)");
		wait.until(ExpectedConditions.visibilityOf(TopImg_card4));
		boolean Element_Present = TopImg_card4.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Top Img is displayed for Card-4 in section 5");
	}

	public void verify_card4_txt() {
		js.executeScript("window.scrollBy(0,3700)");
		wait.until(ExpectedConditions.visibilityOf(txt1_card4));
		String actual_txtt = txt1_card4.getText();
		Assert.assertEquals(actual_txtt, "241 Minutes");

		wait.until(ExpectedConditions.visibilityOf(txt2_card4));
		String actual_txt = txt2_card4.getText();
		Assert.assertEquals(actual_txt, "(aug)");

		log.info("Descriptive text of Card-4 matched with the expected text in section 5");

	}

	public void verify_card4_Btmimg() {
		js.executeScript("window.scrollBy(0,3700)");
		wait.until(ExpectedConditions.visibilityOf(BottomImg_card4));
		boolean Element_Present = BottomImg_card4.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Bottom Img is displayed for Card-4 in section 5");

	}
}