package Asha;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Google {
	
	public WebDriver driver;

	
  @Test
  public void f() {
	  
	  
	  
  }
  
  
  @BeforeTest
  public void Openurl() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Asha\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }

  @AfterTest
  public void afterTest() {
  }





}
