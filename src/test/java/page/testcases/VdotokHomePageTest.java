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
import page.Objects.HeaderSection;
import page.Objects.ImageSection;
import page.Objects.Section1;
import page.Objects.Section2;
import page.Objects.Section3;
import page.Objects.Section4;
import page.Objects.Section5;
import page.Objects.Section6;
import page.Objects.TestimonialsSection;
import page.Objects.Section8;
import page.Objects.BlogsSection;
import page.Objects.FooterSection;

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
	
	
	////////////////////////////////////////////////////////// TEST HEADER SECTION //////////////////////////////////////////////////////////////
	
/*	@Test(priority=0)  
    public void test_title()
    { 
		HeaderSection header_obj = new HeaderSection(driver);
		header_obj.verify_title(); 
    }
	
	//Test Header
	
    @Test(priority=1)  
    public void test_logo()
    { 
    	HeaderSection header_obj = new HeaderSection(driver);
    	header_obj.verify_logo(); 
    }
       
    @Test(priority=2)  
    public void test_usecase()
    { 
    	HeaderSection header_obj = new HeaderSection(driver);
    	header_obj.verify_usecases_option();  
    } 
       
    @Test(priority=3)  
    public void test_docs()
    { 
    	HeaderSection header_obj = new HeaderSection(driver);
    	header_obj.verify_docs_option();   
    }
     
    @Test(priority=4)  
    public void test_pricing()
    { 
    	HeaderSection header_obj = new HeaderSection(driver);
    	header_obj.verify_pricing_option();   
    }
       
    @Test(priority=5)  
    public void test_blogs()
    { 
    	HeaderSection header_obj = new HeaderSection(driver);
        header_obj.verify_blogs_option();  
    }
       
    @Test(priority=6)  
    public void test_loginbtn()
    { 
    	HeaderSection header_obj = new HeaderSection(driver);
        header_obj.verify_login_button(); 
    }
       
    @Test(priority=7)  
    public void test_try_hdr_btn()
    { 
    	HeaderSection header_obj = new HeaderSection(driver);
        header_obj.verify_tryforfree_button();
    }
    
	////////////////////////////////////////////////////////// TEST IMAGE-SECTION ///////////////////////////////////////////////////////////////////
  
    //Test Image Section
    @Test(priority=7)
    public void test_image_section_txt()
    { 
        ImageSection imgSec_obj = new ImageSection(driver);
        imgSec_obj.verify_text();
    }
       
    @Test(priority=8)
    public void test_right_image()
    { 
    	ImageSection imgSec_obj = new ImageSection(driver);
    	imgSec_obj.verify_image();
    }
    
    @Test(priority=9)
    public void test_sec1_tryBtn()
    { 
    	ImageSection imgSec_obj = new ImageSection(driver);
    	imgSec_obj.verify_sec1_tryBtn();
    }
    
    @Test(priority=10)
    public void test_sec1_DemoBtn()
    { 
    	ImageSection imgSec_obj = new ImageSection(driver);
    	imgSec_obj.verify_sec1_DemoBtn();
    }
  
    ////////////////////////////////////////////////////////// TEST SECTION-1 ///////////////////////////////////////////////////////////////////	
	
    //Test main body   
    @Test(priority=11)
    public void test_smooth_toggle(){ 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_smooth_toggle();
    }
       
    @Test(priority=12)
    public void test_smooth_txt()
    { 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_smooth_txt();
    }
       
    @Test(priority=13)
    public void test_scalable_toggle(){ 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_scalable_toggle();
    }
       
    @Test(priority=14)
    public void test_scalable_txt(){ 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_scalable_txt();
    }
       
    @Test(priority=15)
    public void test_secure_toggle(){ 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_secure_toggle();
    }
       
    @Test(priority=16)
    public void test_secure_txt(){ 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_secure_txt();
    }
       
    @Test(priority=17)
    public void test_body_title()
    { 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_body_title_txt();
    }
       
    @Test(priority=18)
    public void test_body_description()
    { 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_body_description_txt();
    }
    
    //Test Body Section1
    
    @Test(priority=19)
    public void test_sec1_txt()
    { 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_sec1_txt();
    }
       
    @Test(priority=20)
    public void test_sec1_btn1()
    { 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_sec1_exploreBtn();
    }
       
    @Test(priority=21)
    public void test_sec1_btn2()
    { 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_sec1_workBtn();
    }
       
    @Test(priority=22)
    public void test_sec1_img()
    { 
    	Section1 sec1_obj = new Section1(driver);
    	sec1_obj.verify_sec1_img();
    }
    
  
    ////////////////////////////////////////////////////////// TEST SECTION-2 /////////////////////////////////////////////////////////////////////
    
	//Test Body Section-2
	@Test(priority=23)
    public void test_sec2_txt(){ 
		Section2 sec2_obj = new Section2(driver);
		sec2_obj.verify_sec2_txt();
    }
      
    @Test(priority=24)
    public void test_sec2_btn1(){ 
    	Section2 sec2_obj = new Section2(driver);
    	sec2_obj.verify_sec2_TryBtn();
    }
    
    @Test(priority=25)
    public void test_sec2_btn2()
    { 
    	Section2 sec2_obj = new Section2(driver);
    	sec2_obj.verify_sec2_workBtn();
    }
    
    @Test(priority=26)
    public void test_sec2_img()
    { 
    	Section2 sec2_obj = new Section2(driver);
    	sec2_obj.verify_sec2_img();
    }
    
    @Test(priority=27)
    public void test_multiplay_logo()
    { 
    	Section2 sec2_obj = new Section2(driver);
    	sec2_obj.verify_sec2_MultiplayLogo();
    }
   
    ////////////////////////////////////////////////////////// TEST SECTION-3 /////////////////////////////////////////////////////////////////////
    
    //Test Body Section3
    
	@Test(priority=28)
    public void test_sec3_txt()
    { 
     	Section3 sec3_obj = new Section3(driver);
     	sec3_obj.verify_sec3_txt();
    }
   
    @Test(priority=29)
    public void test_sec3_btn1()
    { 
     	Section3 sec3_obj = new Section3(driver);
     	sec3_obj.verify_sec3_TryBtn();
    }
    
    @Test(priority=30)
    public void test_sec3_img()
    { 
     	Section3 sec3_obj = new Section3(driver);
     	sec3_obj.verify_sec3_img();
    }  
   
    ////////////////////////////////////////////////////////// TEST SECTION-4 /////////////////////////////////////////////////////////////////////
        
	//Test Section4
	
	@Test(priority=31)
    public void test_sec4_txt()
    { 
     	Section4 sec4_obj = new Section4(driver);
     	sec4_obj.verify_sec4_txt();
    }
	
	@Test(priority=32)
    public void test_sec4_img()
    { 
     	Section4 sec4_obj = new Section4(driver);
     	sec4_obj.verify_sec4_img();
    }
	
    ////////////////////////////////////////////////////////// TEST SECTION-5 /////////////////////////////////////////////////////////////////////
        	
	//Test Section5
	
	@Test(priority=33)
    public void test_sec5_txt()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_sec5_txt();
    }
	
	@Test(priority=34)
    public void test_sec5_btn()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_sec5_btn();
    }
	
	//Test Section5 Card1
	
	@Test(priority=35)
    public void test_card1_img()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card1_img();
    }
	
	@Test(priority=36)
    public void test_card1_toggle()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card1_toggle();
    }
	
	
	@Test(priority=37)
    public void test_card1_txt()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card1_txt();
    }
    
	//Test Section5 Card2
	
	@Test(priority=38)
    public void test_card2_img()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card2_img();
    }
	
	@Test(priority=39)
    public void test_card2_toggle()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card2_toggle();
    }
	
	@Test(priority=40)
    public void test_card2_txt()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card2_txt();
    }

	//Test Section5 Card3
	
	@Test(priority=41)
    public void test_card3_img()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card3_img();
    }
	
	@Test(priority=42)
    public void test_card3_toggle()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card3_toggle();
    }
    	
	@Test(priority=43)
    public void test_card3_txt()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card3_txt();
    }
	
	//Test Section5 Card4
	
	@Test(priority=44)
    public void test_card4_Topimg()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card4_Topimg();
    }
	
	@Test(priority=45)
    public void test_card4_txt()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card4_txt();
    }
	
	@Test(priority=46)
    public void test_card4_Btmimg()
    { 
     	Section5 sec5_obj = new Section5(driver);
     	sec5_obj.verify_card4_Btmimg();
    }


////////////////////////////////////////////////////////// TEST SECTION-6 /////////////////////////////////////////////////////////////////////
        		
	//Test Section6
	
	@Test(priority=47)
	public void test_sec6_txt()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_txt();
	}
	
	//Test Section6 Card1
	
	@Test(priority=48)
	public void test_sec6_card1_img()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card1_img();
	}
	
	@Test(priority=49)
	public void test_sec6_card1_txt()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card1_txt();
	}
	
	//Test Section6 Card2
	
	@Test(priority=50)
	public void test_sec6_card2_img()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card2_img();
	}
	
	@Test(priority=51)
	public void test_sec6_card2_txt()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card2_txt();
	}
	
	//Test Section6 Card3
	
	@Test(priority=52)
	public void test_sec6_card3_sliders()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_sliders();
	}
	
	@Test(priority=53)
	public void test_sec6_card3_inputs()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_inputs();
	}
	
	
	@Test(priority=54)
	public void test_sec6_card3_txt()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_txt();
	}
	
	@Test(priority=55)
	public void test_sec6_card3_startBtn()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_startBtn();
	}
	
	@Test(priority=56)
	public void test_sec6_card3_contactBtn()
	{ 
		Section6 sec6_obj = new Section6(driver);
		sec6_obj.verify_sec6_card3_contactBtn();
	}

////////////////////////////////////////////////////////// TEST TESTIMONIALS SECTION /////////////////////////////////////////////////////////////////////
       	
	//Test Testimonials
	
	@Test(priority=57)
	public void test_testimonials_txt()
	{ 
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonials_txt();
	}
	
	//Test Testimonials Card1
	
	@Test(priority=58)
	public void test_testimonial_card1_img()
	{ 
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card1_img();
	}
	
	@Test(priority=59)
	public void test_testimonial_card1_logo()
	{ 
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card1_logo();
	}
	
	@Test(priority=60)
	public void test_testimonial_card1_txt()
	{ 
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card1_txt();
	}
	
	//Test Testimonials Card2
	
	@Test(priority=61)
	public void test_testimonial_card2_img()
	{ 
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card2_img();
	}
	
	@Test(priority=62)
	public void test_testimonial_card2_logo()
	{ 
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card2_logo();
	}
	
	@Test(priority=63)
	public void test_testimonial_card2_txt()
	{ 
		TestimonialsSection testimonial_obj = new TestimonialsSection(driver);
		testimonial_obj.verify_testimonial_card2_txt();
	}
//////////////////////////////////////////////////////////TEST SECTION-8 /////////////////////////////////////////////////////////////////////
	 	
	//Test Section8
	
	@Test(priority=64)
	public void test_sec8_txt()
	{ 
		Section8 sec8_obj = new Section8(driver);
		sec8_obj.verify_sec8_txt();
	}
	
	@Test(priority=65)
	public void test_sec8_img()
	{ 
		Section8 sec8_obj = new Section8(driver);
		sec8_obj.verify_sec8_img();
	}
	
	@Test(priority=66)
	public void test_sec8_tryBtn()
	{ 
		Section8 sec8_obj = new Section8(driver);
		sec8_obj.verify_sec8_tryBtn();
	}

////////////////////////////////////////////////////////// TEST BLOGS SECTION /////////////////////////////////////////////////////////////////////
	 	
	//Test Blogs
		
	@Test(priority=67)
	public void test_blogs_sec_title()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blogs_sec_title();
	}
	
	//Test Blog1
	
	@Test(priority=68)
	public void test_blog1_img()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog1_img();
	}
	
	@Test(priority=69)
	public void test_blog1_btn()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog1_btn();
	}
	
	@Test(priority=70)
	public void test_blog1_txt()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog1_txt();
	}
	
	//Test Blog2
	
	@Test(priority=71)
	public void test_blog2_img()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog2_img();
	}
	
	@Test(priority=72)
	public void test_blog2_btn()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog2_btn();
	}
	
	@Test(priority=73)
	public void test_blog2_txt()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog2_txt();
	}
	
	//Test Blog3
	
	@Test(priority=74)
	public void test_blog3_img()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog3_img();
	}
	
	@Test(priority=75)
	public void test_blog3_btn()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog3_btn();
	}
	
	@Test(priority=76)
	public void test_blog3_txt()
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog3_txt();
	}
	
	//Test scroller1
	
	@Test(priority=77)
	public void test_scrollable_btn1() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_scrollable_btn1();
	}
	
	//Test Blog4
	
	@Test(priority=78)
	public void test_blog4_img() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog4_img();
	}
	
	@Test(priority=79)
	public void test_blog4_btn() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog4_btn();
	}
	
	@Test(priority=80)
	public void test_blog4_txt() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog4_txt();
	}
	
	//Test Blog5
	
	@Test(priority=81)
	public void test_blog5_img() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog5_img();
	}
	
	@Test(priority=82)
	public void test_blog5_btn() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog5_btn();
	}
	
	@Test(priority=83)
	public void test_blog5_txt() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog5_txt();
	}
/*	
	//Test Blog6
	
	@Test(priority=84)
	public void test_blog6_img() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog6_img();
	}
	
	@Test(priority=85)
	public void test_blog6_btn() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog6_btn();
	}
/*	
	@Test(priority=86)
	public void test_blog6_txt() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog6_txt();
	}

	//Test Scroller2
	
	@Test(priority=87)
	public void test_scrollable_btn2() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_scrollable_btn1();
	}
	
    //Test Blog7
	
	@Test(priority=88)
	public void test_blog7_img() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog7_img();
	}
		
	@Test(priority=89)
	public void test_blog7_btn() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blog7_btn();
	}
	
	@Test(priority=90)
	public void test_blog7_txt() throws InterruptedException
	{ 
		BlogsSection sec9_obj = new BlogsSection(driver);
		sec9_obj.verify_blogs7_txt();
	}	
	
	
	//Test Footer Section1
	
	@Test(priority=91)
	public void test_footer_vdotok_icon()
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_vdotok_icon();
	}	
	
	@Test(priority=92)
	public void test_footer_descriptive_txt()
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_descriptive_txt();
	}
	
	@Test(priority=93)
	public void test_footer_copyright_txt()
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_copyright_txt();
	}
	
	
	//Test Footer Section2
	
	@Test(priority=94)
	public void test_footer_vdotok_txt()
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_vdotok_txt();
	}
	
	@Test(priority=95)
	public void test_footer_beta_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_beta_btn();
	}
	
	@Test(priority=96)
	public void test_footer_about_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_about_btn();
	}
	
	@Test(priority=97)
	public void test_footer_pricing_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_pricing_btn();
	}
	
	@Test(priority=98)
	public void test_footer_documentation_btn() throws InterruptedException
	{  
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_documentation_btn();
	}
	
	@Test(priority=99)
	public void test_footer_FAQ_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_FAQ_btn();
	}

	//Test Footer Section3
	
	@Test(priority=100)
	public void test_footer_usecases_txt() 
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_usecases_txt();
	}
	
	@Test(priority=101)
	public void test_footer_shopping_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_shopping_btn();
	}
	
	@Test(priority=102)
	public void test_footer_medtech_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_medtech_btn();
	}
	
	//Test Footer Section4
	
	@Test(priority=103)
	public void test_footer_ContactUs_txt()
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_ContactUs_txt();
	}
	
	@Test(priority=104)
	public void test_footer_email_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_email_btn();
	}
	
	@Test(priority=105)
	public void test_footer_facebook_img() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_facebook_img();
	}
	
	@Test(priority=106)
	public void test_footer_facebook_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_facebook_btn();
	}
	
	@Test(priority=107)
	public void test_footer_insta_img()
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_insta_img();
	}
*/
	@Test(priority=108)
	public void test_footer_insta_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_insta_btn();
	}
	
	@Test(priority=109)
	public void test_footer_linkedIn_img()
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_linkedIn_img();
	}
	
	@Test(priority=110)
	public void test_footer_linkedIn_btn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_linkedIn_btn();
	}
	
	//Test Back to Top
	
	@Test(priority=111)
	public void test_footer_backToTop_imgBtn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_backToTop_imgBtn();
	}
	
	@Test(priority=112)
	public void test_footer_backToTop_txtBtn() throws InterruptedException
	{ 
		FooterSection sec10_obj = new FooterSection(driver);
		sec10_obj.verify_footer_backToTop_txtBtn();
	}
	
    @AfterMethod
    public void close()
    {
        driver.quit();
    }
  
   
       		
}
