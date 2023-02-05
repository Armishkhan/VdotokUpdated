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

public class LiveShoppingSection6 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(HeaderSection.class.getName());

	public LiveShoppingSection6(WebDriver driver) {
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

	@FindBy(xpath = "//p[@class=\"typekit_h2 webkit_primary_black _customerstory_b\"]")
	WebElement sec6_title;

	@FindBy(xpath = "//p[@class=\"typekit_subheadline2 webkit_primary_grey _customerstory_p\"]")
	WebElement sec6_description;

	@FindBy(xpath = "//img[@class=\"cs-mbl\"]")
	WebElement sec6_left_img;

	@FindBy(xpath = "//p[@class=\"_cs_txtabsolute webkit_primary_black\"]")
	WebElement sec6_togee_link;

	@FindBy(xpath = "//div[@class=\"_cs_boxabsolute\"]")
	WebElement sec6_togee_card;

	@FindBy(xpath = "//img[@class=\"toggee_svg\"]")
	WebElement sec6_togee_logo;

	@FindBy(xpath = "//p[@class=\"typekit_h4 webkit_primary_h _cs_bp1\"]")
	WebElement sec6_togee_title;

	@FindBy(xpath = "//p[@class=\"typekit_BodyRegular webkit_primary_black _cs_bp2 \"]")
	WebElement sec6_togee_description;

	@FindBy(xpath = "//img[@class=\"_cs_categories\"]")
	WebElement sec6_bottom_img;

	public void verify_sec6_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4600)");
		wait.until(ExpectedConditions.visibilityOf(sec6_title));
		Assert.assertEquals(sec6_title.getText(), "Customer story");
		wait.until(ExpectedConditions.visibilityOf(sec6_description));
		Assert.assertEquals(sec6_description.getText(), "Our success story with Togee");
	}

	public void verify_sec6_left_img() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4600)");
		wait.until(ExpectedConditions.visibilityOf(sec6_left_img));
		Assert.assertTrue(sec6_left_img.isDisplayed());
	}

	public void verify_sec6_togee_link() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.elementToBeClickable(sec6_togee_link));
		Assert.assertEquals(sec6_togee_link.getText(), "www.togee.com");
		Thread.sleep(1000);
		sec6_togee_link.click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.togee.com/");
	}

	public void verify_sec6_togee_card() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(sec6_togee_card));
		Assert.assertTrue(sec6_togee_card.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec6_togee_logo));
		Assert.assertTrue(sec6_togee_logo.isDisplayed());
	}

	public void verify_sec6_togee_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(sec6_togee_title));
		Assert.assertEquals(sec6_togee_title.getText(), "Our Success story with Togee");
		wait.until(ExpectedConditions.visibilityOf(sec6_togee_description));
		Assert.assertEquals(sec6_togee_description.getText(),
				"Togee is a powerful and user-friendly live shopping tool with screen share that allows visitors and ambassadors sell online straight on top of an e-commerce website.\n"
						+ "\n"
						+ "With VdoTok Togee suceeded to build their own custom product in 4 months instead of 10 months according to the initial plan.\n"
						+ "\n"
						+ "Together with VdoTok Togee has built a platform with an exclusive feature only offered by Togee: \"Mobile-to-web screen sharing\". This feature allows users and streaming hosts to interact on top of their mobile web browsers. With this feature, users can host and attend live shopping sessions anywhere, anytime.");

	}

	public void verify_sec6_bottom_img() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(sec6_bottom_img));
		Assert.assertTrue(sec6_bottom_img.isDisplayed());
	}

}