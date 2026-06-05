package tests;


import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest{
	
	
@Test

	  public void test() {
	LoginPage loginpage = new LoginPage (page);
	HomePage  homepage = new HomePage (page);
	
	page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	loginpage.addUsername ("Admin");
	loginpage.addPassword ("admin123");
	loginpage.clickLoginButton();
	homepage.clickTimeLink();
	
	   System.out.println("Page opened successgully...!");
	    }
	  }
	


