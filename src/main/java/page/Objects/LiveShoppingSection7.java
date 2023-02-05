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

public class LiveShoppingSection7 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(HeaderSection.class.getName());

	public LiveShoppingSection7(WebDriver driver) {
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

	@FindBy(xpath = "//p[@class=\"typekit_h2 webkit_primary_h\"]")
	WebElement sec7_title;

	@FindBy(xpath = "//p[@class=\"typekit_subheadline4 webkit_primary_h _start_ls_P\"]")
	WebElement sec7_description;

	@FindBy(xpath = "//img[@class=\"start-ls-img\"]")
	WebElement sec7_bottom_img;

	@FindBy(xpath = "//button[@class=\"start-ls-btn\"]")
	WebElement sec7_try_button;

	@FindBy(xpath = "//div[@id=\"navmodal-signup\"]//p[@class=\"heading-signup typekit_h3 webkit_primary_h\"]")
	WebElement signUp_title;

	public void verify_sec7_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,5500)");
		wait.until(ExpectedConditions.visibilityOf(sec7_title));
		Assert.assertEquals(sec7_title.getText(), "Start building your own\n" + "live shopping solution today");
		wait.until(ExpectedConditions.visibilityOf(sec7_description));
		Assert.assertEquals(sec7_description.getText(),
				"Use our powerful and easy-to-use APIs to integrate the new generation of video and voice calls, messaging, live streaming and screen sharing to your e-commerce product and transform your customers’ lives by bringing them into the new reality.");
	}

	public void verify_sec7_bottom_img() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(sec7_bottom_img));
		Assert.assertTrue(sec7_bottom_img.isDisplayed());
	}

	public void verify_sec7_try_button() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		js.executeScript("window.scrollBy(0,6500)");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(sec7_try_button));
		sec7_try_button.click();
		wait.until(ExpectedConditions.visibilityOf(signUp_title));
		Assert.assertTrue(signUp_title.isDisplayed());
	}
}