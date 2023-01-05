package page.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.After;

import org.testng.Assert;


import page.Objects.VdotokHome;

public class VdotokHomePageTest {
	
	String driverPath = "/usr/local/bin/chromedriver";
	WebDriver driver;
	
	
	@BeforeMethod
	
	public void setup(){
		
	
        System.setProperty("webdriver.chromedriver.driver", driverPath);
        
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().window().maximize(); 
		
        //driver.get("http://vdotok.com");
             
	}	
       @Test(priority=2)  
       public void test_logo()
       { 
           VdotokHome home_obj = new VdotokHome(driver);
           home_obj.verify_logo(); 
       }
       
       @Test(priority=1)  
       public void test_usecase()
       { 
           VdotokHome home_obj = new VdotokHome(driver);
           home_obj.verify_usecases_option();  
       } 
       
       @Test(priority=0)  
       public void test_docs()
       { 
           VdotokHome home_obj = new VdotokHome(driver);
           home_obj.verify_docs_option();   
       }
       
       @Test(priority=3)  
       public void test_pricing()
       { 
           VdotokHome home_obj = new VdotokHome(driver);
           home_obj.verify_pricing_option();   
       }
       
       @Test(priority=4)  
       public void test_blogs()
       { 
           VdotokHome home_obj = new VdotokHome(driver);
           home_obj.verify_blogs_option();  
       }
       
       @Test(priority=5)  
       public void test_loginbtn()
       { 
           VdotokHome home_obj = new VdotokHome(driver);
           home_obj.verify_login_button(); 
       }
       
       @Test(priority=6)  
       public void test_try_hdr_btn()
       { 
           VdotokHome home_obj = new VdotokHome(driver);
           home_obj.verify_tryforfree_button();
       }
              
        @Test(priority=7)
        public void test_image_section_txt()
        { 
            VdotokHome home_obj = new VdotokHome(driver);
            home_obj.verify_text();
        }
        @Test(priority=8)
        public void test_right_image()
        { 
            VdotokHome home_obj = new VdotokHome(driver);
            home_obj.verify_image();
        }
        
       @Test(priority=9)
       public void test_smooth_toggle(){ 
        	VdotokHome home_obj = new VdotokHome(driver);
            home_obj.verify_smooth_toggle();
       }
       
       @Test(priority=10)
       public void test_smooth_txt(){ 
        	VdotokHome home_obj = new VdotokHome(driver);
        	home_obj.verify_smooth_txt();
       }
       
       @Test(priority=11)
       public void test_scalable_toggle(){ 
        	VdotokHome home_obj = new VdotokHome(driver);
        	home_obj.verify_scalable_toggle();
       }
       
       @Test(priority=12)
       public void test_scalable_txt(){ 
        	VdotokHome home_obj = new VdotokHome(driver);
        	home_obj.verify_scalable_txt();
       }
       
       @Test(priority=13)
       public void test_secure_toggle(){ 
        	VdotokHome home_obj = new VdotokHome(driver);
        	home_obj.verify_secure_toggle();
       }
       
       @Test(priority=14)
       public void test_secure_txt(){ 
        	VdotokHome home_obj = new VdotokHome(driver);
        	home_obj.verify_secure_txt();
       }
        
        @AfterMethod
        public void close(){
              driver.quit();
           }
    		
}
