package page.Objects;
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

public class Section6 {
	WebDriver driver;
	WebDriverWait wait; 
	JavascriptExecutor js; 
	static Logger log = Logger.getLogger(VdotokHome.class.getName());
	
	public Section6(WebDriver driver)
	{
        this.driver = driver;
        PageFactory.initElements(driver, this); 
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver); 
        driver.get("http://vdotok.com");        
	}
	
	
	//Section6 
	@FindBy(xpath="//div[@class=\"paycontent\"]//p[1]") WebElement sec6_title_txt;
	@FindBy(xpath="//div[@class=\"paycontent\"]//p[2]") WebElement sec6_descriptive_txt;
	
	public void verify_sec6_txt()
 	{
 	    js.executeScript("window.scrollBy(0,4200)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_title_txt));
		String actual_txtt= sec6_title_txt.getText();
		Assert.assertEquals(actual_txtt, "Pay as you grow");
		log.info("title of the Section-6 matched with the expected title");
		
 		wait.until(ExpectedConditions.visibilityOf(sec6_descriptive_txt));
		String actual_txt= sec6_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "We believe everybody should only pay for the what they use. That is why we don’t have subscribtion models and you pay for the exact amount of minutes you burn. Easy, huh?");
		log.info("Descriptive text of Section-6 matched with the expected text");
 	}
	
	//Section6 Card1
	@FindBy(xpath="//div[@class=\"paycards\"]//div[1]//img") WebElement sec6_card1_img;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[1]//div//p[1]") WebElement sec6_card1_titleTxt1;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[1]//div//p[2]") WebElement sec6_card1_titleTxt2;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[1]//p[@class=\"_min_Desk tohide typekit_LabelLight webkit_primary_black\"]") WebElement sec6_card1_descriptiveTxt;
	
	public void verify_sec6_card1_img()
 	{
 		js.executeScript("window.scrollBy(0,4200)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_card1_img));
 		boolean Element_Present = sec6_card1_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Img is displayed for Card-1 in section 6");
 	}
	
	public void verify_sec6_card1_txt()
 	{
 	    js.executeScript("window.scrollBy(0,4200)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_card1_titleTxt1));
		String actual_txt= sec6_card1_titleTxt1.getText();
		Assert.assertEquals(actual_txt, "15 000");
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card1_titleTxt2));
		String actual_txt1= sec6_card1_titleTxt2.getText();
		Assert.assertEquals(actual_txt1, "free minutes");
		
		log.info("title text of card-1 matches the expected title in section 6");
		
 		wait.until(ExpectedConditions.visibilityOf(sec6_card1_descriptiveTxt));
		String actual_txt2= sec6_card1_descriptiveTxt.getText();
		Assert.assertEquals(actual_txt2, "Use these minutes to play around with our APIs and SDKs and find what works best for your product");
		
		log.info("descriptive text of card-1 matches the expected text in section 6");
 	}
	
	//Section6 Card2
	@FindBy(xpath="//div[@class=\"paycards\"]//div[2]//img") WebElement sec6_card2_img;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[2]//p[1]") WebElement sec6_card2_titleTxt;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[2]//p[2]") WebElement sec6_card2_descriptiveTxt;
		
	public void verify_sec6_card2_img()
	{
	   js.executeScript("window.scrollBy(0,4200)");
	   wait.until(ExpectedConditions.visibilityOf(sec6_card2_img));
	   boolean Element_Present = sec6_card2_img.isDisplayed();
	   Assert.assertTrue(Element_Present);
	   log.info("Img is displayed for Card-2 in section 6");
	}
	
	public void verify_sec6_card2_txt()
 	{
 	    js.executeScript("window.scrollBy(0,4200)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_card2_titleTxt));
		String actual_txt= sec6_card2_titleTxt.getText();
		Assert.assertEquals(actual_txt, "Video & Audio");
		log.info("title text of card-2 matches the expected title in section 6");
		
 		wait.until(ExpectedConditions.visibilityOf(sec6_card2_descriptiveTxt));
		String actual_txt2= sec6_card2_descriptiveTxt.getText();
		Assert.assertEquals(actual_txt2, "By signing up for VdoTok you always get access to both types of APIs.");
		log.info("descriptive text of card-2 matches the expected text in section 6");
		
 	}
	
	//Section6 Card3
	@FindBy(xpath="//div[@id=\"root\"]//div//div[7]//div[@class=\"child2card paycardcontent2\"]//p[@class=\"pcardbold2 webkit_primary_h eltspace\"]") WebElement sec6_card3_title_txt1;
	@FindBy(xpath="//div[@id=\"root\"]//div//div[7]//div[@class=\"child2card paycardcontent2\"]//p[@class=\"zerodiv webkit_primary_h eltspace\"]") WebElement sec6_card3_title_txt2;
	@FindBy(xpath="//div[@id=\"root\"]//div//div[7]//div[@class=\"child2card paycardcontent2\"]//p[@class=\" paygrow typekit_LabelLight webkit_primary_black\"]") WebElement sec6_card3_descriptiveTxt;
	@FindBy(xpath="//div[@id=\"root\"]//div//div[7]//div[@class=\"child2card paycardcontent2\"]//div[5]//p") WebElement sec6_card3_bottomTxt;
	@FindBy(xpath="//div[@id=\"root\"]//div//div[7]//div[@class=\"child2card paycardcontent2\"]//div[2]//div[1]//div//input[1][@id=\"myRange\"]") WebElement sec6_card3_slider1;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[2]//p[1]") WebElement sec6_card3_input1;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[2]//p[2]") WebElement sec6_card3_slider2;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[2]//img") WebElement sec6_card3_input2;
	@FindBy(xpath="//div[@id=\"root\"]//div//div[7]//div[@class=\"child2card paycardcontent2\"]//div[3]//button") WebElement sec6_card3_startBtn;
	@FindBy(xpath="//div[@id=\"root\"]//div//div[7]//div[@class=\"child2card paycardcontent2\"]//div[5]//div//button") WebElement sec6_card3_contactBtn;
	@FindBy(xpath="//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]") WebElement cancel_login;
	@FindBy(xpath="//img[@class=\"x-cross x-cross-contact\"]") WebElement cancel_contact;
	
	public void verify_sec6_card3_txt()
	{
		js.executeScript("window.scrollBy(0,4500)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_card3_title_txt1));
		String actual_txt= sec6_card3_title_txt1.getText();
		Assert.assertEquals(actual_txt, "$ 4");
		
 		wait.until(ExpectedConditions.visibilityOf(sec6_card3_title_txt2));
		String actual_txt2= sec6_card3_title_txt2.getText();
		Assert.assertEquals(actual_txt2, ".08");
		
		log.info("title text of card-3 matches the expected title in section 6");
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_descriptiveTxt));
		String actual_txt3= sec6_card3_descriptiveTxt.getText();
		Assert.assertEquals(actual_txt3, "Pay as you grow");
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_bottomTxt));
		String actual_txt4= sec6_card3_bottomTxt.getText();
		Assert.assertEquals(actual_txt4, "Looking for an\n"
				+ "Enterprise Solution?");
		
		log.info("descriptive text of card-3 matches the expected text in section 6");
	}
	
	public void verify_sec6_card3_sliders()
	{
		js.executeScript("window.scrollBy(0,4300)");
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_slider1));
		boolean Element_Present = sec6_card3_slider1.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("mints slider displayed in card-3 of section 6");
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_slider2));
		boolean Element_Present1 = sec6_card3_slider2.isDisplayed();
		Assert.assertTrue(Element_Present1);
		log.info("users slider displayed in card-3 of section 6");
	}
	
	public void verify_sec6_card3_inputs()
	{
		js.executeScript("window.scrollBy(0,4300)");
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_input1));
		boolean Element_Present = sec6_card3_input1.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("mints input field is displayed in card-3 of section 6");
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_input2));
		boolean Element_Present1 = sec6_card3_input2.isDisplayed();
		Assert.assertTrue(Element_Present1);
		log.info("users input field is displayed in card-3 of section 6");
	}
	
	public void verify_sec6_card3_startBtn()
	{
		js.executeScript("window.scrollBy(0,4500)");
 		wait.until(ExpectedConditions.elementToBeClickable(sec6_card3_startBtn));
 		String actual_txt= sec6_card3_startBtn.getText();
		Assert.assertEquals(actual_txt, "START FOR FREE");
		sec6_card3_startBtn.click();
		log.info("clicked on the Start for free button on card-3 of section 6");
		wait.until(ExpectedConditions.elementToBeClickable(cancel_login));
		log.info("sign in pop up is displayed on clicking the try for free button in section 6");
		cancel_login.click();
	}
	
	public void verify_sec6_card3_contactBtn()
	{
		js.executeScript("window.scrollBy(0,4500)");
 		wait.until(ExpectedConditions.elementToBeClickable(sec6_card3_contactBtn));
 		String actual_txt1= sec6_card3_contactBtn.getText();
		Assert.assertEquals(actual_txt1, "CONTACT US");
		sec6_card3_contactBtn.click();
		log.info("clicked on the contact us button in card-3 of section 6");
		wait.until(ExpectedConditions.elementToBeClickable(cancel_contact));
		cancel_contact.click();
	}
	
}