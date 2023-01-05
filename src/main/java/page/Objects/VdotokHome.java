package page.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class VdotokHome {
    
	//protected WebDriver driver;

	String driverPath = "/usr/local/bin/chromedriver";
	WebDriver driver;
	WebDriverWait wait; 
		
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
	
	//image section
	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"headerComp \"]//div//p[1]") WebElement title_text_img_sec;
	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"headerComp \"]//div//p[2]") WebElement descriptive_text_img_sec;
	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"headerComp \"]//div//p[3]") WebElement free_mints_text;
	@FindBy(xpath="//body//div[@class=\"headerComp \"]//button[@class=\" Darkbluebtn tryfree\"]") WebElement try_button_img_sec;
	@FindBy(xpath="//body//div[@class=\"headerComp \"]//button[@class=\"Whitebtn watchdemo\"]") WebElement watchDem_btn_img_sec;
	@FindBy(xpath="//body//div[@id=\"root\"]//div//div[@class=\"headerchild2 animate__animated animate__fadeInRight\"]//img[1]") WebElement right_img_img_sec;
	
	//body section
	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[1]//img[@src=\"/static/media/toggle.d17c168685faa938121d59c5802bb74e.svg\"]") WebElement smooth_toggle;
	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[1]//p[@class=\"texttoggle eltspace webkit_primary_h typekit_LabelXL\"]") WebElement smooth_txt;
	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[2]//img[@src=\"/static/media/toggle.d17c168685faa938121d59c5802bb74e.svg\"]") WebElement scalable_toggle;
	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[2]//p[@class=\"texttoggle eltspace webkit_primary_h typekit_LabelXL\"]") WebElement scalable_txt;
	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[3]//img[@src=\"/static/media/toggle.d17c168685faa938121d59c5802bb74e.svg\"]") WebElement secure_toggle;
	@FindBy(xpath="//body//div[@id=\"root\"]//div[@class=\"mainSliderDiv\"]//div//div[3]//p[@class=\"texttoggle eltspace webkit_primary_h typekit_LabelXL\"]") WebElement secure_txt;
	
	public VdotokHome(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this); 
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("http://vdotok.com");
         
	}
	
	//Verify Title
	public void verifyTitle()
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
     
}