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

public class Section4 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(VdotokHome.class.getName());

	public Section4(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	// section4
	@FindBy(xpath = "//div[@id=\"demo\"]//p[@class=\"uniqueboldtext webkit_primary_h typekit_h2\"]")
	WebElement title_txt_sec4;
	@FindBy(xpath = "//div[@id=\"demo\"]//p[2][@class=\"typekit_BodyElevated webkit_primary_h uniquedesc\"]")
	WebElement descriptive_txt_sec4;
	@FindBy(xpath = "//div[@id=\"demo\"]//img[@src=\"/static/media/What-makes-us-different.fceb70c51ce793f581e5.webp\"]")
	WebElement img_sec4;
	@FindBy(xpath = "//img[@id=\"makeusunique\"]")
	WebElement play_demo_btn;

	public void verify_sec4_txt() {
		js.executeScript("window.scrollBy(0,3000)");
		wait.until(ExpectedConditions.visibilityOf(title_txt_sec4));
		String actual_txtt = title_txt_sec4.getText();
		Assert.assertEquals(actual_txtt, "Join live revolution");
		log.info("title of the Section-4 matched with the expected title");

		wait.until(ExpectedConditions.visibilityOf(descriptive_txt_sec4));
		String actual_txt = descriptive_txt_sec4.getText();
		Assert.assertEquals(actual_txt,
				"VdoTok's vision is to open the world of live media & web3 to every entrepreneur & developer and empower them to bring people to a new engaging reality. We call it live revolution.");
		log.info("Descriptive text of Section-4 matched with the expected text");
	}

	public void verify_sec4_img() {
		js.executeScript("window.scrollBy(0,3000)");
		wait.until(ExpectedConditions.visibilityOf(img_sec4));
		boolean Element_Present = img_sec4.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Section-4 image is displayed");
	}

	public void verify_sec4_demo() {
		js.executeScript("window.scrollBy(0,3000)");
		wait.until(ExpectedConditions.visibilityOf(play_demo_btn));
		play_demo_btn.click();
		log.info("Demo is displayed in section 4");
	}

}