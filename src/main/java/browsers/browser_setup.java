package browsers;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class browser_setup {
	
    protected WebDriver driver=null;
	String driverPath = "/usr/local/bin/chromedriver";

	@BeforeMethod

	public void setup() {

		System.setProperty("webdriver.chromedriver.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		
	}
/*
	@AfterMethod
	public void close() {
		driver.quit();
	}
*/
}
