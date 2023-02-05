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

public class UseCasesSection {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(UseCasesSection.class.getName());

	public UseCasesSection(WebDriver driver) {
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
	
	//Live shopping
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent modal-up\"]//div[1]//div[2][@class=\"cardcontent\"]//p[1]")
	WebElement liveShopping_title;
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent modal-up\"]//div[1]//div[2][@class=\"cardcontent\"]//p[2]")
	WebElement liveShopping_description;
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent modal-up\"]//div[1]//div[@class=\"img-div-navicons\"]//img")
	WebElement liveShopping_icon;
	
	public void verify_liveShopping_option_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_title));
		Assert.assertEquals(liveShopping_title.getText(), "Live shopping");
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_description));
		Assert.assertEquals(liveShopping_description.getText(), "Integrate live influencer selling, fashion show streaming and more");
		log.info("Live shopping option is displayed along with description");
	}
	
	public void verify_liveShopping_option_icon()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(liveShopping_icon));
		boolean icon = liveShopping_icon.isDisplayed();
		Assert.assertTrue(icon);
		log.info("Live shopping icon is displayed");
	}
	
	//Healthtech
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent cards-parent-bottom\"]//div[1]//div[2][@class=\"cardcontent\"]//p[1]")
	WebElement Healthtech_title;
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent cards-parent-bottom\"]//div[1]//div[2][@class=\"cardcontent\"]//p[2]")
	WebElement Healthtech_description;
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent cards-parent-bottom\"]//div[1]//div[@class=\"img-div-navicons\"]//img")
	WebElement Healthtech_icon;
	
	public void verify_healthtech_option_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(Healthtech_title));
		Assert.assertEquals(Healthtech_title.getText(), "HealthTech");
		wait.until(ExpectedConditions.elementToBeClickable(Healthtech_description));
		Assert.assertEquals(Healthtech_description.getText(), "Build in real-time video visits, remote monitoring and more");
		log.info("Healthtech option is displayed along with description");
	}
	
	public void verify_healthtech_option_icon()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(Healthtech_icon));
		boolean icon = Healthtech_icon.isDisplayed();
		Assert.assertTrue(icon);
		log.info("Healthtech icon is displayed");
	}
	
	//Social
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent modal-up\"]//div[2]//div[2][@class=\"cardcontent\"]//p[1]")
	WebElement Social_title;
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent modal-up\"]//div[2]//div[2][@class=\"cardcontent\"]//p[2]")
	WebElement Social_description;
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent modal-up\"]//div[2]//div[@class=\"img-div-navicons\"]//img")
	WebElement Social_icon;
	
	public void verify_social_option_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(Social_title));
		Assert.assertEquals(Social_title.getText(), "Social (coming soon)");
		wait.until(ExpectedConditions.elementToBeClickable(Social_description));
		Assert.assertEquals(Social_description.getText(), "Boost customer interacion: co-shopping, co-surfing and more");
		log.info("Social option is displayed along with description");
	}
	
	public void verify_social_option_icon()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(Social_icon));
		boolean icon = Social_icon.isDisplayed();
		Assert.assertTrue(icon);
		log.info("Social icon is displayed");
	}
	
	//EdTech
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent cards-parent-bottom\"]//div[2]//div[2][@class=\"cardcontent\"]//p[1]")
	WebElement Edtech_title;
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent cards-parent-bottom\"]//div[2]//div[2][@class=\"cardcontent\"]//p[2]")
	WebElement Edtech_description;
	
	@FindBy(xpath = "//div[@id=\"root\"]//div//div[@id=\"modalmain\"]//div[@id=\"navmodal\"]//div[@class=\"cardsparent cards-parent-bottom\"]//div[2]//div[@class=\"img-div-navicons\"]//img")
	WebElement Edtech_icon;
	
	public void verify_edtech_option_txt()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(Edtech_title));
		Assert.assertEquals(Edtech_title.getText(), "EdTech (coming soon)");
		wait.until(ExpectedConditions.elementToBeClickable(Edtech_description));
		Assert.assertEquals(Edtech_description.getText(), "Create online classrooms, co-learning experiences and more");
		log.info("Edtech option is displayed along with description");
	}
	
	public void verify_edtech_option_icon()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(Edtech_icon));
		boolean icon = Edtech_icon.isDisplayed();
		Assert.assertTrue(icon);
		log.info("Edtech icon is displayed");
	}
	
	//Bottom
	
	@FindBy(xpath = "//div[@class=\"modal-bottom\"]//div//p[1]")
	WebElement Bottom_txt_title;
	
	@FindBy(xpath = "//div[@class=\"modal-bottom\"]//div//p[2]")
	WebElement Bottom_txt_description;
	
	@FindBy(xpath = "//div[@class=\"modal-bottom\"]//div[2]//button")
	WebElement contactUs_button;
	
	@FindBy(xpath = "//p[@class=\"image-p\"]")
	WebElement popUp_title;
	
	public void verify_bottom_text()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(Bottom_txt_title));
		Assert.assertEquals(Bottom_txt_title.getText(), "Couldn't find your industry?");
		wait.until(ExpectedConditions.elementToBeClickable(Bottom_txt_description));
		Assert.assertEquals(Bottom_txt_description.getText(), "Contact us and we will help you find the right live media solution for your product");
		log.info("Bottom text is displyed");
	}
	
	public void verify_ContactUs_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usecases_option));
		usecases_option.click();
		wait.until(ExpectedConditions.elementToBeClickable(contactUs_button));
		Assert.assertEquals(contactUs_button.getText(), "CONTACT US");
		contactUs_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(popUp_title));
		boolean icon = popUp_title.isDisplayed();
		Assert.assertTrue(icon);
		log.info("pop-up opened on clicking the contact us button");
		
	}
	
}