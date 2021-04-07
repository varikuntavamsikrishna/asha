package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert {
	
	public WebDriver driver;
	
	
	
	 @Test
	  public void Alerttype() throws Exception{
		  driver.findElement(By.id("promtButton")).click();
		  Thread.sleep(3000);
		  
		  driver.switchTo().alert().accept();
		 // driver.switchTo().alert().dismiss();
		  
		  
	  }
  
  
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  
  
  
  }

  @AfterTest
  public void afterTest() {
  
  }

  
 }
