package page.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.Test;

import browsers.browser_setup;
import page.Objects.DocsToolsSection;

public class TestDocsToolsSection extends browser_setup  {

	////////////////////////////////////////////////////////// TEST HEADER SECTION ////////////////////////////////////////////////////////// //////////////////////////////////////////////////////////////
    
	//verify logo
	
	@Test(priority = 1)
	public void test_vdotok_logo() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_vdotok_logo();
	}
	
	//verify title
	
	@Test(priority = 2)
	public void test_page_title() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_page_title();
	}
	
	//verify card1
	
	@Test(priority = 3)
	public void test_card1_txt() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_card1_txt();
	}
	
	@Test(priority = 4)
	public void test_card1_button() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_card1_button();
	}
	
	//verify card2 
	
	@Test(priority = 5)
	public void test_card2_txt() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_card2_txt();
	}
	
	@Test(priority = 6)
	public void test_card2_button() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_card2_button();
	}
	
	//verify card3
	
	@Test(priority = 7)
	public void test_card3_txt() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_card3_txt();
	}
	
	@Test(priority = 8)
	public void test_card3_button() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_card3_button();
	}
	
	//verify bottom card1
	
	@Test(priority = 9)
	public void test_bottom_card1_txt() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card1_txt();
	}
	
	@Test(priority = 10)
	public void test_bottom_card1_option1() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card1_option1();
	}
	
	@Test(priority = 11)
	public void test_bottom_card1_option2() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card1_option2();
	}
	
	@Test(priority = 12)
	public void test_bottom_card1_option3() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card1_option3();
	}
	
	@Test(priority = 13)
	public void test_bottom_card1_option4() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card1_option4();
	}
	
	@Test(priority = 14)
	public void test_bottom_card1_seeAll() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card1_seeAll();
	}
	
	//verify bottom card2
	
	@Test(priority = 15)
	public void test_bottom_card2_txt() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card2_txt();
	}
	
	@Test(priority = 16)
	public void test_bottom_card2_option1() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card2_option1();
	}
	
	@Test(priority = 17)
	public void test_bottom_card2_option2() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card2_option2();
	}
	
	@Test(priority = 18)
	public void test_bottom_card2_option3() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card2_option3();
	}
	
	@Test(priority = 19)
	public void test_bottom_card2_option4() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card2_option4();
	}
	
	@Test(priority = 20)
	public void test_bottom_card2_seeAll() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card2_seeAll();
	}
	
	//verify bottom card3
	
	@Test(priority = 21)
	public void test_bottom_card3_txt() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card3_txt();
	}
	
	@Test(priority = 22)
	public void test_bottom_card3_option1() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card3_option1();
	}
	
	@Test(priority = 23)
	public void test_bottom_card3_option2() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card3_option2();
	}
	
	@Test(priority = 24)
	public void test_bottom_card3_option3() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card3_option3();
	}
	
	@Test(priority = 25)
	public void test_bottom_card3_option4() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card3_option4();
	}
	
	@Test(priority = 26)
	public void test_bottom_card3_seeAll() {
		DocsToolsSection docs_obj = new DocsToolsSection(driver);
		docs_obj.verify_bottom_card3_seeAll();
	}
	
}