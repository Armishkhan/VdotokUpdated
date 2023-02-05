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
import org.apache.log4j.BasicConfigurator;

public class TestimonialsSection {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(TestimonialsSection.class.getName());

	public TestimonialsSection(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	// Testimonial1
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div//p[@class=\"webkit_primary_black testimonialhbold typekit_h2\"]")
	WebElement testimonial_title_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div//p[@class=\"webkit_primary_black typekit_subheadline2\"]")
	WebElement testimonial_description_txt;

	public void verify_testimonials_txt() {
		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(testimonial_title_txt));
		String actual_txt = testimonial_title_txt.getText();
		Assert.assertEquals(actual_txt, "Testimonials");
		log.info("Title of the testimonials section matched with the expected text");

		wait.until(ExpectedConditions.visibilityOf(testimonial_description_txt));
		String actual_txt2 = testimonial_description_txt.getText();
		Assert.assertEquals(actual_txt2, "We empower customers in dozens of industries and occupations.\n"
				+ "Read what they find VdoTok useful for.");
		log.info("Descriptive text of the testimonials section matched with the expected text");
	}

	// Testimonial Card1
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[2]//div//div[2]//img[@src=\"https://s3.eu-central-1.amazonaws.com/vdotok-bucket/1656405221163204792.png\"]")
	WebElement testimonial_card1_img;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"txtcard\"]//p")
	WebElement testimonial_card1_description_txt1;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"greydiv\"]//p[@class=\"testp2 typekit_LabelRegularBold webkit_primary_h eltspace\"]")
	WebElement testimonial_card1_name_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"greydiv\"]//p[@class=\"testp3 typekit_LabelLight webkit_primary_grey eltspace\"]")
	WebElement testimonial_card1_designation_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"greydiv\"]//div[2]//p")
	WebElement testimonial_card1_description_txt2;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[1]//div[@class=\"greydiv\"]//img")
	WebElement testimonial_card1_logo;

	public void verify_testimonial_card1_img() {
		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_img));
		boolean Element_Present = testimonial_card1_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Img is displayed in card-1 of testimonials section");
	}

	public void verify_testimonial_card1_logo() {
		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_logo));
		boolean Element_Present = testimonial_card1_logo.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("logo is displayed in card-1 of testimonials section");
	}

	public void verify_testimonial_card1_txt() {
		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_description_txt1));
		String actual_txt = testimonial_card1_description_txt1.getText();
		Assert.assertEquals(actual_txt,
				"TwoAct is currently helping children with their mental health in Sweden and VdoTok’s upcoming video bot API is a great opportunity for TwoAct to build a video bot quickly and easily for children to support them with their mental health.");
		log.info(
				"Company description-1 is displayed in card-1 of testimonials section and matches with the expected text ");

		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_name_txt));
		String actual_txt2 = testimonial_card1_name_txt.getText();
		Assert.assertEquals(actual_txt2, "Jonas");
		log.info("Name is displayed in card-1 of testimonials section");

		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_designation_txt));
		String actual_txt4 = testimonial_card1_designation_txt.getText();
		Assert.assertEquals(actual_txt4, "CEO, TwoAct AB");
		log.info("Designation is displayed in card-1 of testimonials section");

		wait.until(ExpectedConditions.visibilityOf(testimonial_card1_description_txt2));
		String actual_txt3 = testimonial_card1_description_txt2.getText();
		Assert.assertEquals(actual_txt3,
				"TwoAct is a Handle-IT concept from Sweden that creates the best possible conditions for good mental health and schooling for students.");
		log.info(
				"Company description-2 is displayed in card-1 of testimonials section and matches with the expected text ");
	}

	// Testimonial Card2
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[2]//div//ul//li[2]//img[@src=\"https://s3.eu-central-1.amazonaws.com/vdotok-bucket/1648717596936394840.jpe\"]")
	WebElement testimonial_card2_img;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[2]//li[2]//div[@class=\"txtcard\"]//p[@class=\"webkit_primary_black typekit_LabelRegular\"]")
	WebElement testimonial_card2_description_txt1;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[2]//div[@class=\"greydiv\"]//p[@class=\"testp2 typekit_LabelRegularBold webkit_primary_h eltspace\"]")
	WebElement testimonial_card2_name_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[2]//div[@class=\"greydiv\"]//p[@class=\"testp3 typekit_LabelLight webkit_primary_grey eltspace\"]")
	WebElement testimonial_card2_designation_txt;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[2]//div[@class=\"greydiv\"]//div[2]//p")
	WebElement testimonial_card2_description_txt2;
	@FindBy(xpath = "//div[@id=\"root\"]//div[@class=\"testinomial\"]//div[@id=\"desktops\"]//div//ul//li[2]//div[@class=\"greydiv\"]//img")
	WebElement testimonial_card2_logo;

	public void verify_testimonial_card2_img() {
		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(testimonial_card2_img));
		boolean Element_Present = testimonial_card2_img.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Img is displayed in card-2 of testimonials section");
	}

	public void verify_testimonial_card2_logo() {
		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(testimonial_card2_logo));
		boolean Element_Present = testimonial_card2_logo.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("logo is displayed in card-2 of testimonials section");
	}

	public void verify_testimonial_card2_txt() {
		js.executeScript("window.scrollBy(0,5000)");
		wait.until(ExpectedConditions.visibilityOf(testimonial_card2_description_txt1));
		String actual_txt = testimonial_card2_description_txt1.getText();
		Assert.assertEquals(actual_txt,
				"Norgic is a software services provider and we’re currently using VdoTok’s cloud communication platform to build digital communication software products for us customers. As a front-end developer, it was a great experience to build a software product quickly without being worried about complex backend systems.");
		log.info(
				"Company description-1 is displayed in card-2 of testimonials section and matches with the expected text ");

		wait.until(ExpectedConditions.visibilityOf(testimonial_card2_name_txt));
		String actual_txt2 = testimonial_card2_name_txt.getText();
		Assert.assertEquals(actual_txt2, "Asad");
		log.info("Name is displayed in card-2 of testimonials section");

		wait.until(ExpectedConditions.visibilityOf(testimonial_card2_designation_txt));
		String actual_txt4 = testimonial_card2_designation_txt.getText();
		Assert.assertEquals(actual_txt4, "Lead Front-End Developer, Norgic AB");
		log.info("Designation is displayed in card-2 of testimonials section");

		wait.until(ExpectedConditions.visibilityOf(testimonial_card2_description_txt2));
		String actual_txt3 = testimonial_card2_description_txt2.getText();
		Assert.assertEquals(actual_txt3,
				"Norgic is a software services provider from Sweden focused on digital communication software solutions.");
		log.info(
				"Company description-2 is displayed in card-2 of testimonials section and matches with the expected text ");
	}

}