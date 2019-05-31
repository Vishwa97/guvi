package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowserOnDependency {
	WebDriver driver; 
	
  @Test()
  public void openBrowser() 
  {
	  try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishwanathan.M\\Downloads\\My Projects\\New folder\\eclipse-jee-2019-03-R-win32-x86_64\\SeleniumWebTest\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.gmail.com/");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
}
