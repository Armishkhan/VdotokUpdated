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

public class BlogsSection {
	WebDriver driver;
	WebDriverWait wait; 
	JavascriptExecutor js; 
	static Logger log = Logger.getLogger(VdotokHome.class.getName());
	
	public BlogsSection(WebDriver driver)
	{
        this.driver = driver;
        PageFactory.initElements(driver, this); 
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver); 
        driver.get("http://vdotok.com");        
	}
	
	//Blogs Section
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div//p[@class=\"typekit_h2 textBold testbold eltspace\"]") WebElement blogs_sec_title_text;
	
	public void verify_blogs_sec_title()
	{
		js.executeScript("window.scrollBy(0,6800)");
	 	   wait.until(ExpectedConditions.visibilityOf(blogs_sec_title_text));
		   String actual_txt= blogs_sec_title_text.getText();
		   Assert.assertEquals(actual_txt, "Read our Blog");
		   log.info("Title matches the expected text for the blogs section ");
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
	   log.info("Img displayed for blog-1 in blogs section");
	}
	
	public void verify_blog1_btn()
	{
		js.executeScript("window.scrollBy(0,6800)");
 		wait.until(ExpectedConditions.elementToBeClickable(blog1_btn));
 		String actual_txt1= blog1_btn.getText();
		Assert.assertEquals(actual_txt1, "TELEHEALTH");
		log.info("clicked on the TELEHEALTH button in blog-1 ");
		blog1_btn.click();
		String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/what-are-emerging-technologies-in-healthcare-to-get-excited-about");	
		log.info("user is navigated to the health care page on clicking the telehealth button in blog-1");
	}
	
	public void verify_blog1_txt()
	{
		js.executeScript("window.scrollBy(0,6800)");
	 	   wait.until(ExpectedConditions.visibilityOf(blog1_descriptive_txt));
		   String actual_txt= blog1_descriptive_txt.getText();
		   Assert.assertEquals(actual_txt, "What are emerging technologies in healthcare to get excited about?");
		   log.info("blog-1 text matches with the expected text");
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
		log.info("Img displayed for blog-2 in blogs section");
	}
		
    public void verify_blog2_btn()
	{
		js.executeScript("window.scrollBy(0,6800)");
	 	wait.until(ExpectedConditions.elementToBeClickable(blog2_btn));
	 	String actual_txt1= blog2_btn.getText();
		Assert.assertEquals(actual_txt1, "INFLUENCER MARKETING");
		blog2_btn.click();
		log.info("clicked on the INFLUENCER MARKETING button in blog-2 ");
		String winHandleBefore = driver.getWindowHandle();
	    for(String winHandle : driver.getWindowHandles())
	    {
	        driver.switchTo().window(winHandle);
	    }
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/what-is-social-commerce-and-why-should-your-business-care");
		log.info("user is navigated to the business care page on clicking the influencer marketing button in blog-2");
	}
		
	public void verify_blog2_txt()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog2_descriptive_txt));
		String actual_txt= blog2_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "What is Social Commerce and why should your business care?");
		log.info("blog-2 text matches with the expected text");
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
		log.info("Img displayed for blog-3 in blogs section");
	}
		
    public void verify_blog3_btn()
	{
		js.executeScript("window.scrollBy(0,6800)");
	 	wait.until(ExpectedConditions.elementToBeClickable(blog3_btn));
	 	String actual_txt1= blog3_btn.getText();
		Assert.assertEquals(actual_txt1, "INFLUENCER MARKETING");
		blog3_btn.click();
		log.info("clicked on the INFLUENCER MARKETING button in blog-3 ");
		String winHandleBefore = driver.getWindowHandle();
	    for(String winHandle : driver.getWindowHandles())
	    {
	        driver.switchTo().window(winHandle);
	    }
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/how-can-live-communication-technologies-improve-your-sales-and-grow-your-business");
		log.info("user is navigated to the business care page on clicking the influencer marketing button in blog-3");
	}
		
	public void verify_blog3_txt()
    {
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog3_descriptive_txt));
		String actual_txt= blog3_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "How can live communication technologies improve your sales and grow your business?");
		log.info("blog-3 text matches with the expected text");
	}	
	
	//Test scrollable button
	@FindBy(xpath="//div[@id='splide05']/ul/li[2]/button") WebElement blog_sec_yellowDot2;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//img") WebElement blog4_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[11]//img") WebElement blog5_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[12]//img") WebElement blog6_img;
	
	public void verify_scrollable_btn1() throws InterruptedException
	{
		//js.executeScript("window.scrollBy(0,6800)");
		//Log.info("clicking on the element");
		//scroll.sendKeys(Keys.PAGE_DOWN);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		//wait.until(ExpectedConditions.elementToBeClickable(blog_sec_yellowDot2));
 		//blog_sec_yellowDot2.click();
		Actions actions = new Actions(driver); 
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(3000);
		actions.moveToElement(blog_sec_yellowDot2); 
		actions.click().perform(); 
		log.info("clicked on the second scrollable button in blogs section");
 		
 		wait.until(ExpectedConditions.visibilityOf(blog4_img));
		boolean Element_Present = blog4_img.isDisplayed();
		Assert.assertTrue(Element_Present);	
		
		wait.until(ExpectedConditions.visibilityOf(blog5_img));
		boolean Element_Presentt = blog5_img.isDisplayed();
		Assert.assertTrue(Element_Presentt);	
		
		wait.until(ExpectedConditions.visibilityOf(blog6_img));
		boolean Elementt_Present = blog6_img.isDisplayed();
		Assert.assertTrue(Elementt_Present);
		
		log.info("blog 4, 5 and 6 are displayed on clicking the second scrollable button in blogs section");
	}
	
	//Test Blog4
	//@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//img") WebElement blog4_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//button") WebElement blog4_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//p") WebElement blog4_descriptive_txt;
						
	public void verify_blog4_img() throws InterruptedException
    {   
		verify_scrollable_btn1();
		wait.until(ExpectedConditions.visibilityOf(blog4_img));
		boolean Element_Present = blog4_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Img displayed for blog-4 in blogs section");
    }
			
	public void verify_blog4_btn() throws InterruptedException
    {   
		
		verify_scrollable_btn1();
		wait.until(ExpectedConditions.elementToBeClickable(blog4_btn));
		String actual_txt1= blog4_btn.getText();
	    Assert.assertEquals(actual_txt1, "LIVE REVOLUTION");
		blog4_btn.click();
		log.info("clicked on the LIVE REVOLUTION button in blog-4 ");
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/three-types-of-telemedicine");
		log.info("user is navigated to the telemedicine page on clicking the live revolution button in blog-4");
	}
			
	public void verify_blog4_txt() throws InterruptedException
	{   
		verify_scrollable_btn1();
		js.executeScript("window.scrollBy(0,6800)");
		wait.until(ExpectedConditions.visibilityOf(blog4_descriptive_txt));
		String actual_txt= blog4_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "What are three different types of TeleHealth?");
		log.info("blog-4 text matches with the expected text");
    }	

	//Test Blog5
	//@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//img") WebElement blog4_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[11]//button") WebElement blog5_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[11]//p") WebElement blog5_descriptive_txt;
	
	public void verify_blog5_img() throws InterruptedException
    {
		verify_scrollable_btn1();
		wait.until(ExpectedConditions.visibilityOf(blog5_img));
		boolean Element_Present = blog5_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Img displayed for blog-5 in blogs section");
    }
	public void verify_blog5_btn() throws InterruptedException
    {
		verify_scrollable_btn1();
		wait.until(ExpectedConditions.elementToBeClickable(blog5_btn));
		String actual_txt1= blog5_btn.getText();
	    Assert.assertEquals(actual_txt1, "INFLUENCER MARKETING");
		blog5_btn.click();
		log.info("clicked on the INFLUENCER MARKETING button in blog-5 ");
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/what-is-live-shopping");	
		log.info("user is navigated to the business care page on clicking the influencer marketing button in blog-5");
	}
	public void verify_blog5_txt() throws InterruptedException
	{
		verify_scrollable_btn1();
		wait.until(ExpectedConditions.visibilityOf(blog5_descriptive_txt));
		String actual_txt= blog5_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "What is live shopping?");
		log.info("blog-5 text matches with the expected text");
    }

	//Test Blog6
	//@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[10]//img") WebElement blog4_img;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[12]//button") WebElement blog6_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[12]//p") WebElement blog6_descriptive_txt;
	
	public void verify_blog6_img() throws InterruptedException
    {
		verify_scrollable_btn1();
		wait.until(ExpectedConditions.visibilityOf(blog6_img));
		boolean Element_Present = blog6_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Img displayed for blog-6 in blogs section");
    }
	public void verify_blog6_btn() throws InterruptedException
    {
		verify_scrollable_btn1();
		wait.until(ExpectedConditions.elementToBeClickable(blog6_btn));
		String actual_txt1= blog6_btn.getText();
	    Assert.assertEquals(actual_txt1, "CUSTOMER SUPPORT");
		blog6_btn.click();
		log.info("clicked on the INFLUENCER MARKETING button in blog-6 ");
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/why-you-need-to-be-part-of-the-real-time-communication-revolution");
		log.info("user is navigated to the CUSTOMER SUPPOERT page on clicking the influencer marketing button in blog-6");	
	}
	public void verify_blog6_txt() throws InterruptedException
	{
		verify_scrollable_btn1();
		wait.until(ExpectedConditions.visibilityOf(blog6_descriptive_txt));
		String actual_txt= blog6_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "Why you need to be part of the real-time communication revolution");
		log.info("blog-6 text matches with the expected text");
    }
	
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//ul[@class=\"splide__pagination splide__pagination--ltr\"]//li[3]//button") WebElement blog_sec_yellowDot3;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[13]//img") WebElement blog7_img;
	
	public void verify_scrollable_btn2() throws InterruptedException
	{		
		Actions actions = new Actions(driver); 
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(3000);
		actions.moveToElement(blog_sec_yellowDot3); 
		actions.click().perform(); 
		log.info("clicked on the second scrollable button in blogs section");
 		
 		wait.until(ExpectedConditions.visibilityOf(blog7_img));
		boolean Element_Present = blog7_img.isDisplayed();
		Assert.assertTrue(Element_Present);	
		log.info("blog 7 is displayed on clickig the second scrollable button in blogs section");
	}	
	
	//Test Blog7
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[13]//button") WebElement blog7_btn;
	@FindBy(xpath="//div[@id=\"root\"]//div[@id=\"documentation\"]//div[2]//div//div[2]//ul//li[13]//p") WebElement blog7_descriptive_txt;
	
	public void verify_blog7_img() throws InterruptedException
    {
		verify_scrollable_btn2();
		wait.until(ExpectedConditions.visibilityOf(blog7_img));
		boolean Element_Present = blog7_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Img displayed for blog-7 in blogs section");
    }
	public void verify_blog7_btn() throws InterruptedException
    {
		verify_scrollable_btn2();
		wait.until(ExpectedConditions.elementToBeClickable(blog7_btn));
		String actual_txt1= blog7_btn.getText();
	    Assert.assertEquals(actual_txt1, "EDTECH");
		blog6_btn.click();
		log.info("clicked on the EDTECH button in blog-7 ");
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
	    String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://go.vdotok.com/blog/why-you-need-to-be-part-of-the-real-time-communication-revolution");	
		log.info("user is navigated to the revolution page on clicking the edtech button in blog-7");
	}
	public void verify_blogs7_txt() throws InterruptedException
	{
		verify_scrollable_btn2();
		wait.until(ExpectedConditions.visibilityOf(blog6_descriptive_txt));
		String actual_txt= blog7_descriptive_txt.getText();
		Assert.assertEquals(actual_txt, "How real-time communications is bringing us closer to the live revolution");
		log.info("blog-7 text matches with the expected text");
    }
    
	
}