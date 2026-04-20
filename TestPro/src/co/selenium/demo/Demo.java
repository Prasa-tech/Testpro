package co.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;




public class Demo {
     public static void main(String[] args) {
	
	
	System.out.println("Hello Java Engineers!!!");
	
	//System.setProperty("webdriver.chrome.driver" ,"C:\\ogg\\download\\chromedriver_win64\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.gmail.com/");

	driver.manage().window().maximize();
	driver.findElement(By.id("identifierId")).sendKeys("prasanti.bisi@gmail.com");
	

	//Thread.sleep(3000);
	driver.findElement(By.className("A77ntc")).click();
	
	
	try {
	    Thread.sleep(3000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	    // handle the exception...        
	    // For example consider calling Thread.currentThread().interrupt(); here.
	}
	//Thread.sleep(1000);
	String title = driver.getTitle();
	String et = "gmail";
	System.out.println ("Title is: "+title);
	driver.close();
	

if (title.equalsIgnoreCase(et))
{ 
	System.out.println("Test Successful");
}

else
{
	System.out.println("Test Fail");
}

	
}
}
