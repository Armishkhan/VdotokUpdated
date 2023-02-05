
package page.Objects;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tika.metadata.Message;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.css.Counter;

import net.lightbody.bmp.proxy.jetty.jetty.servlet.SessionManager.Session;
import javax.mail.Authenticator;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Store;

import java.util.Properties;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class SignUpSection {

	private static final String Authenticator = null;
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	static Logger log = Logger.getLogger(SignUpSection.class.getName());

	public SignUpSection(WebDriver driver) {
		BasicConfigurator.configure();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("http://vdotok.com");
	}

	@FindBy(xpath = "//body//div[@id=\"vdtnavbar\"]//div[2]//ul//li[2]//button")
	WebElement try_button;

	@FindBy(xpath = "//img[@id=\"vdtlogo\"]")
	WebElement vdotok_icon;

	@FindBy(xpath = "//div[@id=\"navmodal-signup\"]//p[@class=\"heading-signup typekit_h3 webkit_primary_h\"]")
	WebElement signUp_title;

	@FindBy(xpath = "//div[@id=\"navmodal-signup\"]//p[@class=\"p-signup typekit_subheadline4 webkit_primary_h\"]")
	WebElement descriptive_txt;

	@FindBy(xpath = "//div[@id=\"navmodal-signup\"]/div[@class=\"partition\"]//div[1][@class=\"parent-inputs desktop\"]//div[1]//p")
	WebElement first_name_txt;

	@FindBy(xpath = "//input[@id=\"firstname\"]")
	WebElement first_name_input;

	@FindBy(xpath = "//div[@id=\"navmodal-signup\"]/div[@class=\"partition\"]//div[1][@class=\"parent-inputs desktop\"]//div[2]//p")
	WebElement last_name_txt;

	@FindBy(xpath = "//div[@id=\"navmodal-signup\"]/div[@class=\"partition\"]//div[1][@class=\"parent-inputs desktop\"]//div[2]//input")
	WebElement last_name_input;

	@FindBy(xpath = "//div[@class=\"web-email\"]//p")
	WebElement email_txt;

	@FindBy(xpath = "//div[@class=\"web-email\"]//input")
	WebElement email_input;

	@FindBy(xpath = "//div[@class=\"parent-country\"]//p")
	WebElement country_label;

	@FindBy(xpath = "//div[@class=\"input-password input-country input-signup full\"]//div[2]//img")
	WebElement country_dropdown_icon;

	@FindBy(xpath = "//div[@class=\"dropdownBody\"]")
	WebElement Dropdown_body;

	@FindBy(xpath = "//div[@class=\"input-password input-country input-signup full\"]//div[@class=\"dropdowntext typekit_LabelRegular webkit_primary_grey\"]//img")
	WebElement country_flag;

	@FindBy(xpath = "//div[@class=\"input-password input-country input-signup full\"]//div[@class=\"dropdowntext typekit_LabelRegular webkit_primary_grey\"]")
	WebElement country_name;

	@FindBy(xpath = "//div[@class=\"partition\"]//div[6]//p")
	WebElement password_txt;

	@FindBy(xpath = "//div[@class=\"partition\"]//div[6]//div//input")
	WebElement password_input;

	@FindBy(xpath = "//div[@class=\"partition\"]//div[6]//div//img")
	WebElement password_visibility_icon;

	@FindBy(xpath = "//div[@class=\"partition\"]//div[7]//div")
	WebElement TandC_checkbox;

	@FindBy(xpath = "//div[@class=\"partition\"]//div[7]//p")
	WebElement TandC_txt;

	@FindBy(xpath = "//button[@id=\"btn-signup\"]")
	WebElement signUp_button;

	@FindBy(xpath = "//div[@class=\"partition\"]//p[@class=\"p-terms center\"]")
	WebElement already_txt;

	@FindBy(xpath = "//div[@class=\"partition\"]//p[@class=\"p-terms center\"]//b")
	WebElement SignIn_option;

	@FindBy(xpath = "//div[@id=\"withimg\"]//div//img[@src=\"/static/media/x-circle.8b9fa0f0dd9200eb5d33.webp\"]")
	WebElement cross_icon;

	@FindBy(xpath = "//div[@id=\"phonediv\"]//video[@id=\"dockvideo\"]")
	WebElement video;

	@FindBy(xpath = "//div[@class=\"partition\"]//div[7]//p//b[1]")
	WebElement termsOfServices_txt;

	@FindBy(xpath = "//div[@class=\"partition\"]//div[7]//p//b[2]")
	WebElement privacyPolicy_txt;

	public void verify_vdotok_logo() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(vdotok_icon));
		boolean Element_Present = vdotok_icon.isDisplayed();
		Assert.assertTrue(Element_Present);
		log.info("Vdotok logo displayed on Sign up pop-up");
	}

	public void verify_title_text() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(signUp_title));
		Assert.assertEquals(signUp_title.getText(), "Sign up");
		wait.until(ExpectedConditions.visibilityOf(descriptive_txt));
		Assert.assertEquals(descriptive_txt.getText(), "No credit card required.");
	}

	public void verify_first_name() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(first_name_txt));
		Assert.assertEquals(first_name_txt.getText(), "First name");
		wait.until(ExpectedConditions.visibilityOf(first_name_input));
		Assert.assertTrue(first_name_input.isDisplayed());
	}

	public void verify_last_name() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(last_name_txt));
		Assert.assertEquals(last_name_txt.getText(), "Last name");
		wait.until(ExpectedConditions.visibilityOf(last_name_input));
		Assert.assertTrue(last_name_input.isDisplayed());
	}

	public void verify_email() {
		wait.until(ExpectedConditions.visibilityOf(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(email_txt));
		Assert.assertEquals(email_txt.getText(), "E-mail");
		wait.until(ExpectedConditions.visibilityOf(email_input));
		Assert.assertTrue(email_input.isDisplayed());
	}

	public void verify_country() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(country_label));
		Assert.assertEquals(country_label.getText(), "Country");
	}

	public void verify_CountryDropdown() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(country_dropdown_icon));
		country_dropdown_icon.click();
		wait.until(ExpectedConditions.visibilityOf(Dropdown_body));
		Assert.assertTrue(Dropdown_body.isDisplayed());
	}

	public void verify_password_field() {
		wait.until(ExpectedConditions.visibilityOf(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(password_txt));
		Assert.assertEquals(password_txt.getText(), "Password");
		wait.until(ExpectedConditions.visibilityOf(password_input));
		Assert.assertTrue(password_input.isDisplayed());
	}

	public void verify_password_type() {
		wait.until(ExpectedConditions.visibilityOf(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(password_input));
		password_input.sendKeys("Armish1234$");
		log.info("entered password");
		log.info("Verifying that the entered password is masked");
		String value = password_input.getAttribute("type");
		if (value.equals("password")) {
			Assert.assertTrue(true);
			log.info("password is masked");
		} else {
			Assert.assertTrue(false);
			log.info("password isn't masked");
		}

	}

	public void verify_PasswordVisibility_icon() {
		wait.until(ExpectedConditions.visibilityOf(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(password_input));
		password_input.sendKeys("Armish1234$");
		wait.until(ExpectedConditions.visibilityOf(password_visibility_icon));
		password_visibility_icon.click();
		String value = password_input.getAttribute("type");
		if (value.equals("text")) {
			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);
	}

	/*
	 * public void verify_CountryDropdown_functionality() {
	 * wait.until(ExpectedConditions.visibilityOf(try_button)); try_button.click();
	 * wait.until(ExpectedConditions.visibilityOf(country_dropdown_icon));
	 * country_dropdown_icon.click(); }
	 */

	@FindBy(xpath = "//p[@id=\"focuss\"]")
	WebElement verify_email_txt;

	public void verify_signUp_form() throws IOException {
		
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();

		File src = new File("/Users/norgic/Documents/Users.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet ws = wb.getSheet("sheet1");

		int rowNum = ws.getLastRowNum() + 1;
		int colNum = ws.getRow(0).getLastCellNum();

		Random random = new Random();
		int rand = 0;
		while (true) {
			rand = random.nextInt(1000);
			if (rand != 0)
				break;
		}

		// System.out.println(rand);

		XSSFRow row = ws.getRow(rand);
		for (int j = 0; j < colNum; j++) {
			XSSFCell cell = row.getCell(j);
			DataFormatter dataFormatter = new DataFormatter();
			if (j == 0) {
				String fname = dataFormatter.formatCellValue(cell);
				wait.until(ExpectedConditions.visibilityOf(first_name_input));
				first_name_input.sendKeys(fname);
			} else if (j == 1) {
				String lname = dataFormatter.formatCellValue(cell);
				wait.until(ExpectedConditions.visibilityOf(last_name_input));
				last_name_input.sendKeys(lname);
			} else {
				String mail = dataFormatter.formatCellValue(cell);
				wait.until(ExpectedConditions.visibilityOf(email_input));
				email_input.sendKeys(mail);
			}

		}

		wait.until(ExpectedConditions.elementToBeClickable(country_flag));
		wait.until(ExpectedConditions.elementToBeClickable(password_input));
		password_input.sendKeys("Armish1234$");

		wait.until(ExpectedConditions.elementToBeClickable(TandC_checkbox));
		TandC_checkbox.click();

		wait.until(ExpectedConditions.elementToBeClickable(signUp_button));
		signUp_button.click();

		wait.until(ExpectedConditions.elementToBeClickable(verify_email_txt));
		Assert.assertTrue(verify_email_txt.isDisplayed());
		
		
		
		
	}

	public void verify_bottom_txt() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(already_txt));
		Assert.assertEquals(already_txt.getText(), "Already have an account?\n" + "Sign in here");
		log.info("Bottom text matched");
	}

	public void verify_bottom_checkbox() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(TandC_checkbox));
		wait.until(ExpectedConditions.elementToBeClickable(TandC_txt));
		Assert.assertEquals(TandC_txt.getText(),
				"I have read and agree to the VdoTok Terms of Service and Privacy Policy.");
		TandC_checkbox.click();
		Assert.assertTrue(TandC_checkbox.isDisplayed());
	}

	@FindBy(xpath = "//div[@class=\"login partition\"]//p[@class=\"heading-signin typekit_h3 webkit_primary_h\"]")
	WebElement signIn_title;

	public void verify_signUp_option() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(SignIn_option));
		Assert.assertEquals(SignIn_option.getText(), "Sign in here");
		log.info("Sign in option available at the bottom");
		SignIn_option.click();
		wait.until(ExpectedConditions.visibilityOf(signIn_title));
		boolean Element_Present = signIn_title.isDisplayed();
		Assert.assertTrue(Element_Present);
	}

	public void verify_cross_icon() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(cross_icon));
		cross_icon.click();
	}

	public void verify_privacy_policy() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(privacyPolicy_txt));
		Assert.assertEquals(privacyPolicy_txt.getText(), "Privacy Policy.");
		privacyPolicy_txt.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/privacypolicy");

	}

	public void verify_TermsOfServices() {
		wait.until(ExpectedConditions.elementToBeClickable(try_button));
		try_button.click();
		wait.until(ExpectedConditions.visibilityOf(termsOfServices_txt));
		Assert.assertEquals(termsOfServices_txt.getText(), "Terms of Service");
		termsOfServices_txt.click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://vdotok.com/termsofservices");

	}

}
