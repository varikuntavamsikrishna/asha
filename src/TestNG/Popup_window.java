package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Popup_window {
	
	public WebDriver driver;
	
	
  @Test
  public void windowpopup() throws Exception {
	  
	
	  
	  //Clicks on Seperate windows
	  driver.findElement(By.xpath("//a[@href='#Seperate'][contains(.,'Open New Seperate Windows')]")).click();
	  Thread.sleep(3000);  
	  
	  //Click_button
	  driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(.,'click')]")).click();
	  
	//comeback to Parent window handle
	  String moveto_parentwindow = driver.getWindowHandle();
	  
	  //Child window handle
	  for(String child_win_handle : driver.getWindowHandles()) {
		  
		  driver.switchTo().window(child_win_handle);
		  
	  }
	  
	
     //Clicks on Blog_Button
	driver.findElement(By.linkText("Blog")).click();
	  
	  
	  driver.close();
	  Thread.sleep(3000);
	  
	  //Again Switch focus back to Parent window
	  driver.switchTo().window(moveto_parentwindow);
	  Thread.sleep(3000);
	  
	  
	  //Clicks on Home_Button
		driver.findElement(By.linkText("Home")).click();

  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Asha\\chromedriver.exe\\"); 
	  
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
  }

  
  @AfterTest
  public void afterTest() {
	  
	  
  }

}