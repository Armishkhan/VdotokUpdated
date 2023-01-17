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

public class SignInSection {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(VdotokHome.class.getName());

	public SignInSection(WebDriver driver) {
		BasicConfigurator.configure();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}
	
	
	@FindBy(xpath = "//body//div[@id=\"vdtnavbar\"]//div[2]//ul//li[1]//button")
	WebElement login_button;
	
	@FindBy(xpath="//img[@id=\"vdtlogo\"]")
	WebElement vdotok_icon;
	
	@FindBy(xpath="//div[@class=\"login partition\"]//p[@class=\"heading-signin typekit_h3 webkit_primary_h\"]")
	WebElement signIn_title;
	
	@FindBy(xpath="//div[@class=\"login partition\"]//p[@class=\"p-signin typekit_subheadline4 webkit_primary_h\"]")
	WebElement descriptive_txt;
	
	@FindBy(xpath="//p[@id=\"emaillogin\"]")
	WebElement email_label;
	
	@FindBy(xpath="//div[@class=\"web-email\"]//input")
	WebElement email_input_field;
	
	@FindBy(xpath="//div[@class=\"forgetpasswordflex\"]//p[1]")
	WebElement password_label;
	
	@FindBy(xpath="//div[@class=\"input-password input-signin full\"]//input")
	WebElement password_input_field;
	
	@FindBy(xpath="//div[@class=\"forgetpasswordflex\"]//p[2]")
	WebElement forgot_password_option;
	
	@FindBy(xpath="//div[@class=\"input-password input-signin full\"]//div//img")
	WebElement password_visibility_icon;
	
	@FindBy(xpath="//div[@id=\"wrapper\"]//button")
	WebElement LOGIN_button;
	
	@FindBy(xpath="//p[@class=\"btmline typekit_LabelRegular webkit_primary_grey\"]")
	WebElement bottom_txt;
	
	@FindBy(xpath="//p[@class=\"btmline typekit_LabelRegular webkit_primary_grey\"]//b")
	WebElement signUp_option;
	
	@FindBy(xpath="//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]")
	WebElement cross_icon;
	
	@FindBy(xpath="//div[@id=\"navmodal-signup\"]//p[@class=\"heading-signup typekit_h3 webkit_primary_h\"]")
	WebElement signUp_title;
	
	
	public void verify_vdotok_logo() {
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(vdotok_icon));
		boolean logoPresent = vdotok_icon.isDisplayed();
		Assert.assertTrue(logoPresent);
		log.info("Vdotok Logo has been displayed on sign in pop-up");
	}
	
	public void verify_signIn_txt() {
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		String expected_title = "Sign in";
		wait.until(ExpectedConditions.visibilityOf(signIn_title));
		String actual_title = signIn_title.getText();
		Assert.assertEquals(actual_title, expected_title);
		log.info("Sign in title displayed on pop up");
	}
	
	public void verify_descriptive_txt() {
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(descriptive_txt));
		Assert.assertEquals(descriptive_txt.getText(), "Welcome, use your e-mail to continue with VdoTok");
		log.info("Descriptive text matched");
	}
	
	public void verify_email_field(String username) {	
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(email_label));
		Assert.assertEquals(email_label.getText(), "E-mail");
		wait.until(ExpectedConditions.visibilityOf(email_input_field));
		email_input_field.sendKeys(username);
		log.info("entered username");
	}
	
	public void verify_password_field(String password) {
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(password_label));
		Assert.assertEquals(password_label.getText(), "Password");
		wait.until(ExpectedConditions.visibilityOf(password_input_field));
		email_input_field.sendKeys(password);
		log.info("entered password");
	}
	
	public void verify_password_type(String password) {	
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(password_input_field));
		email_input_field.sendKeys(password);
		log.info("entered password");
		log.info("Verifying that the entered password is masked");
		String value = password_input_field.getAttribute("type");
		if (value.equals("password"))
		{
			Assert.assertTrue(true);
			log.info("password is masked");	
		}
		else 
		{
			Assert.assertTrue(false);	
		    log.info("password isn't masked");
		}
		
	}	
	
	public void verify_forgotPassword_option() {
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(forgot_password_option));
		Assert.assertEquals(forgot_password_option.getText(), "Forgot password?");
		log.info("Forgot password option displayed");
	}
	
	public void verify_PasswordVisibility_icon(String password) {
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(password_input_field));
		email_input_field.sendKeys(password);
		wait.until(ExpectedConditions.visibilityOf(forgot_password_option));
		password_visibility_icon.click();
		String value = password_input_field.getAttribute("type");
		if (value.equals("text"))
		{
			Assert.assertTrue(true);
		}
		else 
			Assert.assertTrue(false);
	}
	
	public void verify_login_button(String username, String password) throws InterruptedException {	
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(email_input_field));
		wait.until(ExpectedConditions.visibilityOf(password_input_field));
		wait.until(ExpectedConditions.visibilityOf(LOGIN_button));
		email_input_field.sendKeys(username);
		password_input_field.sendKeys(password);
		LOGIN_button.click();
		Thread.sleep(3000);
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://console.vdotok.com/overview");
		log.info("user logged in successfully");
		/*String actualUrl="https://console.vdotok.com/overview";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);*/
	}
	
	public void verify_bottom_txt() {	
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(bottom_txt));
		Assert.assertEquals(bottom_txt.getText(), "Don't have an account yet? Sign up here");
		log.info("Bottom text matched");	
	}
	
	public void verify_signUp_option() {
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(signUp_option));
		Assert.assertEquals(signUp_option.getText(), "Sign up here");
		log.info("Sign Up option available at the bottom");	
		signUp_option.click();
		wait.until(ExpectedConditions.visibilityOf(signUp_title));
		boolean Element_Present = signUp_title.isDisplayed();
		Assert.assertTrue(Element_Present);
	}
	
	public void verify_cross_icon() {	
		wait.until(ExpectedConditions.visibilityOf(login_button));
		login_button.click();
		wait.until(ExpectedConditions.visibilityOf(cross_icon));
		cross_icon.click();	
	}

}