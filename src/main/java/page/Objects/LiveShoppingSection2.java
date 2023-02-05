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

public class LiveShoppingSection2 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(HeaderSection.class.getName());

	public LiveShoppingSection2(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	@FindBy(xpath = "//body//div[@id=\"vdtnavbar\"]//ul[1]//li[1]//a")
	WebElement usecases_option;

	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent modal-up\"]//div[1]//div[2][@class=\"cardcontent\"]//p[1]")
	WebElement liveShopping_title;

	@FindBy(xpath = "//p[@class=\"stillsellbold typekit_h2 webkit_primary_black\"]")
	WebElement sec2_title;

	@FindBy(xpath = "//p[@class=\"stillsellnormal typekit_subheadline2 webkit_primary_grey eltspace\"]")
	WebElement sec2_description;

	public void verify_sec2_txt() {
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_title));
		Assert.assertEquals(sec2_title.getText(), "Still selling like it’s 2020?");
		wait.until(ExpectedConditions.visibilityOf(sec2_description));
		Assert.assertEquals(sec2_description.getText(), "It’s time to dive into the world of live commerce");
	}

	@FindBy(xpath = "//img[@class=\"stsl_like1 aos-init aos-animate\"]")
	WebElement sec2_card1_likeImg;

	@FindBy(xpath = "//img[@class=\"stsl_livebtn\"]")
	WebElement sec2_card1_liveImg;

	@FindBy(xpath = "//img[@class=\"stsl_mkup\"]")
	WebElement sec2_card1_makeupImg;

	@FindBy(xpath = "//img[@class=\"stsl_plus\"]")
	WebElement sec2_card1_plusImg;

	@FindBy(xpath = "//div[@class=\"dr1\"]//div[@class=\"stsl_txt\"]//p[1]")
	WebElement sec2_card1_title;

	@FindBy(xpath = "//div[@class=\"dr1\"]//div[@class=\"stsl_txt\"]//p[2]")
	WebElement sec2_card1_USD_txt;

	public void verify_sec2_card1_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card1_title));
		Assert.assertEquals(sec2_card1_title.getText(), "Make up pro +");
		wait.until(ExpectedConditions.visibilityOf(sec2_card1_USD_txt));
		Assert.assertEquals(sec2_card1_USD_txt.getText(), "9.99 USD");

	}

	public void verify_sec2_card1_liveImg() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card1_likeImg));
		Assert.assertTrue(sec2_card1_likeImg.isDisplayed());
	}

	public void verify_sec2_card1_likeImg() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card1_likeImg));
		Assert.assertTrue(sec2_card1_likeImg.isDisplayed());
	}

	public void verify_sec2_card1_makeupImg() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card1_makeupImg));
		Assert.assertTrue(sec2_card1_makeupImg.isDisplayed());
	}

	public void verify_sec2_card1_plusImg() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card1_plusImg));
		Assert.assertTrue(sec2_card1_plusImg.isDisplayed());
	}

	@FindBy(xpath = "//div[@class=\"dr1\"]//div[2]")
	WebElement sec2_card1_Vline;

	public void verify_sec2_card1_Vline1() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card1_Vline));
		Assert.assertTrue(sec2_card1_Vline.isDisplayed());
	}

	@FindBy(xpath = "//p[@class=\"typekit_h6 webkit_primary_h stsl-txt2-b\"]")
	WebElement sec2_card2_title;

	@FindBy(xpath = "//div[@class=\"r1_b2_txt stsl_inner_txt\"]//p[@class=\"typekit_BodyRegularMedium webkit_primary_black eltspace\"]")
	WebElement sec2_card2_description;

	@FindBy(xpath = "//img[@class=\"rocket\"]")
	WebElement sec2_card2_img;

	public void verify_sec2_card2_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card2_title));
		Assert.assertEquals(sec2_card2_title.getText(), "76%");
		wait.until(ExpectedConditions.visibilityOf(sec2_card2_description));
		Assert.assertEquals(sec2_card2_description.getText(),
				"Livestream shopping purchases during the\n" + "pandemic increased by 76%");

	}

	public void verify_sec2_card2_img() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card2_img));
		Assert.assertTrue(sec2_card2_img.isDisplayed());

	}

	@FindBy(xpath = "//p[@class=\"typekit_h6 webkit_YellowDark stsl-txt2-b\"]")
	WebElement sec2_card3_title;

	@FindBy(xpath = "//div[@class=\"stillsell_pt1 stsl_pt1 bdr-left aos-init aos-animate\"]//div[1]//p[2]")
	WebElement sec2_card3_description;

	@FindBy(xpath = "//div[@class=\"stillsell_pt1 stsl_pt1 bdr-left aos-init aos-animate\"]//div[1]//img")
	WebElement sec2_card3_img;

	public void verify_sec2_card3_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1700)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card3_title));
		Assert.assertEquals(sec2_card3_title.getText(), "10x");
		wait.until(ExpectedConditions.visibilityOf(sec2_card3_description));
		Assert.assertEquals(sec2_card3_description.getText(),
				"Companies report live commerce conversion rates are up to 10x higher than conventional ecommerce");

	}

	public void verify_sec2_card3_img() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1700)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card3_img));
		Assert.assertTrue(sec2_card3_img.isDisplayed());

	}

	@FindBy(xpath = "//div[@class=\"stsl_horz_line\"]")
	WebElement sec2_card3_Hline;

	public void verify_sec2_card1_Hline1() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card3_Hline));
		Assert.assertTrue(sec2_card3_Hline.isDisplayed());
	}

	@FindBy(xpath = "//p[@class=\"typekit_h6 webkit_PinkandRed stsl-txt2-b\"]")
	WebElement sec2_card4_title;

	@FindBy(xpath = "//div[@class=\"stillsell_pt2 stsl_pt2 aos-init aos-animate\"]//div[1]//p[2]")
	WebElement sec2_card4_description;

	@FindBy(xpath = "//div[@class=\"stillsell_pt2 stsl_pt2 aos-init aos-animate\"]//div[1]//img")
	WebElement sec2_card4_img;

	public void verify_sec2_card4_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1700)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card4_title));
		Assert.assertEquals(sec2_card4_title.getText(), "60%");
		wait.until(ExpectedConditions.visibilityOf(sec2_card4_description));
		Assert.assertEquals(sec2_card4_description.getText(),
				"60% of shoppers who tried livestream shopping said it improved their shopping experience");

	}

	public void verify_sec2_card4_img() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1700)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card4_img));
		Assert.assertTrue(sec2_card4_img.isDisplayed());

	}

	@FindBy(xpath = "//p[@class=\"typekit_h6 webkit_BlueSky stsl-txt2-b\"]")
	WebElement sec2_card5_title;

	@FindBy(xpath = "//div[@class=\"r3_b1 stillsell_pt1 stsl_pt1 bdr-left2 aos-init aos-animate\"]//div[1]//p[2]")
	WebElement sec2_card5_description;

	@FindBy(xpath = "//div[@class=\"r3_b1 stillsell_pt1 stsl_pt1 bdr-left2 aos-init aos-animate\"]//div[1]//img")
	WebElement sec2_card5_img;

	public void verify_sec2_card5_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card5_title));
		Assert.assertEquals(sec2_card5_title.getText(), "80%");
		wait.until(ExpectedConditions.visibilityOf(sec2_card5_description));
		Assert.assertEquals(sec2_card5_description.getText(),
				"80% of marketers think livestream commerce will be an important part of sharing products in the coming years");

	}

	public void verify_sec2_card5_img() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card5_img));
		Assert.assertTrue(sec2_card5_img.isDisplayed());

	}

	@FindBy(xpath = "//div[@class=\"dr3\"]//div[2]")
	WebElement sec2_card5_Vline;

	public void verify_sec2_card5_Vline1() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card5_Vline));
		Assert.assertTrue(sec2_card5_Vline.isDisplayed());
	}

	@FindBy(xpath = "//div[@class=\"stillsell_b6\"]//img[1]")
	WebElement sec2_card6_img;

	@FindBy(xpath = "//div[@class=\"stillsell_b6\"]//div//div//p[@class=\"typekit_h6 webkit_primary_black stsl-txt-b\"]")
	WebElement sec2_card6_title;

	@FindBy(xpath = "//div[@class=\"stillsell_b6\"]//div//div//div//p[1]")
	WebElement sec2_card6_start_txt;

	@FindBy(xpath = "//div[@class=\"stillsell_b6\"]//div//div//div//p[2]")
	WebElement sec2_card6_end_txt;

	@FindBy(xpath = "//div[@class=\"stillsell_b6\"]//div//div//div//button")
	WebElement sec2_card6_live_button;

	public void verify_sec2_card6_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card6_title));
		Assert.assertEquals(sec2_card6_title.getText(), "Live session with influencer Isabella");
		wait.until(ExpectedConditions.visibilityOf(sec2_card6_start_txt));
		Assert.assertEquals(sec2_card6_start_txt.getText(), "Start: Jun 9, 10:30 IST");
		wait.until(ExpectedConditions.visibilityOf(sec2_card6_end_txt));
		Assert.assertEquals(sec2_card6_end_txt.getText(), "End: Jun 9, 12:30 IST");

	}

	public void verify_sec2_card6_img() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card6_img));
		Assert.assertTrue(sec2_card6_img.isDisplayed());

	}

	public void verify_sec2_card6_live_button() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(sec2_card6_live_button));
		Assert.assertEquals(sec2_card6_live_button.getText(), "GO LIVE");
	}

	@FindBy(xpath = "//img[@class=\"stillsell_frmup\"]")
	WebElement sec2_vdotok_icon1;

	@FindBy(xpath = "//img[@class=\"stillsell_frmright\"]")
	WebElement sec2_vdotok_icon2;

	@FindBy(xpath = "//img[@class=\"stillsell_frmleft\"]")
	WebElement sec2_vdotok_icon3;

	@FindBy(xpath = "//img[@class=\"stillsell_frmleft\"]")
	WebElement sec2_vdotok_icon4;

	public void verify_sec2_vdotok_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_vdotok_icon1));
		Assert.assertTrue(sec2_vdotok_icon1.isDisplayed());
		js.executeScript("window.scrollBy(0,500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_vdotok_icon2));
		Assert.assertTrue(sec2_vdotok_icon2.isDisplayed());
		js.executeScript("window.scrollBy(0,500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_vdotok_icon3));
		Assert.assertTrue(sec2_vdotok_icon3.isDisplayed());
		js.executeScript("window.scrollBy(0,500)");
		wait.until(ExpectedConditions.visibilityOf(sec2_vdotok_icon4));
		Assert.assertTrue(sec2_vdotok_icon4.isDisplayed());
	}

	@FindBy(xpath = "//p[@class=\"stillsellblur typekit_LabelSmall\"]")
	WebElement sec2_bottom_txt;

	@FindBy(xpath = "//span[@style=\"text-decoration: underline; cursor: pointer;\"]")
	WebElement sec2_bottom_link;

	public void verify_sec2_bottom_txt() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();

		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(sec2_bottom_txt));
		Assert.assertEquals(sec2_bottom_txt.getText(),
				"Stats source: fitsmallbusiness.com/livestream-shopping-statistics");
		sec2_bottom_txt.click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url1 = driver.getCurrentUrl();
		Assert.assertEquals(actual_url1, "https://fitsmallbusiness.com/livestream-shopping-statistics/");

	}

}