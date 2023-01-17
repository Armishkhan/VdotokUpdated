
/*
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

public class SignUpSection {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(VdotokHome.class.getName());

	public SignUpSection(WebDriver driver) {
	BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}
	
	@FindBy(xpath="//img[@id=\"vdtlogo\"]")
	WebElement vdotok_icon;
	
	@FindBy(xpath="//div[@id=\"navmodal-signup\"]//p[@class=\"heading-signup typekit_h3 webkit_primary_h\"]")
	WebElement signUp_title;
	
	@FindBy(xpath="//div[@id=\"navmodal-signup\"]//p[@class=\"p-signup typekit_subheadline4 webkit_primary_h\"]")
	WebElement descriptive_txt;
	
	@FindBy(xpath="//div[@id=\"navmodal-signup\"]/div[@class=\"partition\"]//div[1][@class=\"parent-inputs desktop\"]//div[1]//p")
	WebElement first_name_txt;
	
	@FindBy(xpath="//div[@id=\"navmodal-signup\"]/div[@class=\"partition\"]//div[1][@class=\"parent-inputs desktop\"]//div[2]//p")
	WebElement last_name_txt;
	
	@FindBy(xpath="//input[@id=\"firstname\"]")
	WebElement first_name_input;
	
	@FindBy(xpath="//div[@id=\"navmodal-signup\"]/div[@class=\"partition\"]//div[1][@class=\"parent-inputs desktop\"]//div[2]//input")
	WebElement last_name_input;
	
	@FindBy(xpath="//div[@class=\"web-email\"]//p")
	WebElement email_txt;
	
	@FindBy(xpath="//div[@class=\"web-email\"]//input")
	WebElement email_input;
	
	@FindBy(xpath="//div[@class=\"parent-country\"]//p")
	WebElement country_txt;
	
	@FindBy(xpath="//div[@class=\"input-password input-country input-signup full\"]//div[@class=\"dropdowntext typekit_LabelRegular webkit_primary_grey\"]//img")
	WebElement country_flag;
	
	@FindBy(xpath="//div[@class=\"input-password input-country input-signup full\"]//div[@class=\"dropdowntext typekit_LabelRegular webkit_primary_grey\"]")
	WebElement country_name;
	
	@FindBy(xpath="//div[@class=\"input-password input-country input-signup full\"]//div[2]//img")
	WebElement country_dropdown_icon;
	
	@FindBy(xpath="//div[@class=\"partition\"]//div[6]//p")
	WebElement password_txt;
	
	@FindBy(xpath="//div[@class=\"partition\"]//div[6]//div//input")
	WebElement password_input;
	
	@FindBy(xpath="//div[@class=\"partition\"]//div[6]//div//img")
	WebElement password_visibility_icon;
	
	@FindBy(xpath="//div[@class=\"partition\"]//div[7]//div")
	WebElement TandC_checkbox;
	
	@FindBy(xpath="//div[@class=\"partition\"]//div[7]//p")
	WebElement TandC_txt;
	
	@FindBy(xpath="//div[@id=\"wrapper\"]//button")
	WebElement signUp_button;
	
	@FindBy(xpath="//div[@class=\"partition\"]//p[@class=\"p-terms center\"]")
	WebElement already_txt;
	
	@FindBy(xpath="//div[@class=\"partition\"]//div[7]//p//b[1]")
	WebElement privacyPolicy_txt;
	
	@FindBy(xpath="//div[@class=\"partition\"]//div[7]//p//b[2]")
	WebElement termsOfServices_txt;
	
	@FindBy(xpath="//div[@class=\"partition\"]//p[@class=\"p-terms center\"]//b")
	WebElement SignIn_option;
	
	@FindBy(xpath="//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]")
	WebElement cross_icon;
	
	@FindBy(xpath="//div[@id=\"phonediv\"]//video[@id=\"dockvideo\"]")
	WebElement video;
	
	@FindBy(xpath = "//body//div[@id=\"vdtnavbar\"]//div[2]//ul//li[2]//button")
	WebElement try_button;
	
	public void verify_vdotok_logo() 
	{
		wait.until(ExpectedConditions.visibilityOf(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(vdotok_icon));
		boolean Element_Present = vdotok_icon.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Vdotok logo displayed on Sign up pop-up");
	}
	
}*/