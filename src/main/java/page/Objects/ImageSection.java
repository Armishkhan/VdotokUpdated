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

public class ImageSection {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(VdotokHome.class.getName());

	public ImageSection(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"headerComp \"]//div//p[1]")
	WebElement title_text_img_sec;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"headerComp \"]//div//p[2]")
	WebElement descriptive_text_img_sec;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div[@class=\"headerComp \"]//div//p[3]")
	WebElement free_mints_text;
	@FindBy(xpath = "//body//div[@class=\"headerComp \"]//button[@class=\" Darkbluebtn tryfree\"]")
	WebElement try_button_img_sec;
	@FindBy(xpath = "//body//div[@class=\"headerComp \"]//button[@class=\"Whitebtn watchdemo\"]")
	WebElement watchDem_btn_img_sec;
	@FindBy(xpath = "//body//div[@id=\"root\"]//div//div[@class=\"headerchild2 animate__animated animate__fadeInRight\"]//img[1]")
	WebElement right_img_img_sec;
	@FindBy(xpath = "//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]")
	WebElement cancel_login;
	@FindBy(xpath = "//img[@id=\"makeusunique\"]")
	WebElement play_demo_btn;

	public void verify_text() {
		String expected_title = "Need easy-to-use\n" + "APIs for live media?";
		wait.until(ExpectedConditions.visibilityOf(title_text_img_sec));
		String actual_title = title_text_img_sec.getText();
		Assert.assertEquals(actual_title, expected_title);
		log.info("website title matched");
		String expected_description = "Integrate live streaming, screen sharing, video and voice calls into any app or product. Bring your customers to the new reality.";
		wait.until(ExpectedConditions.visibilityOf(descriptive_text_img_sec));
		String actual_description = descriptive_text_img_sec.getText();
		Assert.assertEquals(actual_description, expected_description);
		log.info("website description matched");

		String expected_freeMnts = "Get 15 000 free minutes to play with";
		wait.until(ExpectedConditions.visibilityOf(free_mints_text));
		String actual_freeeMnts = free_mints_text.getText();
		Assert.assertEquals(actual_freeeMnts, expected_freeMnts);
		log.info("website text matched");
	}

	public void verify_image() {
		wait.until(ExpectedConditions.visibilityOf(right_img_img_sec));
		boolean IMGPresent = right_img_img_sec.isDisplayed();
		if (IMGPresent) {
			log.info("image found at top of the website");
			Assert.assertTrue(IMGPresent);
		} else
			log.info("image not found at top of the website");
	}

	public void verify_sec1_tryBtn() {
		String expected_btn_title = "TRY FOR FREE";
		wait.until(ExpectedConditions.visibilityOf(try_button_img_sec));
		String actual_btn_title = try_button_img_sec.getText();
		Assert.assertEquals(actual_btn_title, expected_btn_title);
		try_button_img_sec.click();
		log.info("Clicked on the Try for free button in the img section");
		wait.until(ExpectedConditions.visibilityOf(cancel_login));
		if (cancel_login.isDisplayed()) {
			log.info("Try for free button is working fine in the img section");
			cancel_login.click();
		} else
			log.info("Try for free button isn't working in the img section");
	}

	public void verify_sec1_DemoBtn() {
		String expected_demobtn_title = "WATCH DEMO";
		wait.until(ExpectedConditions.visibilityOf(watchDem_btn_img_sec));
		String actual_demobtn_title = watchDem_btn_img_sec.getText();
		Assert.assertEquals(actual_demobtn_title, expected_demobtn_title);
		watchDem_btn_img_sec.click();
		log.info("Clicked on the Watch Demo button in the img section");
		wait.until(ExpectedConditions.visibilityOf(play_demo_btn));
		if (play_demo_btn.isDisplayed()) {
			log.info("Watch Demo button is working fine in the img section");
			play_demo_btn.click();
		} else
			log.info("Watch Demo button isn't working in the img section");
	}

}
