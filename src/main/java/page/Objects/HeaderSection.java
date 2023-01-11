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

public class HeaderSection {
	WebDriver driver;
	WebDriverWait wait; 
	JavascriptExecutor js; 
	static Logger log = Logger.getLogger(VdotokHome.class.getName()); 
	
	public HeaderSection(WebDriver driver)
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
		@FindBy(xpath="//div[@class=\"paycontent\"]//p[1]") WebElement sec6_title_txt;
		@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div//p[@class=\"typekit_h2 textBold testbold eltspace\"]") WebElement blogs_sec_title_text;
		
		//Verify Title
		public void verify_title()
		{
			 
		     String ActualTitle = driver.getTitle();
		     String ExpectedTitle = "VdoTok - Easy-to-use APIs for Live Media";
		     Assert.assertEquals(ActualTitle, ExpectedTitle, "Title of the website matched");
		     log.info("Website title matched");
		}
		
		//Verify Logo
		public void verify_logo()
		{
			boolean logoPresent = header_logo.isDisplayed();
			Assert.assertTrue(logoPresent);	
			log.info("Logo is displayed in the header section");		
		}
		
		//Click on UseCases Option
		public void verify_usecases_option()
		{	
			String expected_title="Use Cases";
			String actual_title= usecases_option.getText();
			Assert.assertEquals(actual_title, expected_title);
			wait.until(ExpectedConditions.elementToBeClickable(usecases_option));	
			usecases_option.click();
			wait.until(ExpectedConditions.visibilityOf(liveShopping_option));
			boolean live = liveShopping_option.isDisplayed();
			Assert.assertTrue(live);
			log.info("Pop-uo displayed on tapping the usecases option in the header");
	 		
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
			log.info("moved to vdotok docs on tapping Docs & Tools option in the header");
		}	
		
	    //Click on Pricing option
		public void verify_pricing_option()
		{	
			String expected_title="Pricing";
			wait.until(ExpectedConditions.elementToBeClickable(pricing_option));	
			String actual_title= pricing_option.getText();
			Assert.assertEquals(actual_title, expected_title);
			pricing_option.click();	
			wait.until(ExpectedConditions.elementToBeClickable(sec6_title_txt));
			String actual_txt2= sec6_title_txt.getText();
			Assert.assertEquals(actual_txt2, "Pay as you grow");
			log.info("moved to section-6 on tapping pricing option in the header");
		}
		
		//Click on Blog Option
		public void verify_blogs_option()
		{
			String expected_title="Blog";
			wait.until(ExpectedConditions.elementToBeClickable(blogs_option));
			String actual_title= blogs_option.getText();
			Assert.assertEquals(actual_title, expected_title);
		    blogs_option.click();
		    wait.until(ExpectedConditions.visibilityOf(blogs_sec_title_text));
		    String actual_txt= blogs_sec_title_text.getText();
			Assert.assertEquals(actual_txt, "Read our Blog");
			log.info("moved to blogs section on tapping the blogs option in the header");
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
			if (signIn_title.isDisplayed())
			{
				log.info("sign in pop-up opened on tapping the login button in the header");
				signIn_title.click();
			}
			else 
				log.info("login button isn't working");
		
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
			if (cancel_login.isDisplayed())
			{
				log.info("sign up pop-up opened on tapping the login button in the header");
				cancel_login.click();
			}
			else 
				log.info("Try for Free button isn't working");
			
		} 		
}
