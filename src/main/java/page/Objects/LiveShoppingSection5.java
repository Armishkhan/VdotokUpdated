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

public class LiveShoppingSection5 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(HeaderSection.class.getName());

	public LiveShoppingSection5(WebDriver driver) {
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

	@FindBy(xpath = "//p[@class=\"typekit_h2 webkit_primary_black _why_b\"]")
	WebElement sec5_title;

	@FindBy(xpath = "//p[@class=\"typekit_subheadline4 webkit_primary_grey _why_p\"]")
	WebElement sec5_description;

	@FindBy(xpath = "//div[@class=\"_whyls_R1\"]//div[1]//img")
	WebElement sec5_card1_icon;

	@FindBy(xpath = "//div[@class=\"_whyls_R1\"]//div[1]//p[1]")
	WebElement sec5_card1_title;

	@FindBy(xpath = "//div[@class=\"_whyls_R1\"]//div[1]//p[2]")
	WebElement sec5_card1_description;

	@FindBy(xpath = "//div[@class=\"_whyls_R1\"]//div[2]//img")
	WebElement sec5_card2_icon;

	@FindBy(xpath = "//div[@class=\"_whyls_R1\"]//div[2]//p[1]")
	WebElement sec5_card2_title;

	@FindBy(xpath = "//div[@class=\"_whyls_R1\"]//div[2]//p[2]")
	WebElement sec5_card2_description;

	@FindBy(xpath = "//div[@class=\"_whyls_R1\"]//div[3]//img")
	WebElement sec5_card3_icon;

	@FindBy(xpath = "//div[@class=\"_whyls_R1\"]//div[3]//p[1]")
	WebElement sec5_card3_title;

	@FindBy(xpath = "//div[@class=\"_whyls_R1\"]//div[3]//p[2]")
	WebElement sec5_card3_description;

	@FindBy(xpath = "//div[@class=\"_whyls_R2\"]//div[1]//img")
	WebElement sec5_card4_icon;

	@FindBy(xpath = "//div[@class=\"_whyls_R2\"]//div[1]//p[1]")
	WebElement sec5_card4_title;

	@FindBy(xpath = "//div[@class=\"_whyls_R2\"]//div[1]//p[2]")
	WebElement sec5_card4_description;

	@FindBy(xpath = "//div[@class=\"_whyls_R2\"]//div[2]//img")
	WebElement sec5_card5_icon;

	@FindBy(xpath = "//div[@class=\"_whyls_R2\"]//div[2]//p[1]")
	WebElement sec5_card5_title;

	@FindBy(xpath = "//div[@class=\"_whyls_R2\"]//div[2]//p[2]")
	WebElement sec5_card5_description;

	@FindBy(xpath = "//div[@class=\"_whyls_R2\"]//div[3]//img")
	WebElement sec5_card6_icon;

	@FindBy(xpath = "//div[@class=\"_whyls_R2\"]//div[3]//p[1]")
	WebElement sec5_card6_title;

	@FindBy(xpath = "//div[@class=\"_whyls_R2\"]//div[3]//p[2]")
	WebElement sec5_card6_description;

	public void verify_sec5_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4200)");
		wait.until(ExpectedConditions.visibilityOf(sec5_title));
		Assert.assertEquals(sec5_title.getText(), "Why use VdoTok for building\n" + "your own Live Shopping solution?");
		wait.until(ExpectedConditions.visibilityOf(sec5_description));
		Assert.assertEquals(sec5_description.getText(),
				"VdoTok is developed by true live media and WebRTC enthusiasts, so we took care of the smallest details\n"
						+ "when it comes to the quality and scalability, while also making it easier for developers to deploy.");
	}

	public void verify_sec5_card1_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4200)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card1_icon));
		Assert.assertTrue(sec5_card1_icon.isDisplayed());
	}

	public void verify_sec5_card1_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4200)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card1_title));
		Assert.assertEquals(sec5_card1_title.getText(), "Easy to integrate SDKs");
		wait.until(ExpectedConditions.visibilityOf(sec5_card1_description));
		Assert.assertEquals(sec5_card1_description.getText(),
				"Integrate our SDKs using your favorite programming languages within a few minutes with our easy-to-follow developer documentation and sample code.");

	}

	public void verify_sec5_card2_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4200)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card2_icon));
		Assert.assertTrue(sec5_card2_icon.isDisplayed());
	}

	public void verify_sec5_card2_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4200)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card2_title));
		Assert.assertEquals(sec5_card2_title.getText(), "Rapid deployment");
		wait.until(ExpectedConditions.visibilityOf(sec5_card2_description));
		Assert.assertEquals(sec5_card2_description.getText(),
				"Use our sample codes to build live shopping solutions ready for deployment within a day.");

	}

	public void verify_sec5_card3_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4200)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card3_icon));
		Assert.assertTrue(sec5_card3_icon.isDisplayed());
	}

	public void verify_sec5_card3_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4200)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card3_title));
		Assert.assertEquals(sec5_card3_title.getText(), "Low latency");
		wait.until(ExpectedConditions.visibilityOf(sec5_card3_description));
		Assert.assertEquals(sec5_card3_description.getText(),
				"We not only provide HD quality solutions but ensure low latency (<1%) across the continents. In-built bandwidth management with seamless switching between wifi and cellular.");

	}

	public void verify_sec5_card4_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4500)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card4_icon));
		Assert.assertTrue(sec5_card4_icon.isDisplayed());
	}

	public void verify_sec5_card4_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4500)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card4_title));
		Assert.assertEquals(sec5_card4_title.getText(), "Analytics");
		wait.until(ExpectedConditions.visibilityOf(sec5_card4_description));
		Assert.assertEquals(sec5_card4_description.getText(),
				"Dashboard provides detailed usage analytics down to the session level: keep track of each sessions quality, length of the session, number of participants and bandwidth usage (how much data was consumed during each session).");
	}

	public void verify_sec5_card5_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4600)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card4_icon));
		Assert.assertTrue(sec5_card4_icon.isDisplayed());
	}

	public void verify_sec5_card5_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4600)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card5_title));
		Assert.assertEquals(sec5_card5_title.getText(), "Compatible with major programming languages");
		wait.until(ExpectedConditions.visibilityOf(sec5_card5_description));
		Assert.assertEquals(sec5_card5_description.getText(),
				"Use your favourite programming languages (JavaScript, Swift, Kotlin) or use Flutter to build cross-platform products quickly.");
	}

	public void verify_sec5_card6_icon() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4600)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card4_icon));
		Assert.assertTrue(sec5_card4_icon.isDisplayed());
	}

	public void verify_sec5_card6_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,4500)");
		wait.until(ExpectedConditions.visibilityOf(sec5_card6_title));
		Assert.assertEquals(sec5_card6_title.getText(), "Security");
		wait.until(ExpectedConditions.visibilityOf(sec5_card6_description));
		Assert.assertEquals(sec5_card6_description.getText(),
				"We are GDPR ready. You own your customers data. We don't store end-customer data. We provide end-to-end secure (encrypted) communication.");
	}
}