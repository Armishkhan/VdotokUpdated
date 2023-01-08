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
	/*
	//Test Header
	
    @Test(priority=1)  
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
       
    @Test(priority=2)  
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
    
    //Test Image Section
    
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
    
    //Test main
    
    @Test(priority=9)
    public void test_smooth_toggle(){ 
    	VdotokHome home_obj = new VdotokHome(driver);
        home_obj.verify_smooth_toggle();
    }
       
    @Test(priority=10)
    public void test_smooth_txt()
    { 
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
       
    @Test(priority=15)
    public void test_body_title()
    { 
        VdotokHome home_obj = new VdotokHome(driver);
        home_obj.verify_body_title_txt();
    }
       
    @Test(priority=16)
    public void test_body_description()
    { 
        VdotokHome home_obj = new VdotokHome(driver);
        home_obj.verify_body_description_txt();
    }
    
    //Test Section1
    
    @Test(priority=8)
    public void test_sec1_txt()
    { 
        VdotokHome home_obj = new VdotokHome(driver);
        home_obj.verify_sec1_txt();
    }
       
    @Test(priority=7)
    public void test_sec1_btn1()
    { 
        VdotokHome home_obj = new VdotokHome(driver);
        home_obj.verify_sec1_exploreBtn();
    }
       
    @Test(priority=6)
    public void test_sec1_btn2()
    { 
        VdotokHome home_obj = new VdotokHome(driver);
        home_obj.verify_sec1_workBtn();
    }
       
    @Test(priority=5)
    public void test_sec1_img()
    { 
        VdotokHome home_obj = new VdotokHome(driver);
        home_obj.verify_sec1_img();
    }
    
    //Test Section2
    
	@Test(priority=0)
    public void test_sec2_txt(){ 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec2_txt();
    }
      
    @Test(priority=1)
    public void test_sec2_btn1(){ 
        VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec2_TryBtn();
    }
    
    @Test(priority=2)
    public void test_sec2_btn2()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec2_workBtn();
    }
    
    @Test(priority=3)
    public void test_sec2_img()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec2_img();
    }
    
    @Test(priority=4)
    public void test_multiplay_logo()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec2_MultiplayLogo();
    }
    
    //Test Section3
    
	@Test(priority=0)
    public void test_sec3_txt()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec3_txt();
    }
   
    @Test(priority=1)
    public void test_sec3_btn1()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec3_TryBtn();
    }
    
    @Test(priority=2)
    public void test_sec3_img()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec3_img();
    }  
      
	//Test Section4
	
	@Test(priority=0)
    public void test_sec4_txt()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec4_txt();
    }
	
	@Test(priority=1)
    public void test_sec4_img()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec4_img();
    }
	
	
	//Test Section5
	
	@Test(priority=0)
    public void test_sec5_txt()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec5_txt();
    }
	
	@Test(priority=1)
    public void test_sec5_btn()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_sec5_btn();
    }
	
	//Test Section5 Card1
	
	@Test(priority=2)
    public void test_card1_img()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card1_img();
    }
	
	@Test(priority=3)
    public void test_card1_toggle()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card1_toggle();
    }
	
	
	@Test(priority=0)
    public void test_card1_txt()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card1_txt();
    }
    
	//Test Section5 Card2
	
	@Test(priority=0)
    public void test_card3_img()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card1_img();
    }
	
	@Test(priority=1)
    public void test_card3_toggle()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card1_toggle();
    }
	
	@Test(priority=2)
    public void test_card3_txt()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card1_txt();
    }
	
	//Test Section5 Card3
	
	@Test(priority=3)
    public void test_card2_img()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card1_img();
    }
	
	@Test(priority=4)
    public void test_card2_toggle()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card1_toggle();
    }
	
	@Test(priority=5)
    public void test_card2_txt()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card1_txt();
    }
	
	//Test Section5 Card4
	
	@Test(priority=11)
    public void test_card4_Topimg()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card4_Topimg();
    }
	
	@Test(priority=12)
    public void test_card4_txt()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card4_txt();
    }
	
	@Test(priority=13)
    public void test_card4_Btmimg()
    { 
     	VdotokHome home_obj = new VdotokHome(driver);
     	home_obj.verify_card4_Btmimg();
    }
	
	//Test Section6
	
	@Test(priority=1)
	public void test_sec6_txt()
	{ 
	    VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_txt();
	}
	
	//Test Section6 Card1
	
	@Test(priority=0)
	public void test_sec6_card1_img()
	{ 
	    VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_card1_img();
	}
	
	@Test(priority=2)
	public void test_sec6_card1_txt()
	{ 
	    VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_card1_txt();
	}
	
	//Test Section6 Card2
	
	@Test(priority=0)
	public void test_sec6_card2_img()
	{ 
	    VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_card2_img();
	}
	
	@Test(priority=1)
	public void test_sec6_card2_txt()
	{ 
	    VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_card2_txt();
	}
	
	//Test Section6 Card3
	
	@Test(priority=2)
	public void test_sec6_card3_sliders()
	{ 
	    VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_card3_sliders();
	}
	
	@Test(priority=3)
	public void test_sec6_card3_inputs()
	{ 
	    VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_card3_inputs();
	}
	
	
	@Test(priority=4)
	public void test_sec6_card3_txt()
	{ 
	    VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_card3_txt();
	}
	
	@Test(priority=5)
	public void test_sec6_card3_startBtn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_card3_startBtn();
	}
	
	@Test(priority=6)
	public void test_sec6_card3_contactBtn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec6_card3_contactBtn();
	}
	
	//Test Testimonials
	
	@Test(priority=0)
	public void test_testimonials_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_testimonials_txt();
	}
	
	//Test Testimonials Card1
	
	@Test(priority=1)
	public void test_testimonial_card1_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_testimonial_card1_img();
	}
	
	@Test(priority=1)
	public void test_testimonial_card1_logo()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_testimonial_card1_logo();
	}
	
	@Test(priority=1)
	public void test_testimonial_card1_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_testimonial_card1_txt();
	}
	
	//Test Testimonials Card2
	
	@Test(priority=1)
	public void test_testimonial_card2_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_testimonial_card2_img();
	}
	
	@Test(priority=1)
	public void test_testimonial_card2_logo()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_testimonial_card2_logo();
	}
	
	@Test(priority=1)
	public void test_testimonial_card2_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_testimonial_card2_txt();
	}
	
	//Test Section8
	
	@Test(priority=1)
	public void test_sec8_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec8_txt();
	}
	
	@Test(priority=1)
	public void test_sec8_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec8_img();
	}
		
	@Test(priority=1)
	public void test_sec8_tryBtn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_sec8_tryBtn();
	}
	
	//Test Blogs
		
	@Test(priority=0)
	public void test_blogs_sec_title()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blogs_sec_title();
	}
	
	//Test Blog1
	
	@Test(priority=1)
	public void test_blog1_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog1_img();
	}
	
	@Test(priority=2)
	public void test_blog1_btn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog1_btn();
	}
	
	@Test(priority=3)
	public void test_blog1_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog1_txt();
	}
	
	//Test Blog2
	
	@Test(priority=1)
	public void test_blog2_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog2_img();
	}
	
	@Test(priority=2)
	public void test_blog2_btn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog2_btn();
	}
	
	@Test(priority=3)
	public void test_blog2_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog2_txt();
	}
	
	//Test Blog3
	
	@Test(priority=4)
	public void test_blog3_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog3_img();
	}
	
	@Test(priority=5)
	public void test_blog3_btn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog3_btn();
	}
	
	@Test(priority=6)
	public void test_blog3_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog3_txt();
	}

	
	//Test scroller1
	
	@Test(priority=0)
	public void test_scrollable_btn1()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_scrollable_btn1();
	}
	
	
	//Test Blog4
	
	@Test(priority=1)
	public void test_blog4_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog4_img();
	}
	
	@Test(priority=2)
	public void test_blog4_btn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog4_btn();
	}
	
	@Test(priority=3)
	public void test_blog4_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog4_txt();
	}
	
	//Test Blog5
	
	@Test(priority=1)
	public void test_blog5_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog5_img();
	}
	
	@Test(priority=2)
	public void test_blog5_btn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog5_btn();
	}
	
	@Test(priority=3)
	public void test_blog5_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog5_txt();
	}
	
	//Test Blog6
	
	@Test(priority=1)
	public void test_blog6_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog6_img();
	}
		
	@Test(priority=2)
	public void test_blog6_btn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog6_btn();
	}
	
	@Test(priority=3)
	public void test_blog6_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog6_txt();
	}

	//Test Scroller2
	
	@Test(priority=0)
	public void test_scrollable_btn2()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_scrollable_btn2();
	}
    //Test Blog7
	
	@Test(priority=1)
	public void test_blog7_img()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog7_img();
	}
		
	@Test(priority=2)
	public void test_blog7_btn()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog7_btn();
	}
	
	@Test(priority=3)
	public void test_blog7_txt()
	{ 
		VdotokHome home_obj = new VdotokHome(driver);
	    home_obj.verify_blog7_txt();
	}	
	*/
	
	//Test Footer
	
	
	
    @AfterMethod
    public void close()
    {
        driver.quit();
    }
    
   
    		
}
