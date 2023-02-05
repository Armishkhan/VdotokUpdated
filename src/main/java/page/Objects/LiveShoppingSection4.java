package page.Objects;

import java.time.Duration;
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

public class LiveShoppingSection4 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(HeaderSection.class.getName());

	public LiveShoppingSection4(WebDriver driver) {
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

	@FindBy(xpath = "//p[@class=\"typekit_h2 webkit_primary_black _feature_bold\"]")
	WebElement sec4_title;

	@FindBy(xpath = "//p[@class=\"_feature_normal typekit_subheadline4 webkit_primary_grey\"]")
	WebElement sec4_description;

	@FindBy(xpath = "//button[@id=\"LS\"]")
	WebElement sec4_LS_button;

	@FindBy(xpath = "//button[@id=\"O2O\"]")
	WebElement sec4_020_button;

	@FindBy(xpath = "//button[@id=\"ScSh\"]")
	WebElement sec4_SS_button;

	@FindBy(xpath = "//button[@id=\"MandM\"]")
	WebElement sec4_MandM_button;

	@FindBy(xpath = "//button[@id=\"EF\"]")
	WebElement sec4_EF_button;

	@FindBy(xpath = "//button[@id=\"Mess\"]")
	WebElement sec4_Mess_button;

	@FindBy(xpath = "//button[@id=\"FS\"]")
	WebElement sec4_FS_button;

	@FindBy(xpath = "//img[@src=\"/static/media/2741.62899fcecc5893dcf0a1.webp\"]")
	WebElement sec4_img1;

	@FindBy(xpath = "//img[@src=\"/static/media/2742.9c23983e89c162203762.webp\"]")
	WebElement sec4_img2;

	@FindBy(xpath = "//img[@src=\"/static/media/2743.1d0c487539951cbd9467.webp\"]")
	WebElement sec4_img3;

	@FindBy(xpath = "//img[@src=\"/static/media/2744.0a66f1906ab882738067.webp\"]")
	WebElement sec4_img4;

	@FindBy(xpath = "//img[@src=\"/static/media/2745.d6cf9c815c19ec31b378.webp\"]")
	WebElement sec4_img5;

	@FindBy(xpath = "//img[@src=\"/static/media/2746.32c256b97a5c38b09d1a.webp\"]")
	WebElement sec4_img6;

	@FindBy(xpath = "//img[@src=\"/static/media/2747.89a28cce42713f03640d.webp\"]")
	WebElement sec4_img7;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[1]//img")
	WebElement sec4_bullet1;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[2]//img")
	WebElement sec4_bullet2;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[3]//img")
	WebElement sec4_bullet3;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[4]//img")
	WebElement sec4_bullet4;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[5]//img")
	WebElement sec4_bullet5;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[1]//p")
	WebElement sec4_lin1_txt;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[2]//p")
	WebElement sec4_lin2_txt;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[3]//p")
	WebElement sec4_lin3_txt;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[4]//p")
	WebElement sec4_lin4_txt;

	@FindBy(xpath = "//div[@class=\"ft_right\"]//div[5]//p")
	WebElement sec4_lin5_txt;

	public void verify_sec4_txt() {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,2200)");
		wait.until(ExpectedConditions.visibilityOf(sec4_title));
		Assert.assertEquals(sec4_title.getText(), "What features can you integrate with VdoTok ?");
		wait.until(ExpectedConditions.visibilityOf(sec4_description));
		Assert.assertEquals(sec4_description.getText(),
				"Whether you are building an influencer selling solution, a tool for personal shopping or a live fashion show software, we have all the featrues you will need.");
	}

	public void verify_sec4_LS_button() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,3200)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(sec4_LS_button));
		Assert.assertEquals(sec4_LS_button.getText(), "LIVE STREAMING (ONE-TO-MANY)");
		sec4_LS_button.click();
		wait.until(ExpectedConditions.visibilityOf(sec4_img1));
		// Assert.assertEquals(sec4_title.getAttribute("src"),
		// "/static/media/2741.62899fcecc5893dcf0a1.webp");
		Assert.assertTrue(sec4_img1.isDisplayed());

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet1));
		Assert.assertTrue(sec4_bullet1.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin1_txt));
		Assert.assertEquals(sec4_lin1_txt.getText(),
				"Stay in trend with Live Shopping / Live Commerce / Social selling and boost your conversion rates & sales");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet2));
		Assert.assertTrue(sec4_bullet2.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin2_txt));
		Assert.assertEquals(sec4_lin2_txt.getText(),
				"Compatible with multiple platforms (Safari, Chrome, FireFox, Opera) and mobile operating systems (iOS, Android, Flutter)");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet3));
		Assert.assertTrue(sec4_bullet3.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin3_txt));
		Assert.assertEquals(sec4_lin3_txt.getText(),
				"Get reliable audio and video streams with a 300 ms average and 79 ms lowest latency");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet4));
		Assert.assertTrue(sec4_bullet4.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin4_txt));
		Assert.assertEquals(sec4_lin4_txt.getText(), "Stream content over Wi-Fi, 4G or 3G networks");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet5));
		Assert.assertTrue(sec4_bullet5.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin5_txt));
		Assert.assertEquals(sec4_lin5_txt.getText(), "Build an app like ClubHouse with our live audio streaming APIs");

	}

	public void verify_sec4_020_button() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,3200)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(sec4_020_button));
		Assert.assertEquals(sec4_020_button.getText(), "(ONE-TO-ONE / MANY-TO-MANY)");
		sec4_020_button.click();
		wait.until(ExpectedConditions.visibilityOf(sec4_img2));
		// Assert.assertEquals(sec4_title.getAttribute("src"),
		// "/static/media/2742.9c23983e89c162203762.webp");
		Assert.assertTrue(sec4_img2.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_bullet1));
		Assert.assertTrue(sec4_bullet1.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin1_txt));
		Assert.assertEquals(sec4_lin1_txt.getText(),
				"Get closer to your customers and establish a powerful brand by organising group video chats, video conferencing events and 1:1 consultations");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet2));
		Assert.assertTrue(sec4_bullet2.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin2_txt));
		Assert.assertEquals(sec4_lin2_txt.getText(),
				"Stay on top of technology trends with HD- Quality Audio/Video Calls.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet3));
		Assert.assertTrue(sec4_bullet3.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin3_txt));
		Assert.assertEquals(sec4_lin3_txt.getText(),
				"Reach to your audience even under weak network conditions: get reliable audio and video streams with a 300 ms average and 79 ms lowest latency");

	}

	public void verify_sec4_SS_button() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,3200)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(sec4_SS_button));
		Assert.assertEquals(sec4_SS_button.getText(), "SCREEN SHARING");
		sec4_SS_button.click();
		wait.until(ExpectedConditions.visibilityOf(sec4_img3));
		// Assert.assertEquals(sec4_title.getAttribute("src"),
		// "/static/media/2743.1d0c487539951cbd9467.webp");
		Assert.assertTrue(sec4_img3.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_bullet1));
		Assert.assertTrue(sec4_bullet1.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin1_txt));
		Assert.assertEquals(sec4_lin1_txt.getText(),
				"Use the power of screen sharing (mobile web browser & mobile to mobile) to walk your customers through your product or your online store.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet2));
		Assert.assertTrue(sec4_bullet2.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin2_txt));
		Assert.assertEquals(sec4_lin2_txt.getText(),
				"We are the only one in the industry who provides mobile web browser based screen sharing, so using VdoToks APIs will help you create a truly innovative product in your industry.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet3));
		Assert.assertTrue(sec4_bullet3.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin3_txt));
		Assert.assertEquals(sec4_lin3_txt.getText(),
				"Use screen sharing even during live streams to engage more people in one session.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet4));
		Assert.assertTrue(sec4_bullet4.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin4_txt));
		Assert.assertEquals(sec4_lin4_txt.getText(),
				"Built-in-privacy measures when using web-to-mobile screen sharing. Your push messages, notifications etc. will not be shared while doing session. And you are not sharing screens outside of mobile browser.");
	}

	public void verify_sec4_MandM_button() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,3200)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(sec4_MandM_button));
		Assert.assertEquals(sec4_MandM_button.getText(), "MIX & MASH FEATURES");
		sec4_MandM_button.click();
		wait.until(ExpectedConditions.visibilityOf(sec4_img4));
		// Assert.assertEquals(sec4_title.getAttribute("src"),
		// "/static/media/2744.0a66f1906ab882738067.webp");
		Assert.assertTrue(sec4_img4.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_bullet1));
		Assert.assertTrue(sec4_bullet1.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin1_txt));
		Assert.assertEquals(sec4_lin1_txt.getText(),
				"Build an immersive experience for your customers by adding multiple engaging features that can work seamlessly and simultaneously.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet2));
		Assert.assertTrue(sec4_bullet2.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin2_txt));
		Assert.assertEquals(sec4_lin2_txt.getText(),
				"Mix & mash any features that suit your product. For instance, combine video calling, screen sharing and internal app audio sharing to let your live streaming guests experience your brand in a whole new way and become loyal customers.");

	}

	public void verify_sec4_EF_button() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,3200)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(sec4_EF_button));
		Assert.assertEquals(sec4_EF_button.getText(), "ENGAGING FEATURES");
		sec4_EF_button.click();
		wait.until(ExpectedConditions.visibilityOf(sec4_img5));
		// Assert.assertEquals(sec4_title.getAttribute("src"),
		// "/static/media/2745.0a66f1906ab882738067.webp");
		Assert.assertTrue(sec4_img5.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_bullet1));
		Assert.assertTrue(sec4_bullet1.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin1_txt));
		Assert.assertEquals(sec4_lin1_txt.getText(),
				"Minimize cart abandonment and boost sales by creating an unbeatable live shopping experience with the extra features.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet2));
		Assert.assertTrue(sec4_bullet2.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin2_txt));
		Assert.assertEquals(sec4_lin2_txt.getText(),
				"Give your customers a possibility to screen cast your live shopping sessions on big screens and let them enjoy easy shopping from the sofa.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet3));
		Assert.assertTrue(sec4_bullet3.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin3_txt));
		Assert.assertEquals(sec4_lin3_txt.getText(),
				"VdoTok exclusive feature: Play and share audio from other apps such as YouTube in your Live session.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet4));
		Assert.assertTrue(sec4_bullet4.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin4_txt));
		Assert.assertEquals(sec4_lin4_txt.getText(),
				"Integrate doodling/draw on screen to explain complex products or to have your customers more engaged with your Live session.");

	}

	public void verify_sec4_Mess_button() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,3200)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(sec4_Mess_button));
		Assert.assertEquals(sec4_Mess_button.getText(), "MESSAGING");
		sec4_Mess_button.click();
		wait.until(ExpectedConditions.visibilityOf(sec4_img6));
		// Assert.assertEquals(sec4_title.getAttribute("src"),
		// "/static/media/2746.0a66f1906ab882738067.webp");
		Assert.assertTrue(sec4_img6.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_bullet1));
		Assert.assertTrue(sec4_bullet1.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin1_txt));
		Assert.assertEquals(sec4_lin1_txt.getText(), "Always free of cost messaging with VdoTok.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet2));
		Assert.assertTrue(sec4_bullet2.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin2_txt));
		Assert.assertEquals(sec4_lin2_txt.getText(),
				"One-to-one or one-to-many group chatting capabilities to connect customers all over the world with ultra-low latency.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet3));
		Assert.assertTrue(sec4_bullet3.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin3_txt));
		Assert.assertEquals(sec4_lin3_txt.getText(),
				"Enhance your Live Shopping experience with live interactions in the form of comments and messaging.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet4));
		Assert.assertTrue(sec4_bullet4.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin4_txt));
		Assert.assertEquals(sec4_lin4_txt.getText(),
				"QoS strategies for optimal performance even under weak networks.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet5));
		Assert.assertTrue(sec4_bullet5.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin5_txt));
		Assert.assertEquals(sec4_lin5_txt.getText(),
				"Make use of unlimited scalability. Our architecture provides support for massive concurrency of messages.");

	}

	public void verify_sec4_FS_button() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		liveShopping_title.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		js.executeScript("window.scrollBy(0,3200)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(sec4_FS_button));
		Assert.assertEquals(sec4_FS_button.getText(), "FILE SHARING");
		sec4_FS_button.click();
		wait.until(ExpectedConditions.visibilityOf(sec4_img7));
		// Assert.assertEquals(sec4_title.getAttribute("src"),
		// "/static/media/2747.0a66f1906ab882738067.webp");
		Assert.assertTrue(sec4_img7.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_bullet1));
		Assert.assertTrue(sec4_bullet1.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin1_txt));
		Assert.assertEquals(sec4_lin1_txt.getText(),
				"Enhance customer engagement and/or sell complex products by including files, images, or other rich media.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet2));
		Assert.assertTrue(sec4_bullet2.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin2_txt));
		Assert.assertEquals(sec4_lin2_txt.getText(),
				"Use file sharing feature without navigating away from your app, or compromising on security.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet3));
		Assert.assertTrue(sec4_bullet3.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin3_txt));
		Assert.assertEquals(sec4_lin3_txt.getText(),
				"Open shared files within the platform and have a conversation about it.");

		wait.until(ExpectedConditions.visibilityOf(sec4_bullet4));
		Assert.assertTrue(sec4_bullet4.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(sec4_lin4_txt));
		Assert.assertEquals(sec4_lin4_txt.getText(),
				"We don't store your files, so you have full control over your files by storing them in the cloud of your choice.");

	}

}