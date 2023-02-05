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

public class Section8 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(Section8.class.getName());

	public Section8(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	// Section8
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"trycomponent\"]//div[1]//p[1]")
	WebElement sec8_title_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"trycomponent\"]//div[1]//p[2]")
	WebElement sec8_descriptive_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"trycomponent\"]//div[1]//button")
	WebElement sec8_tryBtn;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"trycomponent\"]//div[2]//img")
	WebElement sec8_img;
	@FindBy(xpath = "//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]")
	WebElement cancel_login;

	public void verify_sec8_txt() {
		js.executeScript("window.scrollBy(0,5800)");
		wait.until(ExpectedConditions.visibilityOf(sec8_title_txt));
		String actual_txt = sec8_title_txt.getText();
		Assert.assertEquals(actual_txt, "Ready to try it out?");
		log.info("title of the Section-8 matched with the expected title");

		wait.until(ExpectedConditions.visibilityOf(sec8_descriptive_txt));
		String actual_txt2 = sec8_descriptive_txt.getText();
		Assert.assertEquals(actual_txt2,
				"Try VdoTok for free while we’re in beta. Test our powerful and easy-to-use APIs to integrate new generation of video and voice calls, messaging, live streaming and screen sharing to your product and transform your customers’ lives by bringing them into the new reality.");
		log.info("Descriptive text of Section-8 matched with the expected text");
	}

	public void verify_sec8_tryBtn() {
		js.executeScript("window.scrollBy(0,5800)");
		wait.until(ExpectedConditions.elementToBeClickable(sec8_tryBtn));
		String actual_txt1 = sec8_tryBtn.getText();
		Assert.assertEquals(actual_txt1, "TRY IT FOR FREE NOW");
		sec8_tryBtn.click();
		log.info("Clicked on the try for free button in section 8");
		wait.until(ExpectedConditions.elementToBeClickable(cancel_login));
		log.info("sign in pop up opened on clicking the try for free button in section-8");
		cancel_login.click();
	}

	public void verify_sec8_img() {
		js.executeScript("window.scrollBy(0,5800)");
		wait.until(ExpectedConditions.visibilityOf(sec8_img));
		boolean Element_Present = sec8_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("img is displayed for section-8");
	}

}