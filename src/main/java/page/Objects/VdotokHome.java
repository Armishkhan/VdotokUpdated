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


public class VdotokHome {
    	
	WebDriver driver;
	WebDriverWait wait; 
	JavascriptExecutor js; 
	static Logger log = Logger.getLogger(VdotokHome.class.getName());  
	public VdotokHome(WebDriver driver)
	{

        this.driver = driver;
        PageFactory.initElements(driver, this); 
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver); 
        driver.get("http://vdotok.com");
         
	}
	
	
	//Header section
	@FindBy(xpath="//img[@id=\"vdtbrandlogo\"]") WebElement header_logo;
	@FindBy(xpath="//body//div[@id=\"vdtnavbar\"]//ul[1]//li[1]//a") WebElement usecases_option;
	@FindBy(xpath="//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent modal-up\"]//div[1]//div[2][@class=\"cardcontent\"]//p[1]") WebElement liveShopping_option;
	@FindBy(xpath="//body//div[@id=\"vdtnavbar\"]//ul[1]//li[2]//a") WebElement docs_option;
    @FindBy(xpath="//body//div[@id=\"vdtnavbar\"]//ul[1]//li[3]//a") WebElement pricing_option;	
	@FindBy(xpath="//body//div[@id=\"vdtnavbar\"]//ul[1]//li[4]//a") WebElement blogs_option;	
    @FindBy(xpath="//body//div[@id=\"vdtnavbar\"]//div[2]//ul//li[1]//button") WebElement login_button; 
    @FindBy(xpath="//div[@id=\"root\"]//div//div[@id=\"signup_container\"]//div[@id=\"modalmain-signup\"]//div[@id=\"navmodal-signup\"]//div[@class=\"login partition\"]//p[@class=\"heading-signin typekit_h3 webkit_primary_h\"]") WebElement signIn_title; 
    @FindBy(xpath="//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]") WebElement cancel_login;
	@FindBy(xpath="//body//div[@id=\"vdtnavbar\"]//div[2]//ul//li[2]//button") WebElement try_button;
	
	
	//Verify Title
	public void verify_title()
	{
	     String ActualTitle = driver.getTitle();
	     String ExpectedTitle = "VdoTok - Easy-to-use APIs for Live Media";
	     Assert.assertEquals(ActualTitle, ExpectedTitle, "Title of the website matched");
	}
	
	//Verify Logo
	public void verify_logo()
	{
		boolean logoPresent = header_logo.isDisplayed();
		Assert.assertTrue(logoPresent);	
        log.info("first logs");
	}
	
	//Click on UseCases Option
	public void verify_usecases_option()
	{	
		String expected_title="Use Cases";
		String actual_title= usecases_option.getText();
		Assert.assertEquals(actual_title, expected_title);
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));	
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_option));
		liveShopping_option.click();
	}
	
	//Click on Docs&Tools Option
	public void verify_docs_option()
	{	
		String expected_title="Doc & Tools";
		wait.until(ExpectedConditions.elementToBeClickable(docs_option));	
		String actual_title= docs_option.getText();
		Assert.assertEquals(actual_title, expected_title);
		docs_option.click();
		String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/");	
	}	
	
    //Click on Pricing option
	public void verify_pricing_option()
	{	
		String expected_title="Pricing";
		wait.until(ExpectedConditions.elementToBeClickable(pricing_option));	
		String actual_title= pricing_option.getText();
		Assert.assertEquals(actual_title, expected_title);
		pricing_option.click();	
	}
	
	//Click on Blog Option
	public void verify_blogs_option()
	{
		String expected_title="Blog";
		wait.until(ExpectedConditions.elementToBeClickable(blogs_option));
		String actual_title= blogs_option.getText();
		Assert.assertEquals(actual_title, expected_title);
	    blogs_option.click();
	}
	
    //Click on Login Button
	public void verify_login_button()
	{
		String expected_title="LOGIN";
		wait.until(ExpectedConditions.elementToBeClickable(login_button));
		String actual_title= login_button.getText();
		Assert.assertEquals(actual_title, expected_title);
		login_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(signIn_title));
		signIn_title.click();
		
	}
	
	//Click on TryForFree Button
	public void verify_tryforfree_button()
	{
		String expected_title="TRY FOR FREE";
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		String actual_title= try_button.getText();
		Assert.assertEquals(actual_title, expected_title);
		try_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(cancel_login));
		cancel_login.click();
	} 
	
	//image section
		@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"headerComp \"]//div//p[1]") WebElement title_text_img_sec;
		@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"headerComp \"]//div//p[2]") WebElement descriptive_text_img_sec;
		@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"headerComp \"]//div//p[3]") WebElement free_mints_text;
		@FindBy(xpath="//body//div[@class=\"headerComp \"]//button[@class=\" Darkbluebtn tryfree\"]") WebElement try_button_img_sec;
		@FindBy(xpath="//body//div[@class=\"headerComp \"]//button[@class=\"Whitebtn watchdemo\"]") WebElement watchDem_btn_img_sec;
		@FindBy(xpath="//body//div[@id=\"root\"]//div//div[@class=\"headerchild2 animate__animated animate__fadeInRight\"]//img[1]") WebElement right_img_img_sec;
		
		
	
	 public void verify_text()
	 {
		 String expected_title="Need easy-to-use\n"
		 		+ "APIs for live media?";
		 wait.until(ExpectedConditions.visibilityOf(title_text_img_sec));
		 String actual_title= title_text_img_sec.getText();
		 Assert.assertEquals(actual_title, expected_title);
		 
		 //String expected_description="Integrate live streaming, screen sharing, video and voice\n" + 
		 //"calls into any app or product. Bring your customers to the\n" 
		 //+ "new reality.";
		 String expected_description="Integrate live streaming, screen sharing, video and voice calls into any app or product. Bring your customers to the new reality.";
		 wait.until(ExpectedConditions.visibilityOf(descriptive_text_img_sec));
		 String actual_description= descriptive_text_img_sec.getText();
		 Assert.assertEquals(actual_description, expected_description);
		 
		 String expected_freeMnts="Get 15 000 free minutes to play with";
		 wait.until(ExpectedConditions.visibilityOf(free_mints_text));
		 String actual_freeeMnts= free_mints_text.getText();
		 Assert.assertEquals(actual_freeeMnts, expected_freeMnts);
		 
		 String expected_btn_title="TRY FOR FREE";
		 wait.until(ExpectedConditions.visibilityOf(try_button_img_sec));
		 String actual_btn_title= try_button_img_sec.getText();
		 Assert.assertEquals(actual_btn_title, expected_btn_title);
		 try_button_img_sec.click();
		 wait.until(ExpectedConditions.visibilityOf(cancel_login));
		 cancel_login.click();
		 
		 String expected_demobtn_title="WATCH DEMO";
		 wait.until(ExpectedConditions.visibilityOf(watchDem_btn_img_sec));
		 String actual_demobtn_title= watchDem_btn_img_sec.getText();
		 Assert.assertEquals(actual_demobtn_title, expected_demobtn_title);
		 watchDem_btn_img_sec.click();
		 
	 }
     public void verify_image()
     {
    	 wait.until(ExpectedConditions.visibilityOf(right_img_img_sec));
    	 boolean IMGPresent = right_img_img_sec.isDisplayed();
 		 Assert.assertTrue(IMGPresent);
     }
     
   //body section
 	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[1]//img[@src=\"/static/media/toggle.d17c168685faa938121d59c5802bb74e.svg\"]") WebElement smooth_toggle;
 	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[1]//p[@class=\"texttoggle eltspace webkit_primary_h typekit_LabelXL\"]") WebElement smooth_txt;
 	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[2]//img[@src=\"/static/media/toggle.d17c168685faa938121d59c5802bb74e.svg\"]") WebElement scalable_toggle;
 	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[2]//p[@class=\"texttoggle eltspace webkit_primary_h typekit_LabelXL\"]") WebElement scalable_txt;
 	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[3]//img[@src=\"/static/media/toggle.d17c168685faa938121d59c5802bb74e.svg\"]") WebElement secure_toggle;
 	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[3]//p[@class=\"texttoggle eltspace webkit_primary_h typekit_LabelXL\"]") WebElement secure_txt;
 	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"SliderTextbolddiv animate__animated animate__bounce\"]//p[1]") WebElement body_title;
 	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"SliderTextbolddiv animate__animated animate__bounce\"]//p[2]") WebElement body_description;
 	
     public void verify_smooth_toggle()
     {
     	 wait.until(ExpectedConditions.visibilityOf(smooth_toggle));
    	 boolean IMGPresent = smooth_toggle.isDisplayed();
  		 Assert.assertTrue(IMGPresent);
     }
     public void verify_smooth_txt()
     {   
    	 String expected_txt="Smooth";
    	 wait.until(ExpectedConditions.visibilityOf(smooth_txt));
		 String actual_txt= smooth_txt.getText();
		 Assert.assertEquals(actual_txt, expected_txt);
     }
     
     public void verify_scalable_toggle()
     {
      	 wait.until(ExpectedConditions.visibilityOf(scalable_toggle));
    	 boolean IMGPresent = scalable_toggle.isDisplayed();
  		 Assert.assertTrue(IMGPresent);
     }
     public void verify_scalable_txt()
     {
    	 String expected_txt="Scalable";
    	 wait.until(ExpectedConditions.visibilityOf(scalable_txt));
		 String actual_txt= scalable_txt.getText();
		 Assert.assertEquals(actual_txt, expected_txt);
     }
     
     public void verify_secure_toggle()
     {
      	 wait.until(ExpectedConditions.visibilityOf(secure_toggle));
    	 boolean IMGPresent = secure_toggle.isDisplayed();
  		 Assert.assertTrue(IMGPresent);
     }
     public void verify_secure_txt()
     {
    	 String expected_txt="Secure";
    	 wait.until(ExpectedConditions.visibilityOf(secure_txt));
		 String actual_txt= secure_txt.getText();
		 Assert.assertEquals(actual_txt, expected_txt);
     }
     
     public void verify_body_title_txt()
     {
    	 wait.until(ExpectedConditions.visibilityOf(body_title));
		 String actual_txt= body_title.getText();
		 Assert.assertEquals(actual_txt, "Why integrating live media with VdoTok?");
     }
     
     public void verify_body_description_txt()
     {
    	 wait.until(ExpectedConditions.visibilityOf(body_description));
		 String actual_txt= body_description.getText();
		 Assert.assertEquals(actual_txt, "Why integrating live media with VdoTok?");
     }
     
    
	
   //section1
 	@FindBy(xpath="//div[@class=\"sectionheading\"]//p[contains(text(),'1')]") WebElement yellow_dot_sec1;
 	@FindBy(xpath="//div[@class=\"sectionheading\"]//p[contains(text(),'Messaging is old...')]") WebElement yelllow_dot_sec1_txt;
 	@FindBy(xpath="//div[@class=\"section aos-init aos-animate\"]//img[@src=\"/static/media/Img.002ee1f260dc2c2d92b3.webp\"]") WebElement img_sec1;
 	@FindBy(xpath="//div[@class=\"sectioncontent\"]//p[contains(text(),'What have we learned during the pandemic?')]") WebElement pre_txt_sec1;
 	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"section aos-init aos-animate\"]//div[3]//p[@class=\"sliderboldtext typekit_h3 webkit_primary_black\"]") WebElement title_txt_sec1;
 	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"section aos-init aos-animate\"]//div[3]//p[@class=\"slidernarrowtext typekit_BodySmallRegular webkit_primary_grey eltspace\"]") WebElement descriptive_txt1_sec1;
 	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div[@class=\"section aos-init aos-animate\"]//div[3]//p[@class=\"sliderdescription webkit_primary_black typekit_BodyRegular\"]") WebElement descriptive_txt2_sec1;
 	@FindBy(xpath="//button[@class=\"Darkbluebtn explore \"]") WebElement explore_btn_sec1;
 	@FindBy(xpath="//button[@class=\"workingbtn Whitebtn\"]") WebElement work_btn_sec1;
     
 	public void verify_sec1_txt()
 	{
 		js.executeScript("window.scrollBy(0,800)");
 		wait.until(ExpectedConditions.visibilityOf(yellow_dot_sec1));
 		boolean Element_Present = yellow_dot_sec1.isDisplayed();
		Assert.assertTrue(Element_Present);
		String actual_txtt= yellow_dot_sec1.getText();
		Assert.assertEquals(actual_txtt, "1");
		
		wait.until(ExpectedConditions.visibilityOf(yelllow_dot_sec1_txt));
		String actual_txt= yelllow_dot_sec1_txt.getText();
		Assert.assertEquals(actual_txt, "Messaging is old...");
		
		wait.until(ExpectedConditions.visibilityOf(pre_txt_sec1));
		String actual_txt1= pre_txt_sec1.getText();
		Assert.assertEquals(actual_txt1, "What have we learned during the pandemic?");
		
		wait.until(ExpectedConditions.visibilityOf(title_txt_sec1));
		String actual_txt4= title_txt_sec1.getText();
		Assert.assertEquals(actual_txt4, "Messaging is so 2020");
		
		wait.until(ExpectedConditions.visibilityOf(descriptive_txt1_sec1));
		String actual_txt2= descriptive_txt1_sec1.getText();
		Assert.assertEquals(actual_txt2, "It’s time to say goodbye to chat bots, decision trees and live chat queues.");
		
		wait.until(ExpectedConditions.visibilityOf(descriptive_txt2_sec1));
		String actual_txt3= descriptive_txt2_sec1.getText();
		Assert.assertEquals(actual_txt3, "Work, shopping, seeing a doctor, training... The pandemic has pushed us to do many things online. Today a quick, personal and engaging live experience with your product or service has transitioned from “a nice to have” to “a must”.");
			
 	}
 	
 	public void verify_sec1_img()
 	{
 		js.executeScript("window.scrollBy(0,1000)");
 		wait.until(ExpectedConditions.visibilityOf(img_sec1));
 		boolean Element_Present = img_sec1.isDisplayed();
		Assert.assertTrue(Element_Present);
 	}
 	
 	public void verify_sec1_exploreBtn()
 	{
 		js.executeScript("window.scrollBy(0,1000)");
 		wait.until(ExpectedConditions.elementToBeClickable(explore_btn_sec1));
 		String actual_txt= explore_btn_sec1.getText();
		Assert.assertEquals(actual_txt, "EXPLORE ALTERNATIVES");
 		explore_btn_sec1.click();
 	}
 	
 	public void verify_sec1_workBtn()
 	{
 		js.executeScript("window.scrollBy(0,1000)");
 		wait.until(ExpectedConditions.elementToBeClickable(work_btn_sec1));
 		String actual_txt= work_btn_sec1.getText();
		Assert.assertEquals(actual_txt, "HOW DOES IT WORK");
 		work_btn_sec1.click();
 	}
	
 	//section2
 	 	@FindBy(xpath="//div[@class=\"sectionheading\"]//p[contains(text(),'2')]") WebElement yellow_dot_sec2;
 	 	@FindBy(xpath="//div[@class=\"sectionheading\"]//p[contains(text(),'What we offer')]") WebElement yelllow_dot_sec2_txt;
 	 	@FindBy(xpath="//div//img[@src=\"/static/media/plus-many-more.d99006d565ccdac8fb82.webp\"]") WebElement img_sec2;
 	 	@FindBy(xpath="//div[@id=\"root\"]//div[3]//div[@class=\"slidergrp\"]//img") WebElement multiplay_logo_sec2;
 	 	@FindBy(xpath="//div//p[@class=\" sliderhide slidernarrowtext typekit_BodySmallRegular webkit_primary_grey\"]") WebElement pre_txt_sec2;
 	 	@FindBy(xpath="//div[@id=\"root\"]//div[3]//div[2][@class=\"sectioncontent\"]//p[2]") WebElement title_txt_sec2;
 	 	@FindBy(xpath="//div[@id=\"root\"]//div[3]//div[2][@class=\"sectioncontent\"]//p[3]") WebElement descriptive_txt1_sec2;
 	 	@FindBy(xpath="//div[@id=\"root\"]//div[3]//div[2][@class=\"sectioncontent\"]//p[4]") WebElement descriptive_txt2_sec2;
 	 	@FindBy(xpath="//div[@id=\"root\"]//div[3]//div[@class=\"slidergrp\"]//p") WebElement multiplay_txt_sec2;
 	 	@FindBy(xpath="//div[@id=\"root\"]//div[3]//div[4]//div[2]//div[2]//button[@class=\"s2btnblue Darkbluebtn\"]") WebElement try_btn_sec2;
 	 	@FindBy(xpath="//div[@id=\"root\"]//div[3]//div[4]//div[2]//div[2]//button[@class=\"s2btnwhite Whitebtn\"]") WebElement work_btn_sec2;
 	     
 	
 	public void verify_sec2_txt()
 	{
 		js.executeScript("window.scrollBy(0,1500)");
 		wait.until(ExpectedConditions.visibilityOf(yellow_dot_sec2));
 		boolean Element_Present = yellow_dot_sec2.isDisplayed();
		Assert.assertTrue(Element_Present);
		String actual_txtt= yellow_dot_sec2.getText();
		Assert.assertEquals(actual_txtt, "2");
		
		wait.until(ExpectedConditions.visibilityOf(yelllow_dot_sec2_txt));
		String actual_txt= yelllow_dot_sec2_txt.getText();
		Assert.assertEquals(actual_txt, "What we offer");
		
		wait.until(ExpectedConditions.visibilityOf(pre_txt_sec2));
		String actual_txt1= pre_txt_sec2.getText();
		Assert.assertEquals(actual_txt1, "We know what’s trending");
		
		wait.until(ExpectedConditions.visibilityOf(title_txt_sec2));
		String actual_txt4= title_txt_sec2.getText();
		Assert.assertEquals(actual_txt4, "Time for live experience");
		
		wait.until(ExpectedConditions.visibilityOf(multiplay_txt_sec2));
		String actual_txt5= multiplay_txt_sec2.getText();
		Assert.assertEquals(actual_txt5, "Multiplay service provider");
			
		wait.until(ExpectedConditions.visibilityOf(descriptive_txt1_sec2));
		String actual_txt2= descriptive_txt1_sec2.getText();
		Assert.assertEquals(actual_txt2, "Integrate live streaming, screen sharing, video and voice calls into your app or product.");
		
		wait.until(ExpectedConditions.visibilityOf(descriptive_txt2_sec2));
		String actual_txt3= descriptive_txt2_sec2.getText();
		Assert.assertEquals(actual_txt3, "VdoTok's mission is to accelerate the world's transition from messaging/text to live media by making it easy, quick and inexpensive for any business.");
			
 	}
 	
 	public void verify_sec2_TryBtn()
 	{
 		js.executeScript("window.scrollBy(0,1500)");
 		wait.until(ExpectedConditions.elementToBeClickable(try_btn_sec2));
 		String actual_txt= try_btn_sec2.getText();
		Assert.assertEquals(actual_txt, "TRY FOR FREE");
		try_btn_sec2.click();
 	}
 	
 	public void verify_sec2_workBtn()
 	{
 		js.executeScript("window.scrollBy(0,1500)");
 		wait.until(ExpectedConditions.elementToBeClickable(work_btn_sec2));
 		String actual_txt= work_btn_sec2.getText();
		Assert.assertEquals(actual_txt, "HOW DOES IT WORK");
 		work_btn_sec2.click();
 	}
 	
 	public void verify_sec2_img()
 	{
 		js.executeScript("window.scrollBy(0,1500)");
 		wait.until(ExpectedConditions.visibilityOf(img_sec2));
 		boolean Element_Present = img_sec2.isDisplayed();
		Assert.assertTrue(Element_Present);
 	}
 	
 	public void verify_sec2_MultiplayLogo()
 	{
 		js.executeScript("window.scrollBy(0,1500)");
 		wait.until(ExpectedConditions.visibilityOf(multiplay_logo_sec2));
 		boolean Element_Present = multiplay_logo_sec2.isDisplayed();
		Assert.assertTrue(Element_Present);
 	}
 	
 	//section3
 	@FindBy(xpath="//div[@class=\"sectionheading\"]//p[contains(text(),'3')]") WebElement yellow_dot_sec3;
	@FindBy(xpath="//div[@class=\"sectionheading\"]//p[contains(text(),'Join live revolution')]") WebElement yelllow_dot_sec3_txt;
	@FindBy(xpath="//div//img[@src=\"/static/media/Phone.e7965dae561561cee2fe.webp\"]") WebElement img_sec3;
	@FindBy(xpath="//div[@id=\"root\"]//div[5]//div[3]//p[@class=\"sliderhide slidernarrowtext typekit_BodySmallRegular webkit_primary_grey\"]") WebElement pre_txt_sec3;
	@FindBy(xpath="//div[@id=\"root\"]//div[5]//div[3]//p[2][@class=\"sliderboldtext typekit_h3 webkit_primary_black\"]") WebElement title_txt_sec3;
	@FindBy(xpath="//div[@id=\"root\"]//div[5]//div[3]//p[3][@class=\"slidernarrowtext typekit_BodySmallRegular webkit_primary_grey eltspace\"]") WebElement descriptive_txt1_sec3;
	@FindBy(xpath="//div[@id=\"root\"]//div[5]//div[3]//div//p[@class=\"_st3 sliderdescription webkit_primary_black typekit_BodyRegular\"]") WebElement descriptive_txt2_sec3;
	@FindBy(xpath="//div[@id=\"root\"]//div[5]//div[3]//div//button[@class=\"s3btnblue Darkbluebtn \"]") WebElement try_btn_sec3;
	     	
 	public void verify_sec3_txt()
 	{
 		js.executeScript("window.scrollBy(0,2000)");
 		wait.until(ExpectedConditions.visibilityOf(yellow_dot_sec3));
 		boolean Element_Present = yellow_dot_sec3.isDisplayed();
		Assert.assertTrue(Element_Present);
		String actual_txtt= yellow_dot_sec3.getText();
		Assert.assertEquals(actual_txtt, "3");
		
		wait.until(ExpectedConditions.visibilityOf(yelllow_dot_sec3_txt));
		String actual_txt= yelllow_dot_sec3_txt.getText();
		Assert.assertEquals(actual_txt, "Join live revolution");
		
		wait.until(ExpectedConditions.visibilityOf(pre_txt_sec3));
		String actual_txt1= pre_txt_sec3.getText();
		Assert.assertEquals(actual_txt1, "Welcome to the new era");
		
		wait.until(ExpectedConditions.visibilityOf(title_txt_sec3));
		String actual_txt4= title_txt_sec3.getText();
		Assert.assertEquals(actual_txt4, "Become a trendsetter");
		
		wait.until(ExpectedConditions.visibilityOf(descriptive_txt1_sec3));
		String actual_txt2= descriptive_txt1_sec3.getText();
		Assert.assertEquals(actual_txt2, "Open the world of live media & web3 and bring your customers to a new engaging reality");
		
		wait.until(ExpectedConditions.visibilityOf(descriptive_txt2_sec3));
		String actual_txt3= descriptive_txt2_sec3.getText();
		Assert.assertEquals(actual_txt3, "In-built live streaming, video & voice calls are just a beginning. Our R&D department is already developing solutions for connected cities, cars & Metaverse. Become a part of this journey and make sure that your product is always at the cutting edge of technology.");
			
 	}
 	
 	public void verify_sec3_TryBtn()
 	{
 		js.executeScript("window.scrollBy(0,2000)");
 		wait.until(ExpectedConditions.elementToBeClickable(try_btn_sec3));
 		String actual_txt= try_btn_sec3.getText();
		Assert.assertEquals(actual_txt, "TRY FOR FREE");
		try_btn_sec3.click();
 	}
 	
 	public void verify_sec3_img()
 	{
 		js.executeScript("window.scrollBy(0,2000)");
 		wait.until(ExpectedConditions.visibilityOf(img_sec3));
 		boolean Element_Present = img_sec3.isDisplayed();
		Assert.assertTrue(Element_Present);
 	}
 	
 	//section4
	@FindBy(xpath="//div[@id=\"demo\"]//p[@class=\"uniqueboldtext webkit_primary_h typekit_h2\"]") WebElement title_txt_sec4;
	@FindBy(xpath="//div[@id=\"demo\"]//p[2][@class=\"typekit_BodyElevated webkit_primary_h uniquedesc\"]") WebElement descriptive_txt_sec4;
	@FindBy(xpath="//div[@id=\"demo\"]//img[@src=\"/static/media/What-makes-us-different.fceb70c51ce793f581e5.webp\"]") WebElement img_sec4;
	
 	public void verify_sec4_txt()
 	{
 	    js.executeScript("window.scrollBy(0,3000)");
 		wait.until(ExpectedConditions.visibilityOf(title_txt_sec4));
		String actual_txtt= title_txt_sec4.getText();
		Assert.assertEquals(actual_txtt, "Join live revolution");
		
 		wait.until(ExpectedConditions.visibilityOf(descriptive_txt_sec4));
		String actual_txt= descriptive_txt_sec4.getText();
		Assert.assertEquals(actual_txt, "VdoTok's vision is to open the world of live media & web3 to every entrepreneur & developer and empower them to bring people to a new engaging reality. We call it live revolution.");
 	}

 	public void verify_sec4_img()
 	{
 		js.executeScript("window.scrollBy(0,3000)");
 		wait.until(ExpectedConditions.visibilityOf(img_sec4));
 		boolean Element_Present = img_sec4.isDisplayed();
		Assert.assertTrue(Element_Present);
 	}
 	
 	//section5
 	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//p[@class=\"webkit_primary_black typekit_h2 otherunique\"]") WebElement title_txt_sec5;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//p[2][@class=\"othersdescription typekit_BodyRegular webkit_primary_black\"]") WebElement descriptive_txt_sec5;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"headerbtns\"]//button") WebElement try_btn_sec5;
	
	public void verify_sec5_txt()
 	{
 	    js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(title_txt_sec5));
		String actual_txtt= title_txt_sec5.getText();
		Assert.assertEquals(actual_txtt, "What others are building");
		
 		wait.until(ExpectedConditions.visibilityOf(descriptive_txt_sec5));
		String actual_txt= descriptive_txt_sec5.getText();
		Assert.assertEquals(actual_txt, "Build HD quality connections for one-to-one, one-to-many, many-to-many calls & streaming.");
 	}

 	public void verify_sec5_btn()
 	{
 		js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.elementToBeClickable(try_btn_sec5));
 		String actual_txt= try_btn_sec5.getText();
		Assert.assertEquals(actual_txt, "TRY FOR FREE");
		try_btn_sec5.click();

 	}
	
	//Section5Card1
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"circle\"]//img[@src=\"/static/media/blueimg.d9b9d5a945d3094eb3bf.png\"]") WebElement img_card1;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"circle\"]//img[@src=\"/static/media/blueimg.d9b9d5a945d3094eb3bf.png\"]") WebElement toggle_card1;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"otherscontent\"]//p[@class=\"cardheading webkit_GreenGrass typekit_LabelXXL\"]") WebElement title_card1;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"otherscontent\"]//p[2][@class=\"card_p webkit_GreenGrass typekit_BodySmallRegular\"]") WebElement opt1_card1;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"otherscontent\"]//p[3][@class=\"card_p webkit_GreenGrass typekit_BodySmallRegular\"]") WebElement opt2_card1;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"otherscontent\"]//p[4][@class=\"card_p webkit_GreenGrass typekit_BodySmallRegular\"]") WebElement opt3_card1;
 	
	public void verify_card1_img()
 	{
 		js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(img_card1));
 		boolean Element_Present = img_card1.isDisplayed();
		Assert.assertTrue(Element_Present);

 	}
	
	public void verify_card1_toggle()
 	{
 		js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(toggle_card1));
 		boolean Element_Present = toggle_card1.isDisplayed();
		Assert.assertTrue(Element_Present);

 	}
	
	public void verify_card1_txt()
 	{
 	    js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(title_card1));
		String actual_txtt= title_card1.getText();
		Assert.assertEquals(actual_txtt, "Live\n" + "shopping app");
		
 		wait.until(ExpectedConditions.visibilityOf(opt1_card1));
		String actual_txt= opt1_card1.getText();
		Assert.assertEquals(actual_txt, "- Live streaming");
		
		wait.until(ExpectedConditions.visibilityOf(opt2_card1));
		String actual_txt1= opt2_card1.getText();
		Assert.assertEquals(actual_txt1, "- Social engagement");
		
		wait.until(ExpectedConditions.visibilityOf(opt3_card1));
		String actual_txt2= opt3_card1.getText();
		Assert.assertEquals(actual_txt2, "- Messaging");
 	}
		
	//Section5Card2
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"bottomcircle\"]//img[@src=\"/static/media/yellowimg.3ed0407ce37a039f14f1.png\"]") WebElement img_card2;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"toggle\"]//img[@src=\"/static/media/yellow.17dbeffd4422b01a459358e3e7861e59.svg\"]") WebElement toggle_card2;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[@class=\"cardheading webkit_YellowDark typekit_LabelXXL\"]") WebElement title_card2;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[2][@class=\"card_p webkit_YellowDark typekit_BodySmallRegular\"]") WebElement opt1_card2;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[3][@class=\"card_p webkit_YellowDark typekit_BodySmallRegular\"]") WebElement opt2_card2;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[4][@class=\"card_p webkit_YellowDark typekit_BodySmallRegular\"]") WebElement opt3_card2;
	
	public void verify_card2_img()
 	{
 		js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(img_card2));
 		boolean Element_Present = img_card2.isDisplayed();
		Assert.assertTrue(Element_Present);

 	}
	
	public void verify_card2_toggle()
 	{
 		js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(toggle_card2));
 		boolean Element_Present = toggle_card2.isDisplayed();
		Assert.assertTrue(Element_Present);

 	}
	
	public void verify_card2_txt()
 	{
 	    js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(title_card2));
		String actual_txtt= title_card2.getText();
		Assert.assertEquals(actual_txtt, "Online education platform");
		
 		wait.until(ExpectedConditions.visibilityOf(opt1_card2));
		String actual_txt= opt1_card2.getText();
		Assert.assertEquals(actual_txt, "-Webinars");
		
		wait.until(ExpectedConditions.visibilityOf(opt2_card2));
		String actual_txt1= opt2_card2.getText();
		Assert.assertEquals(actual_txt1, "-Screen sharing");
		
		wait.until(ExpectedConditions.visibilityOf(opt3_card2));
		String actual_txt2= opt3_card1.getText();
		Assert.assertEquals(actual_txt2, "-Video calls");
 	}
	//Section5Card3
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"circle\"]//img[@src=\"/static/media/purpleimg.c7b365e23bcd6d3da09c.png\"]") WebElement img_card3;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"toggle\"]//img[@src=\"/static/media/purple.298179639a9052f6e44e24ab45312289.svg\"]") WebElement toggle_card3;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//p[@class=\"cardheading webkit_Bluemoon typekit_LabelXXL\"]") WebElement title_card3;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"otherscontent\"]//p[2]") WebElement opt1_card3;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"otherscontent\"]//p[3]") WebElement opt2_card3;
	@FindBy(xpath="//div[@id=\"otherdesktop\"]//div[@class=\"slick-slide slick-active\"]//div[@class=\"otherscontent\"]//p[4]") WebElement opt3_card3;
	
	public void verify_card3_img()
 	{
 		js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(img_card3));
 		boolean Element_Present = img_card3.isDisplayed();
		Assert.assertTrue(Element_Present);

 	}
	
	public void verify_card3_toggle()
 	{
 		js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(toggle_card3));
 		boolean Element_Present = toggle_card3.isDisplayed();
		Assert.assertTrue(Element_Present);

 	}
	public void verify_card3_txt()
 	{
 	    js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(title_card3));
		String actual_txtt= title_card3.getText();
		Assert.assertEquals(actual_txtt, "Online doctor");
		
 		wait.until(ExpectedConditions.visibilityOf(opt1_card3));
		String actual_txt= opt1_card3.getText();
		Assert.assertEquals(actual_txt, "-Voice & video calls");
		
		wait.until(ExpectedConditions.visibilityOf(opt2_card3));
		String actual_txt1= opt2_card3.getText();
		Assert.assertEquals(actual_txt1, "-Messaging");
		
		wait.until(ExpectedConditions.visibilityOf(opt3_card3));
		String actual_txt2= opt3_card3.getText();
		Assert.assertEquals(actual_txt2, "-Remote monitoring");
 	}
	//Section5Card4
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"nclass\"]//div[@class=\"othersmins\"]//img[1]") WebElement TopImg_card4;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"nclass\"]//div[@class=\"othersmins\"]//p[1]") WebElement txt1_card4;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"nclass\"]//div[@class=\"othersmins\"]//p[2]") WebElement txt2_card4;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"otherscomponent\"]//div[@class=\"nclass\"]//div[@class=\"othersmins\"]//img[2]") WebElement BottomImg_card4;
	
	public void verify_card4_Topimg()
 	{
 		js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(TopImg_card4));
 		boolean Element_Present = TopImg_card4.isDisplayed();
		Assert.assertTrue(Element_Present);

 	}
	
	public void verify_card4_txt()
 	{
 	    js.executeScript("window.scrollBy(0,3700)");
 		wait.until(ExpectedConditions.visibilityOf(txt1_card4));
		String actual_txtt= txt1_card4.getText();
		Assert.assertEquals(actual_txtt, "241 Minutes");
		
 		wait.until(ExpectedConditions.visibilityOf(txt2_card4));
		String actual_txt= txt2_card4.getText();
		Assert.assertEquals(actual_txt, "(aug)");
		
 	}
	
	public void verify_card4_Btmimg()
 	{
 		js.executeScript("window.scrollBy(0,3500)");
 		wait.until(ExpectedConditions.visibilityOf(BottomImg_card4));
 		boolean Element_Present = BottomImg_card4.isDisplayed();
		Assert.assertTrue(Element_Present);

 	}
	
	//Section6 
	@FindBy(xpath="//div[@class=\"paycontent\"]//p[1]") WebElement sec6_title_txt;
	@FindBy(xpath="//div[@class=\"paycontent\"]//p[2]") WebElement sec6_descriptive_txt;
	
	public void verify_sec6_txt()
 	{
 	    js.executeScript("window.scrollBy(0,4000)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_title_txt));
		String actual_txtt= sec6_title_txt.getText();
		Assert.assertEquals(actual_txtt, "Pay as you grow");
		
 		wait.until(ExpectedConditions.visibilityOf(sec6_descriptive_txt));
		String actual_txt= sec6_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "We believe everybody should only pay for the what they use. That is why we don’t have subscribtion models and you pay for the exact amount of minutes you burn. Easy, huh?");
		
 	}
	
	//Section6 Card1
	@FindBy(xpath="//div[@class=\"paycards\"]//div[1]//img") WebElement sec6_card1_img;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[1]//div//p[1]") WebElement sec6_card1_titleTxt1;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[1]//div//p[2]") WebElement sec6_card1_titleTxt2;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[1]//p[@class=\"_min_Desk tohide typekit_LabelLight webkit_primary_black\"]") WebElement sec6_card1_descriptiveTxt;
	
	public void verify_sec6_card1_img()
 	{
 		js.executeScript("window.scrollBy(0,4000)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_card1_img));
 		boolean Element_Present = sec6_card1_img.isDisplayed();
		Assert.assertTrue(Element_Present);

 	}
	
	public void verify_sec6_card1_txt()
 	{
 	    js.executeScript("window.scrollBy(0,4000)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_card1_titleTxt1));
		String actual_txt= sec6_card1_titleTxt1.getText();
		Assert.assertEquals(actual_txt, "15 000");
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card1_titleTxt2));
		String actual_txt1= sec6_card1_titleTxt2.getText();
		Assert.assertEquals(actual_txt1, "free minutes");
		
 		wait.until(ExpectedConditions.visibilityOf(sec6_card1_descriptiveTxt));
		String actual_txt2= sec6_card1_descriptiveTxt.getText();
		Assert.assertEquals(actual_txt2, "Use these minutes to play around with our APIs and SDKs and find what works best for your product");
		
 	}
	
	//Section6 Card1
	@FindBy(xpath="//div[@class=\"paycards\"]//div[2]//img") WebElement sec6_card2_img;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[2]//p[1]") WebElement sec6_card2_titleTxt;
	@FindBy(xpath="//div[@class=\"paycards\"]//div[2]//p[2]") WebElement sec6_card2_descriptiveTxt;
		
	public void verify_sec6_card2_img()
	{
	   js.executeScript("window.scrollBy(0,4000)");
	   wait.until(ExpectedConditions.visibilityOf(sec6_card2_img));
	   boolean Element_Present = sec6_card2_img.isDisplayed();
	   Assert.assertTrue(Element_Present);
	}
	
	public void verify_sec6_card2_txt()
 	{
 	    js.executeScript("window.scrollBy(0,4000)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_card2_titleTxt));
		String actual_txt= sec6_card2_titleTxt.getText();
		Assert.assertEquals(actual_txt, "Video & Audio");
		
 		wait.until(ExpectedConditions.visibilityOf(sec6_card2_descriptiveTxt));
		String actual_txt2= sec6_card2_descriptiveTxt.getText();
		Assert.assertEquals(actual_txt2, "By signing up for VdoTok you always get access to both types of APIs.");
		
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
	
	public void verify_sec6_card3_txt()
	{
		js.executeScript("window.scrollBy(0,4500)");
 		wait.until(ExpectedConditions.visibilityOf(sec6_card3_title_txt1));
		String actual_txt= sec6_card3_title_txt1.getText();
		Assert.assertEquals(actual_txt, "$ 4");
		
 		wait.until(ExpectedConditions.visibilityOf(sec6_card3_title_txt2));
		String actual_txt2= sec6_card3_title_txt2.getText();
		Assert.assertEquals(actual_txt2, ".08");
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_descriptiveTxt));
		String actual_txt3= sec6_card3_descriptiveTxt.getText();
		Assert.assertEquals(actual_txt3, "Pay as you grow");
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_bottomTxt));
		String actual_txt4= sec6_card3_bottomTxt.getText();
		Assert.assertEquals(actual_txt4, "Looking for an\n"
				+ "Enterprise Solution?");
	}
	
	public void verify_sec6_card3_sliders()
	{
		js.executeScript("window.scrollBy(0,4000)");
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_slider1));
		boolean Element_Present = sec6_card3_slider1.isDisplayed();
		Assert.assertTrue(Element_Present);
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_slider2));
		boolean Element_Present1 = sec6_card3_slider2.isDisplayed();
		Assert.assertTrue(Element_Present1);
	}
	
	public void verify_sec6_card3_inputs()
	{
		js.executeScript("window.scrollBy(0,4000)");
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_input1));
		boolean Element_Present = sec6_card3_input1.isDisplayed();
		Assert.assertTrue(Element_Present);
		
		wait.until(ExpectedConditions.visibilityOf(sec6_card3_input2));
		boolean Element_Present1 = sec6_card3_input2.isDisplayed();
		Assert.assertTrue(Element_Present1);
	}
	
	public void verify_sec6_card3_startBtn()
	{
		js.executeScript("window.scrollBy(0,4500)");
 		wait.until(ExpectedConditions.elementToBeClickable(sec6_card3_startBtn));
 		String actual_txt= sec6_card3_startBtn.getText();
		Assert.assertEquals(actual_txt, "START FOR FREE");
		sec6_card3_startBtn.click();
	}
	
	public void verify_sec6_card3_contactBtn()
	{
		js.executeScript("window.scrollBy(0,4500)");
 		wait.until(ExpectedConditions.elementToBeClickable(sec6_card3_contactBtn));
 		String actual_txt1= sec6_card3_contactBtn.getText();
		Assert.assertEquals(actual_txt1, "CONTACT US");
		sec6_card3_contactBtn.click();
	}
	
	//Testimonial1
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div//p[@class=\"webkit_primary_black testimonialhbold typekit_h2\"]") WebElement testimonial_title_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div//p[@class=\"webkit_primary_black typekit_subheadline2\"]") WebElement testimonial_description_txt;
	
	public void verify_testimonials_txt()
	{
		js.executeScript("window.scrollBy(0,5000)");
 		wait.until(ExpectedConditions.visibilityOf(testimonial_title_txt));
		String actual_txt= testimonial_title_txt.getText();
		Assert.assertEquals(actual_txt, "Testimonials");
		
 		wait.until(ExpectedConditions.visibilityOf(testimonial_description_txt));
		String actual_txt2= testimonial_description_txt.getText();
		Assert.assertEquals(actual_txt2, "We empower customers in dozens of industries and occupations.\n"
				+ "Read what they find VdoTok useful for.");
		
	}
	//Testimonial Card1
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[2]//div//div[2]//img[@src=\"https://s3.eu-central-1.amazonaws.com/vdotok-bucket/1656405221163204792.png\"]") WebElement testimonial_card1_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"txtcard\"]//p") WebElement testimonial_card1_description_txt1;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"greydiv\"]//p[@class=\"testp2 typekit_LabelRegularBold webkit_primary_h eltspace\"]") WebElement testimonial_card1_name_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"greydiv\"]//p[@class=\"testp3 typekit_LabelLight webkit_primary_grey eltspace\"]") WebElement testimonial_card1_designation_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"greydiv\"]//div[2]//p") WebElement testimonial_card1_description_txt2;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"greydiv\"]//img") WebElement testimonial_card1_logo;
	
	public void verify_testimonial_card1_img()
	{
	   js.executeScript("window.scrollBy(0,5000)");
	   wait.until(ExpectedConditions.visibilityOf(testimonial_card1_img));
	   boolean Element_Present = testimonial_card1_img.isDisplayed();
	   Assert.assertTrue(Element_Present);
	}
	
	public void verify_testimonial_card1_logo()
	{
	   js.executeScript("window.scrollBy(0,5000)");
	   wait.until(ExpectedConditions.visibilityOf(testimonial_card1_logo));
	   boolean Element_Present = testimonial_card1_logo.isDisplayed();
	   Assert.assertTrue(Element_Present);
	}
	
	public void verify_testimonial_card1_txt()
	{
		js.executeScript("window.scrollBy(0,5000)");
 		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_description_txt1));
		String actual_txt= testimonial_card1_description_txt1.getText();
		Assert.assertEquals(actual_txt, "TwoAct is currently helping children with their mental health in Sweden and VdoTok’s upcoming video bot API is a great opportunity for TwoAct to build a video bot quickly and easily for children to support them with their mental health.");
		
		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_name_txt));
		String actual_txt2= testimonial_card1_name_txt.getText();
		Assert.assertEquals(actual_txt2, "Jonas");
		
		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_designation_txt));
		String actual_txt4= testimonial_card1_designation_txt.getText();
		Assert.assertEquals(actual_txt4, "CEO, TwoAct AB");
		
 		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_description_txt2));
		String actual_txt3= testimonial_card1_description_txt2.getText();
		Assert.assertEquals(actual_txt3, "TwoAct is a Handle-IT concept from Sweden that creates the best possible conditions for good mental health and schooling for students.");
		
	}
	
	//Testimonial Card2
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[2]//div//ul//li[2]//img[@src=\"https://s3.eu-central-1.amazonaws.com/vdotok-bucket/1648717596936394840.jpe\"]") WebElement testimonial_card2_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[2]//li[2]//div[@class=\"txtcard\"]//p[@class=\"webkit_primary_black typekit_LabelRegular\"]") WebElement testimonial_card2_description_txt1;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[2]//div[@class=\"greydiv\"]//p[@class=\"testp2 typekit_LabelRegularBold webkit_primary_h eltspace\"]") WebElement testimonial_card2_name_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[2]//div[@class=\"greydiv\"]//p[@class=\"testp3 typekit_LabelLight webkit_primary_grey eltspace\"]") WebElement testimonial_card2_designation_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[2]//div[@class=\"greydiv\"]//div[2]//p") WebElement testimonial_card2_description_txt2;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[2]//div[@class=\"greydiv\"]//img") WebElement testimonial_card2_logo;
	
	public void verify_testimonial_card2_img()
	{
	   js.executeScript("window.scrollBy(0,5000)");
	   wait.until(ExpectedConditions.visibilityOf(testimonial_card2_img));
	   boolean Element_Present = testimonial_card2_img.isDisplayed();
	   Assert.assertTrue(Element_Present);
	}
	
	public void verify_testimonial_card2_logo()
	{
	   js.executeScript("window.scrollBy(0,5000)");
	   wait.until(ExpectedConditions.visibilityOf(testimonial_card2_logo));
	   boolean Element_Present = testimonial_card2_logo.isDisplayed();
	   Assert.assertTrue(Element_Present);
	}
	
	public void verify_testimonial_card2_txt()
	{
	   js.executeScript("window.scrollBy(0,5000)");
 	   wait.until(ExpectedConditions.visibilityOf(testimonial_card2_description_txt1));
	   String actual_txt= testimonial_card2_description_txt1.getText();
	   Assert.assertEquals(actual_txt, "Norgic is a software services provider and we’re currently using VdoTok’s cloud communication platform to build digital communication software products for us customers. As a front-end developer, it was a great experience to build a software product quickly without being worried about complex backend systems.");
		
	   wait.until(ExpectedConditions.visibilityOf(testimonial_card2_name_txt));
	   String actual_txt2= testimonial_card2_name_txt.getText();
	   Assert.assertEquals(actual_txt2, "Asad");
		
	   wait.until(ExpectedConditions.visibilityOf(testimonial_card2_designation_txt));
	   String actual_txt4= testimonial_card2_designation_txt.getText();
	   Assert.assertEquals(actual_txt4, "Lead Front-End Developer, Norgic AB");
		
 	   wait.until(ExpectedConditions.visibilityOf(testimonial_card2_description_txt2));
	   String actual_txt3= testimonial_card2_description_txt2.getText();
	   Assert.assertEquals(actual_txt3, "Norgic is a software services provider from Sweden focused on digital communication software solutions.");
		
	}	
	
	//Section8
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"trycomponent\"]//div[1]//p[1]") WebElement sec8_title_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"trycomponent\"]//div[1]//p[2]") WebElement sec8_descriptive_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"trycomponent\"]//div[1]//button") WebElement sec8_tryBtn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"trycomponent\"]//div[2]//img") WebElement sec8_img;
	//@FindBy(xpath="//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]") WebElement cancel_login;
	
	public void verify_sec8_txt()
	{
	   js.executeScript("window.scrollBy(0,5500)");
 	   wait.until(ExpectedConditions.visibilityOf(sec8_title_txt));
	   String actual_txt= sec8_title_txt.getText();
	   Assert.assertEquals(actual_txt, "Ready to try it out?");
		
	   wait.until(ExpectedConditions.visibilityOf(sec8_descriptive_txt));
	   String actual_txt2= sec8_descriptive_txt.getText();
	   Assert.assertEquals(actual_txt2, "Try VdoTok for free while we’re in beta. Test our powerful and easy-to-use APIs to integrate new generation of video and voice calls, messaging, live streaming and screen sharing to your product and transform your customers’ lives by bringing them into the new reality.");
	
	}	
	
	public void verify_sec8_tryBtn()
	{
		js.executeScript("window.scrollBy(0,5800)");
 		wait.until(ExpectedConditions.elementToBeClickable(sec8_tryBtn));
 		String actual_txt1= sec8_tryBtn.getText();
		Assert.assertEquals(actual_txt1, "TRY IT FOR FREE NOW");
		sec8_tryBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(cancel_login));
		cancel_login.click();
	}
	
	public void verify_sec8_img()
	{
	   js.executeScript("window.scrollBy(0,5500)");
	   wait.until(ExpectedConditions.visibilityOf(sec8_img));
	   boolean Element_Present = sec8_img.isDisplayed();
	   Assert.assertTrue(Element_Present);
	}
	
	//Blogs Section
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div//p[@class=\"typekit_h2 textBold testbold eltspace\"]") WebElement blogs_sec_title_text;
	
	public void verify_blogs_sec_title()
	{
		js.executeScript("window.scrollBy(0,6800)");
	 	   wait.until(ExpectedConditions.visibilityOf(blogs_sec_title_text));
		   String actual_txt= blogs_sec_title_text.getText();
		   Assert.assertEquals(actual_txt, "Read our Blog");
	}
	
	//Blog1
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[7]//div//img") WebElement blog1_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[7]//div//div//button") WebElement blog1_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[7]//div//div//p") WebElement blog1_descriptive_txt;
		
	public void verify_blog1_img()
	{
	   js.executeScript("window.scrollBy(0,6800)");
	   wait.until(ExpectedConditions.visibilityOf(blog1_img));
	   boolean Element_Present = blog1_img.isDisplayed();
	   Assert.assertTrue(Element_Present);
	}
	
	public void verify_blog1_btn()
	{
		js.executeScript("window.scrollBy(0,6800)");
 		wait.until(ExpectedConditions.elementToBeClickable(blog1_btn));
 		String actual_txt1= blog1_btn.getText();
		Assert.assertEquals(actual_txt1, "TELEHEALTH");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		blog1_btn.click();
		String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/what-are-emerging-technologies-in-healthcare-to-get-excited-about");	
		
	}
	
	public void verify_blog1_txt()
	{
		js.executeScript("window.scrollBy(0,6800)");
	 	   wait.until(ExpectedConditions.visibilityOf(blog1_descriptive_txt));
		   String actual_txt= blog1_descriptive_txt.getText();
		   Assert.assertEquals(actual_txt, "What are emerging technologies in healthcare to get excited about?");
	}
	
	//Blog2
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[8]//img") WebElement blog2_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[8]//button") WebElement blog2_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[8]//p") WebElement blog2_descriptive_txt;
			
	public void verify_blog2_img()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog2_img));
		boolean Element_Present = blog2_img.isDisplayed();
		Assert.assertTrue(Element_Present);
	}
		
    public void verify_blog2_btn()
	{
		js.executeScript("window.scrollBy(0,6800)");
	 	wait.until(ExpectedConditions.elementToBeClickable(blog2_btn));
	 	String actual_txt1= blog2_btn.getText();
		Assert.assertEquals(actual_txt1, "INFLUENCER MARKETING");
		blog2_btn.click();
		String winHandleBefore = driver.getWindowHandle();
	    for(String winHandle : driver.getWindowHandles())
	    {
	        driver.switchTo().window(winHandle);
	    }
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/what-is-social-commerce-and-why-should-your-business-care");		
	}
		
	public void verify_blog2_txt()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog2_descriptive_txt));
		String actual_txt= blog2_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "What is Social Commerce and why should your business care?");
	}
	
	//Test Blog2
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[9]//img") WebElement blog3_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[9]//button") WebElement blog3_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[9]//p") WebElement blog3_descriptive_txt;
					
	public void verify_blog3_img()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog3_img));
		boolean Element_Present = blog3_img.isDisplayed();
		Assert.assertTrue(Element_Present);
	}
		
    public void verify_blog3_btn()
	{
		js.executeScript("window.scrollBy(0,6800)");
	 	wait.until(ExpectedConditions.elementToBeClickable(blog3_btn));
	 	String actual_txt1= blog3_btn.getText();
		Assert.assertEquals(actual_txt1, "INFLUENCER MARKETING");
		blog3_btn.click();
		String winHandleBefore = driver.getWindowHandle();
	    for(String winHandle : driver.getWindowHandles())
	    {
	        driver.switchTo().window(winHandle);
	    }
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/how-can-live-communication-technologies-improve-your-sales-and-grow-your-business");		
	}
		
	public void verify_blog3_txt()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog3_descriptive_txt));
		String actual_txt= blog3_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "How can live communication technologies improve your sales and grow your business?");
	}	
	
	//Test scrollable button
	@FindBy(xpath="//div[@id='splide05']/ul/li[2]/button") WebElement blog_sec_yellowDot2;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//img") WebElement blog4_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[11]//img") WebElement blog5_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[12]//img") WebElement blog6_img;
	
	public void verify_scrollable_btn1()
	{
		js.executeScript("window.scrollBy(0,6800)");
		Actions actions = new Actions(driver); 
		actions.moveToElement(blog_sec_yellowDot2); 
		actions.click().perform(); 
		//Log.info("clicking on the element");
		//scroll.sendKeys(Keys.PAGE_DOWN);
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		//wait.until(ExpectedConditions.elementToBeClickable(blog_sec_yellowDot2));
 		//blog_sec_yellowDot2.click();
 		
 		wait.until(ExpectedConditions.visibilityOf(blog4_img));
		boolean Element_Present = blog4_img.isDisplayed();
		Assert.assertTrue(Element_Present);	
		
		wait.until(ExpectedConditions.visibilityOf(blog5_img));
		boolean Element_Presentt = blog5_img.isDisplayed();
		Assert.assertTrue(Element_Presentt);	
		
		wait.until(ExpectedConditions.visibilityOf(blog6_img));
		boolean Elementt_Present = blog6_img.isDisplayed();
		Assert.assertTrue(Elementt_Present);	
	}
	
	//Test Blog4
	//@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//img") WebElement blog4_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//button") WebElement blog4_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//p") WebElement blog4_descriptive_txt;
						
	public void verify_blog4_img()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog4_img));
		boolean Element_Present = blog4_img.isDisplayed();
		Assert.assertTrue(Element_Present);
    }
			
	public void verify_blog4_btn()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.elementToBeClickable(blog4_btn));
		String actual_txt1= blog4_btn.getText();
	    Assert.assertEquals(actual_txt1, "LIVE REVOLUTION");
		blog4_btn.click();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/three-types-of-telemedicine");		
	}
			
	public void verify_blog4_txt()
	{
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog4_descriptive_txt));
		String actual_txt= blog4_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "What are three different types of TeleHealth?");
    }	

	//Test Blog5
	//@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//img") WebElement blog4_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[11]//button") WebElement blog5_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[11]//p") WebElement blog5_descriptive_txt;
	
	public void verify_blog5_img()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog5_img));
		boolean Element_Present = blog5_img.isDisplayed();
		Assert.assertTrue(Element_Present);
    }
	public void verify_blog5_btn()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.elementToBeClickable(blog5_btn));
		String actual_txt1= blog5_btn.getText();
	    Assert.assertEquals(actual_txt1, "INFLUENCER MARKETING");
		blog5_btn.click();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/what-is-live-shopping");		
	}
	public void verify_blog5_txt()
	{
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog5_descriptive_txt));
		String actual_txt= blog5_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "What is live shopping?");
    }

	//Test Blog6
	//@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//img") WebElement blog4_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[12]//button") WebElement blog6_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[12]//p") WebElement blog6_descriptive_txt;
	
	public void verify_blog6_img()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog6_img));
		boolean Element_Present = blog6_img.isDisplayed();
		Assert.assertTrue(Element_Present);
    }
	public void verify_blog6_btn()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.elementToBeClickable(blog6_btn));
		String actual_txt1= blog6_btn.getText();
	    Assert.assertEquals(actual_txt1, "INFLUENCER MARKETING");
		blog6_btn.click();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/how-can-live-communication-technologies-improve-your-sales-and-grow-your-business");		
	}
	public void verify_blog6_txt()
	{
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog6_descriptive_txt));
		String actual_txt= blog6_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "Why you need to be part of the real-time communication revolution");
    }
	
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//ul[@class=\"splide__pagination splide__pagination--ltr\"]//li[2]//button") WebElement blog_sec_yellowDot3;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[12]//img") WebElement blog7_img;
	
	public void verify_scrollable_btn2()
	{		
		//scroll.sendKeys(Keys.PAGE_DOWN);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		wait.until(ExpectedConditions.elementToBeClickable(blog_sec_yellowDot3));
 		blog_sec_yellowDot3.click();
 		
 		wait.until(ExpectedConditions.visibilityOf(blog7_img));
		boolean Element_Present = blog7_img.isDisplayed();
		Assert.assertTrue(Element_Present);	
	}	
	
	//Test Blog7
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[12]//button") WebElement blog7_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[12]//p") WebElement blog7_descriptive_txt;
	
	public void verify_blog7_img()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog7_img));
		boolean Element_Present = blog7_img.isDisplayed();
		Assert.assertTrue(Element_Present);
    }
	public void verify_blog7_btn()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.elementToBeClickable(blog7_btn));
		String actual_txt1= blog7_btn.getText();
	    Assert.assertEquals(actual_txt1, "EDTECH");
		blog6_btn.click();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/how-real-time-communications-is-bringing-us-closer-to-the-live%20revolution");		
	}
	public void verify_blogs7_txt()
	{
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog6_descriptive_txt));
		String actual_txt= blog7_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "How real-time communications is bringing us closer to the live revolution");
    }
    
	//Test Footer
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[1]//div//img") WebElement footer_vdotok_icon;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[1]//div[2]//p[@class=\"paraStyle typekit_BodyRegular webkit_primary_grey\"]") WebElement footer_descriptive_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerDownDiv\"]//div") WebElement footer_copyright_txt;
	
	public void verify_footer_vdotok_icon()
    {
		js.executeScript("window.scrollBy(0,7300)");
		wait.until(ExpectedConditions.visibilityOf(footer_vdotok_icon));
		boolean Element_Present = footer_vdotok_icon.isDisplayed();
		Assert.assertTrue(Element_Present);
    }
	
	public void verify_footer_descriptive_txt()
	{
		js.executeScript("window.scrollBy(0,7300)");
		wait.until(ExpectedConditions.visibilityOf(footer_descriptive_txt));
		String actual_txt= footer_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "Build powerful communication solutions for Live Shopping, MedTech, IoT & Social Networking");
    }
	
	public void verify_footer_copyright_txt()
	{
		js.executeScript("window.scrollBy(0,7300)");
		wait.until(ExpectedConditions.visibilityOf(footer_copyright_txt));
		String actual_txt= footer_copyright_txt.getText();
		Assert.assertEquals(actual_txt, "© 2023, VdoTok AB");
    }
	
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[@class=\"linkHead\"]") WebElement footer_vdotok_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//p[1]") WebElement footer_beta_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//a[1]") WebElement footer_about_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//a[2]") WebElement footer_pricing_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//a[3]") WebElement footer_documentation_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[1]//div[2]//a[4]") WebElement footer_FAQ_btn;
	//@FindBy(xpath="//div[@id=\"root\"]//div//div[@id=\"signup_container\"]//div[@id=\"modalmain-signup\"]//div[@id=\"navmodal-signup\"]//div[@class=\"login partition\"]//p[@class=\"heading-signin typekit_h3 webkit_primary_h\"]") WebElement signIn_title; 
	
	public void verify_footer_vdotok_txt()
	{
		js.executeScript("window.scrollBy(0,7300)");
		wait.until(ExpectedConditions.visibilityOf(footer_vdotok_txt));
		String actual_txt= footer_vdotok_txt.getText();
		Assert.assertEquals(actual_txt, "This is VdoTok");
    }
	
	public void verify_footer_beta_btn()
    {
		//js.executeScript("window.scrollBy(0,7300)");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_beta_btn));
		String actual_txt1= footer_beta_btn.getText();
	    Assert.assertEquals(actual_txt1, "Try VdoTok Beta");
	    footer_beta_btn.click();
	    wait.until(ExpectedConditions.elementToBeClickable(signIn_title));
		signIn_title.click();
		
			
	}
	
	@FindBy(xpath="//div[@id=\"root\"]//div//div[@class=\"main_vision\"]//div//div//h2") WebElement our_vision_title;

	public void verify_footer_about_btn()
    {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_about_btn));
		String actual_txt1= footer_about_btn.getText();
	    Assert.assertEquals(actual_txt1, "About");
	    footer_about_btn.click();
	    wait.until(ExpectedConditions.elementToBeClickable(our_vision_title));
	    String actual_txt2= our_vision_title.getText();
	    Assert.assertEquals(actual_txt2, "Our Vision");
			
	}
	
	public void verify_footer_pricing_btn()
    {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_pricing_btn));
		String actual_txt1= footer_pricing_btn.getText();
	    Assert.assertEquals(actual_txt1, "Pricing");
	    footer_pricing_btn.click();
	    wait.until(ExpectedConditions.elementToBeClickable(sec6_title_txt));
	    String actual_txt2= sec6_title_txt.getText();
	    Assert.assertEquals(actual_txt2, "Pay as you grow");
			
	}
	
	public void verify_footer_documentation_btn()
    {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_documentation_btn));
		String actual_txt1= footer_documentation_btn.getText();
	    Assert.assertEquals(actual_txt1, "Documentation");
	    footer_documentation_btn.click();
	    String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://doc.vdotok.com/");		
	}	    
	
	public void verify_footer_FAQ_btn()
    {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_FAQ_btn));
		String actual_txt1= footer_FAQ_btn.getText();
	    Assert.assertEquals(actual_txt1, "FAQ");
	    footer_FAQ_btn.click();
	    String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/FAQ");		
	}
			
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[2]//div[@class=\"linkHead\"]") WebElement footer_usecases_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[2]//div[2]//a[1]") WebElement footer_shopping_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[2]//div[2]//a[2]") WebElement footer_medtech_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"newfooterclass\"]//div[2]//div[2]//a[3]") WebElement footer_network_btn;
	
	public void verify_footer_usecases_txt()
	{
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.visibilityOf(footer_usecases_txt));
		String actual_txt= footer_usecases_txt.getText();
		Assert.assertEquals(actual_txt, "Use cases");
    }
	
	public void verify_footer_shopping_btn()
    {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_shopping_btn));
		String actual_txt1= footer_shopping_btn.getText();
	    Assert.assertEquals(actual_txt1, "Live Shopping");
	    footer_shopping_btn.click();
	    String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/liveshopping");		
	}
	
	public void verify_footer_medtech_btn()
    {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_medtech_btn));
		String actual_txt1= footer_medtech_btn.getText();
	    Assert.assertEquals(actual_txt1, "MedTech");
	    footer_medtech_btn.click();
	    String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/healthtech");		
	}
	public void verify_footer_network_btn()
    {
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_network_btn));
		String actual_txt1= footer_network_btn.getText();
	    Assert.assertEquals(actual_txt1, "Social Network");
	    footer_network_btn.click();
	    String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/healthtech");		
	}
	
	
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"contactMainDiv contactfooterDiv\"]//div[@class=\"linkHead contactusmbl\"]") WebElement footer_ContactUs_txt;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div//div[@class=\"contactMainDiv contactfooterDiv\"]//p") WebElement footer_email_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerUpDiv\"]//div[3]//div[@class=\"iconDiv\"]//div[1]//img") WebElement footer_facebook_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerUpDiv\"]//div[3]//div[@class=\"iconDiv\"]//div[2]//img") WebElement footer_insta_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerUpDiv\"]//div[3]//div[@class=\"iconDiv\"]//div[3]//img") WebElement footer_linkedIn_img;
	
	public void verify_footer_ContactUs_txt()
	{
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.visibilityOf(footer_ContactUs_txt));
		String actual_txt= footer_ContactUs_txt.getText();
		Assert.assertEquals(actual_txt, "Contact us");
    }
	
	public void verify_footer_email_btn()
    {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_email_btn));
		String actual_txt1= footer_email_btn.getText();
	    Assert.assertEquals(actual_txt1, "E-mail: info@vdotok.com");
	    footer_medtech_btn.click();
	}
	
	public void verify_footer_facebook_img()
    {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.visibilityOf(footer_facebook_img));
		boolean Element_Present = footer_facebook_img.isDisplayed();
		Assert.assertTrue(Element_Present);
    }
	
	public void verify_footer_facebook_btn()
    {
		js.executeScript("window.scrollBy(0,7500)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_facebook_img));
		footer_facebook_img.click();
	    String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://www.facebook.com/vdotok/");		
	}

	public void verify_footer_insta_img()
    {
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.visibilityOf(footer_insta_img));
		boolean Element_Present = footer_insta_img.isDisplayed();
		Assert.assertTrue(Element_Present);
    }
	
	public void verify_footer_insta_btn()
    {
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_insta_img));
		footer_insta_img.click();
	    String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://www.instagram.com/vdotok/");		
	}
	
	public void verify_footer_linkedIn_img()
    {
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.visibilityOf(footer_linkedIn_img));
		boolean Element_Present = footer_linkedIn_img.isDisplayed();
		Assert.assertTrue(Element_Present);
    }
	
	public void verify_footer_linkedIn_btn()
    {
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_linkedIn_img));
		footer_linkedIn_img.click();
	    String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://www.linkedin.com/company/vdotok/");		
	}	
	
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerDownDiv\"]//p//img") WebElement footer_backToTop_imgBtn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@class=\"footerMainDiv\"]//div[@class=\"footerDownDiv\"]//p[@class=\"footerBack\"]") WebElement footer_backToTop_txtBtn;
	//@FindBy(xpath="//img[@id=\"vdtbrandlogo\"]") WebElement header_logo;
	
	public void verify_footer_backToTop_imgBtn()
    {
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_backToTop_imgBtn));
		footer_backToTop_imgBtn.click();
		boolean logoPresent = header_logo.isDisplayed();
		Assert.assertTrue(logoPresent);		
	   		
	}
	
	public void verify_footer_backToTop_txtBtn()
    {
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.elementToBeClickable(footer_backToTop_txtBtn));
		footer_backToTop_txtBtn.click();
		boolean logoPresent = header_logo.isDisplayed();
		Assert.assertTrue(logoPresent);		
	   		
	}
		
}