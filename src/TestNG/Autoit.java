package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Autoit {
	
	//Auto it
	
	public WebDriver driver;
	
  @Test
  public void choosefile() throws Exception {
	  
	
	//Click function AutoIt concept
	  WebElement ele = driver.findElement(By.id("myFile")); 
	  ele.click();

	 Runtime.getRuntime().exec("C:\\Users\\SSIM STUDENT\\Desktop\\bbbb.exe"); 

  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }

  
  @AfterTest
  public void afterTest() {
	  
	  
  }
}