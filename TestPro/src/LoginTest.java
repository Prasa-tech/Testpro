package tests;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

import base.BaseTest;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class LoginTest extends BaseTest{
	
	


	  public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).press("Enter");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("PIM")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Recruitment")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Info")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dashboard")).click();
	    }
	  }
	

}
