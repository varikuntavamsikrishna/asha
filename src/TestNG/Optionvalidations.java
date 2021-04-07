package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Optionvalidations {
	
	public WebDriver driver;
  @Test
  public void Options() {
	  
	 // List<WebElement> allvalues = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions();
	 List <WebElement> allvalues = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions();
	  System.out.println(allvalues.get(3).getText());
	  
	  for (int i=0; i<allvalues.size(); i++)
		  
	  System.out.println(allvalues.get(3).getText());
	  
	  if(allvalues.get(3).getText().contains("USD"))
	  {
		  System.out.println(allvalues.get(3).getText());
		  
		  System.out.println("pass");
		   }
	  /*
	   * else{
	   * System.out.println("Validation fail");
	   * }
	   */
	  
	  
  }
  @BeforeTest
  public void Openurl() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
	  driver =new ChromeDriver();
		driver.get("http:/spicejet.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

  
}
