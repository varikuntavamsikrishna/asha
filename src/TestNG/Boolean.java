package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Boolean {
	
	public WebDriver driver;
  @Test
  public void Options() {
	  driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home-container/div/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]")).click();
	  
	  boolean printcondition = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home-container/div/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]")).isDisplayed();
	  
	  System.out.println(printcondition);
	
	  WebElement element =  driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home-container/div/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]"));
	  
	  if(element.isEnabled())
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
  
  
  
  
  }
  
  
	  
  @BeforeTest
  public void Openurl() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("https://www.savaari.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
