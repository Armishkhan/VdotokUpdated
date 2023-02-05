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

public class LiveShoppingSection1 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(HeaderSection.class.getName());

	public LiveShoppingSection1(WebDriver driver) {
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

	@FindBy(xpath = "//p[@class=\"typekit_h1 webkit_primary_black LSh1bp\"]")
	WebElement sec1_title;

	@FindBy(xpath = "//p[@class=\"typekit_subheadline1 webkit_primary_black LShdrdesc LSh1p2\"]")
	WebElement sec1_description;

	@FindBy(xpath = "//button[@class=\" Darkbluebtn LSjoinfree\"]")
	WebElement sec1_start_button;

	@FindBy(xpath = "//img[@class=\"LSperson-img\"]")
	WebElement sec1_ceo_img;

	@FindBy(xpath = "//p[@class=\"LSratingtextbold\"]")
	WebElement sec1_ceo_name;

	@FindBy(xpath = "//p[@class=\"LSratingtextnormal\"]")
	WebElement sec1_ceo_designation;

	@FindBy(xpath = "//img[@class=\"LSratingstars\"]")
	WebElement sec1_five_stars;

	@FindBy(xpath = "//img[@class=\"lsphone\"]")
	WebElement sec1_right_img;

	@FindBy(xpath = "//div[@id=\"navmodal-signup\"]//p[@class=\"heading-signup typekit_h3 webkit_primary_h\"]")
	WebElement signUp_title;

	public void verify_sec1_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.visibilityOf(sec1_title));
		Assert.assertEquals(sec1_title.getText(), "Convert & retain with Live Shopping");
		wait.until(ExpectedConditions.visibilityOf(sec1_description));
		Assert.assertEquals(sec1_description.getText(), "Provide a deeply engaging shopping experience\n"
				+ "and supercharge your sales by building\n" + "your own interactive live shopping solution.");
	}

	public void verify_sec1_startButton() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(sec1_start_button));
		Assert.assertEquals(sec1_start_button.getText(), "START BUILDING NOW");
		sec1_start_button.click();
		wait.until(ExpectedConditions.visibilityOf(signUp_title));
		Assert.assertTrue(signUp_title.isDisplayed());
	}

	public void verify_ceo_img() {
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.visibilityOf(sec1_ceo_img));
		Assert.assertTrue(sec1_ceo_img.isDisplayed());
	}

	public void verify_ceo_txt() {
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.visibilityOf(sec1_ceo_name));
		Assert.assertEquals(sec1_ceo_name.getText(), "Daniel");
		wait.until(ExpectedConditions.visibilityOf(sec1_ceo_designation));
		Assert.assertEquals(sec1_ceo_designation.getText(), "CEO, Togee AB");
	}

	public void verify_five_stars() {
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.visibilityOf(sec1_five_stars));
		Assert.assertTrue(sec1_five_stars.isDisplayed());
	}

	public void verify_right_img() {
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.visibilityOf(sec1_right_img));
		Assert.assertTrue(sec1_right_img.isDisplayed());
	}

}
