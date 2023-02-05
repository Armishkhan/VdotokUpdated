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

public class DocsToolsSection {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(DocsToolsSection.class.getName());

	public DocsToolsSection(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}
	
	@FindBy(xpath = "//body//div[@id=\"vdtnavbar\"]//ul[1]//li[2]//a")
	WebElement docs_option;
	
	@FindBy(xpath = "//img[@src=\"/static/media/logo2.89454a83.png\"]")
	WebElement vdotok_logo;
	
	@FindBy(xpath = "//p[@class=\"helloText\"]")
	WebElement page_title;
	
	public void verify_vdotok_logo()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(vdotok_logo));
		boolean icon = vdotok_logo.isDisplayed();
		Assert.assertTrue(icon);
		log.info("Vdotok logo has been displayed at the top of the page");
	}
	
	public void verify_page_title()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(page_title));
		Assert.assertEquals(page_title.getText(), "Hello, May I help you?");
		log.info("Title displayed on the Docs&Tools Page");
	}
	//Card1
	
	@FindBy(xpath = "//div[@class=\"getstartedCardsContainer\"]//div[1]//p[1]")
	WebElement card1_title;
	
	@FindBy(xpath = "//div[@class=\"getstartedCardsContainer\"]//div[1]//p[2]")
	WebElement card1_description;
	
	@FindBy(xpath = "//div[@class=\"getstartedCardsContainer\"]//div[1]//button")
	WebElement card1_button;
	
	public void verify_card1_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(card1_title));
		Assert.assertEquals(card1_title.getText(), "HOW TO");
		wait.until(ExpectedConditions.elementToBeClickable(card1_description));
		Assert.assertEquals(card1_description.getText(), "We offer a number of different APIs and libraries that make it easy for you to use our services globally.");
		log.info("Card1 is displayed along with description");
	}
	
	public void verify_card1_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(card1_button));
		Assert.assertEquals(card1_button.getText(), "GET STARTED");
		card1_button.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/gettingstarted/accountsetup");
		log.info("GET STARTED button is working fine");
	}
		
	//Card2
	
	@FindBy(xpath = "//div[@class=\"getstartedCardsContainer\"]//div[2]//p[1]")
	WebElement card2_title;
	
	@FindBy(xpath = "//div[@class=\"getstartedCardsContainer\"]//div[2]//p[2]")
	WebElement card2_description;
	
	@FindBy(xpath = "//div[@class=\"getstartedCardsContainer\"]//div[2]//button")
	WebElement card2_button;
	
	public void verify_card2_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(card2_title));
		Assert.assertEquals(card2_title.getText(), "SDK Downloads");
		wait.until(ExpectedConditions.elementToBeClickable(card2_description));
		Assert.assertEquals(card2_description.getText(), "Download the SDK's for VdoTok server side SMS, Verification, Voice & Video.");
		log.info("Card2 is displayed along with description");
	}
	
	public void verify_card2_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(card2_button));
		Assert.assertEquals(card2_button.getText(), "DOWNLOAD");
		card2_button.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/login");
		log.info("DOWNLOAD button is working fine");
	}
	
	//Card3
	
	@FindBy(xpath = "//div[@class=\"getstartedCardsContainer\"]//div[3]//p[1]")
	WebElement card3_title;
	
	@FindBy(xpath = "//div[@class=\"getstartedCardsContainer\"]//div[3]//p[2]")
	WebElement card3_description;
	
	@FindBy(xpath = "//div[@class=\"getstartedCardsContainer\"]//div[3]//button")
	WebElement card3_button;
	
	public void verify_card3_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(card3_title));
		Assert.assertEquals(card3_title.getText(), "Sample Code");
		wait.until(ExpectedConditions.elementToBeClickable(card3_description));
		Assert.assertEquals(card3_description.getText(), "Find out more about the APIs that VdoTok has to offer and learn how to use them.");
		log.info("Card3 is displayed along with description");
	}
	
	public void verify_card3_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(card3_button));
		Assert.assertEquals(card3_button.getText(), "CHECK GITHUB");
		card3_button.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://github.com/vdotok?tab=repositories");
		log.info("CHECH GITHUB button is working fine");
	}

	//Bottom Card1
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[1][@class=\"docSingleBottomCard\"]//div[1][@class=\"docSingleCardTop\"]//p[1]")
	WebElement bottom_card1_title;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[1][@class=\"docSingleBottomCard\"]//div[1][@class=\"docSingleCardTop\"]//p[2]")
	WebElement bottom_card1_description;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[1][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[1]")
	WebElement bottom_card1_option1;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[1][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[2]")
	WebElement bottom_card1_option2;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[1][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[3]")
	WebElement bottom_card1_option3;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[1][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[4]")
	WebElement bottom_card1_option4;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[1][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[5]")
	WebElement bottom_card1_SeeAll;
	
	public void verify_bottom_card1_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card1_title));
		Assert.assertEquals(bottom_card1_title.getText(), "Messaging");
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card1_description));
		Assert.assertEquals(bottom_card1_description.getText(), "Send and receive messages globally with ease and confidence when you use the VdoTok Conversation API.");
		log.info("Bottom Card1 is displayed along with description");
	}
	
	public void verify_bottom_card1_option1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card1_option1));
		Assert.assertEquals(bottom_card1_option1.getText(), "Introduction");
		bottom_card1_option1.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/messaging/javascript#MsgJsInstallation");
		log.info("introduction option is displayed for Messaging SDK");
	}
	
	public void verify_bottom_card1_option2()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card1_option2));
		Assert.assertEquals(bottom_card1_option2.getText(), "Messaging for Android");
		bottom_card1_option2.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/messaging/android#MsgJsInstallation");
		log.info("Messaging for Android option is displayed for Messaging SDK");
	}
	
	public void verify_bottom_card1_option3()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card1_option3));
		Assert.assertEquals(bottom_card1_option3.getText(), "Messaging for IOS");
		bottom_card1_option3.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/messaging/ios#MsgJsInstallation");
		log.info("Messaging for IOS option is displayed for Messaging SDK");
	}
	
	public void verify_bottom_card1_option4()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card1_option4));
		Assert.assertEquals(bottom_card1_option4.getText(), "Sample Code");
		bottom_card1_option4.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://github.com/vdotok/JS-chat");
		log.info("Sample Code option is displayed for Messaging SDK");
	}
	
	public void verify_bottom_card1_seeAll()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card1_SeeAll));
		Assert.assertEquals(bottom_card1_SeeAll.getText(), "SEE ALL");
		bottom_card1_SeeAll.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://github.com/vdotok?tab=repositories");
		log.info("SEE ALL option is displayed for Messaging SDK");
	}
	
	//Bottom Card2
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[2][@class=\"docSingleBottomCard\"]//div[1][@class=\"docSingleCardTop\"]//p[1]")
	WebElement bottom_card2_title;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[2][@class=\"docSingleBottomCard\"]//div[1][@class=\"docSingleCardTop\"]//p[2]")
	WebElement bottom_card2_description;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[2][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[1]")
	WebElement bottom_card2_option1;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[2][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[2]")
	WebElement bottom_card2_option2;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[2][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[3]")
	WebElement bottom_card2_option3;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[2][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[4]")
	WebElement bottom_card2_option4;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[2][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[5]")
	WebElement bottom_card2_SeeAll;
	
	public void verify_bottom_card2_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card2_title));
		Assert.assertEquals(bottom_card2_title.getText(), "Audio Call");
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card2_description));
		Assert.assertEquals(bottom_card2_description.getText(), "VdoTok offers a platform for real time communication over the Internet.");
		log.info("Bottom Card2 is displayed along with description");
	}
	
	public void verify_bottom_card2_option1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card2_option1));
		Assert.assertEquals(bottom_card2_option1.getText(), "Introduction");
		bottom_card2_option1.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/audiocall/javascript#MsgJsInstallation");
		log.info("Introduction option is displayed for Audio Call SDK");
	}
	
	public void verify_bottom_card2_option2()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card2_option2));
		Assert.assertEquals(bottom_card2_option2.getText(), "Voice for iOS");
		bottom_card2_option2.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/audiocall/ios#MsgJsInstallation");
		log.info("Voice for iOS option is displayed for Audio Call SDK");
	}
	
	public void verify_bottom_card2_option3()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card2_option3));
		Assert.assertEquals(bottom_card2_option3.getText(), "Voice for Android");
		bottom_card2_option3.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/audiocall/android#MsgJsInstallation");
		log.info("Voice for Android option is displayed for Audio Call SDK");
	}
	
	public void verify_bottom_card2_option4()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card2_option4));
		Assert.assertEquals(bottom_card2_option4.getText(), "Sample Code");
		bottom_card2_option4.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://github.com/vdotok/JS-one2one");
		log.info("Sample Code option is displayed for Audio Call SDK");
	}
	
	public void verify_bottom_card2_seeAll()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card2_SeeAll));
		Assert.assertEquals(bottom_card2_SeeAll.getText(), "SEE ALL");
		bottom_card2_SeeAll.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://github.com/vdotok?tab=repositories");
		log.info("SEE ALL option is displayed for Audio Call SDK");
	}

	
	//Bottom Card3
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[3][@class=\"docSingleBottomCard\"]//div[1][@class=\"docSingleCardTop\"]//p[1]")
	WebElement bottom_card3_title;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[3][@class=\"docSingleBottomCard\"]//div[1][@class=\"docSingleCardTop\"]//p[2]")
	WebElement bottom_card3_description;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[3][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[1]")
	WebElement bottom_card3_option1;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[3][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[2]")
	WebElement bottom_card3_option2;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[3][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[3]")
	WebElement bottom_card3_option3;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[3][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[4]")
	WebElement bottom_card3_option4;
	
	@FindBy(xpath = "//div[@class=\"docBottomInnerWrapper\"]//div[3][@class=\"docSingleBottomCard\"]//div[2][@class=\"docSingleCardBottom\"]//p[5]")
	WebElement bottom_card3_SeeAll;
	
	public void verify_bottom_card3_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card3_title));
		Assert.assertEquals(bottom_card3_title.getText(), "Video Call");
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card3_description));
		Assert.assertEquals(bottom_card3_description.getText(), "VdoTok offers software development kits for Video Calling that you integrate with your mobile or web application.");
		log.info("Bottom Card3 is displayed along with description");
	}
	
	public void verify_bottom_card3_option1()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card3_option1));
		Assert.assertEquals(bottom_card3_option1.getText(), "Introduction");
		bottom_card3_option1.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/videocall/javascript#MsgJsInstallation");
		log.info("Introduction option is displayed for Video Call SDK");
	}
	
	public void verify_bottom_card3_option2()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card3_option2));
		Assert.assertEquals(bottom_card3_option2.getText(), "Video for iOS");
		bottom_card3_option2.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/videocall/ios#MsgJsInstallation");
		log.info("Video for iOS option is displayed for Video Call SDK");
	}
	
	public void verify_bottom_card3_option3()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card3_option3));
		Assert.assertEquals(bottom_card3_option3.getText(), "Video for Android");
		bottom_card3_option3.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/documentDashboard/videocall/android#MsgJsInstallation");
		log.info("Video for Android option is displayed for Video Call SDK");
	}
	
	public void verify_bottom_card3_option4()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card3_option4));
		Assert.assertEquals(bottom_card3_option4.getText(), "Sample Code");
		bottom_card3_option4.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://github.com/vdotok/JS-one2one");
		log.info("Sample Code option is displayed for Video Call SDK");
	}
	
	public void verify_bottom_card3_seeAll()
	{
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(bottom_card3_SeeAll));
		Assert.assertEquals(bottom_card3_SeeAll.getText(), "SEE ALL");
		bottom_card3_SeeAll.click();
		for (String winHandle : driver.getWindowHandles()) 
		{
		       driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://github.com/vdotok?tab=repositories");
		log.info("SEE ALL option is displayed for Video Call SDK");
	}
}
