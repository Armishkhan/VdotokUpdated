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

public class LiveShoppingSection3 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(HeaderSection.class.getName());

	public LiveShoppingSection3(WebDriver driver) {
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

	@FindBy(xpath = "//p[@class=\"build_ls_b typekit_h2 webkit_primary_h\"]")
	WebElement sec3_title;

	@FindBy(xpath = "//div[@class=\"build_ls_R1\"]//div[1]//div//img")
	WebElement sec3_card1_icon;

	@FindBy(xpath = "//div[@class=\"build_ls_R1\"]//div[1]//div//p")
	WebElement sec3_card1_title;

	@FindBy(xpath = "//div[@class=\"build_ls_R1\"]//div[1]//p[@class=\"typekit_BodyLargeRegular _build_p webkit_primary_grey\"]")
	WebElement sec3_card1_description;

	@FindBy(xpath = "//div[@class=\"build_ls_R1\"]//div[2]//div//img")
	WebElement sec3_card2_icon;

	@FindBy(xpath = "//div[@class=\"build_ls_R1\"]//div[2]//div//p")
	WebElement sec3_card2_title;

	@FindBy(xpath = "//div[@class=\"build_ls_R1\"]//div[2]//p[@class=\"typekit_BodyLargeRegular _build_p webkit_primary_grey\"]")
	WebElement sec3_card2_description;

	@FindBy(xpath = "//div[@class=\"build_ls_R2\"]//div[1]//div//img")
	WebElement sec3_card3_icon;

	@FindBy(xpath = "//div[@class=\"build_ls_R2\"]//div[1]//div//p")
	WebElement sec3_card3_title;

	@FindBy(xpath = "//div[@class=\"build_ls_R2\"]//div[1]//p[@class=\"typekit_BodyLargeRegular _build_p webkit_primary_grey\"]")
	WebElement sec3_card3_description;

	@FindBy(xpath = "//div[@class=\"build_ls_R2\"]//div[2]//div//img")
	WebElement sec3_card4_icon;

	@FindBy(xpath = "//div[@class=\"build_ls_R2\"]//div[2]//div//p")
	WebElement sec3_card4_title;

	@FindBy(xpath = "//div[@class=\"build_ls_R2\"]//div[2]//p[@class=\"typekit_BodyLargeRegular _build_p webkit_primary_grey\"]")
	WebElement sec3_card4_description;

	public void verify_sec3_title() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		wait.until(ExpectedConditions.visibilityOf(sec3_title));
		Assert.assertEquals(sec3_title.getText(), "So why build your own Live Shopping solution?");
	}

	public void verify_sec3_card1_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,1750)");
		wait.until(ExpectedConditions.visibilityOf(sec3_card1_icon));
		Assert.assertTrue(sec3_card1_icon.isDisplayed());
	}

	public void verify_sec3_card1_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,1750)");
		wait.until(ExpectedConditions.visibilityOf(sec3_card1_title));
		Assert.assertEquals(sec3_card1_title.getText(), "Live shopping software is costly");
		wait.until(ExpectedConditions.visibilityOf(sec3_card1_description));
		Assert.assertEquals(sec3_card1_description.getText(),
				"Most Live Shopping software companies make you pay fixed fees even in periods when you don’t use their services. You waste time on making a decision to try out their features and get stressed during the onboarding not willing to waste your budget.");
	}

	public void verify_sec3_card2_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,1750)");
		wait.until(ExpectedConditions.visibilityOf(sec3_card2_icon));
		Assert.assertTrue(sec3_card1_icon.isDisplayed());
	}

	public void verify_sec3_card2_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,1750)");
		wait.until(ExpectedConditions.visibilityOf(sec3_card2_title));
		Assert.assertEquals(sec3_card2_title.getText(), "Social media are limited");
		wait.until(ExpectedConditions.visibilityOf(sec3_card2_description));
		Assert.assertEquals(sec3_card2_description.getText(),
				"Social media live streaming lacks essential live shopping features, such as an instant add to cart. By depriving your viewers of an opportunity to add products to cart while in a stream you miss out on your spontaneous buyers.");
	}

	public void verify_sec3_card3_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(sec3_card3_icon));
		Assert.assertTrue(sec3_card1_icon.isDisplayed());
	}

	public void verify_sec3_card3_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(sec3_card3_title));
		Assert.assertEquals(sec3_card3_title.getText(), "Engaged customers shop more");
		wait.until(ExpectedConditions.visibilityOf(sec3_card3_description));
		Assert.assertEquals(sec3_card3_description.getText(),
				"Don’t limit yourself to what is on the market. Add extra features like mobile web browser screen sharing and annotation to your product to enhance your customer experience and supercharge your conversion rates.");
	}

	public void verify_sec3_card4_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(sec3_card4_icon));
		Assert.assertTrue(sec3_card4_icon.isDisplayed());
	}

	public void verify_sec3_card4_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.visibilityOf(sec3_card4_title));
		Assert.assertEquals(sec3_card4_title.getText(), "Get 100% control over your data");
		wait.until(ExpectedConditions.visibilityOf(sec3_card4_description));
		Assert.assertEquals(sec3_card4_description.getText(),
				"Avoid sharing your customer and visitor data with third party solutions. Less security issues and more control.");
	}
}
