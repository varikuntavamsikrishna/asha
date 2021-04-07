package TestNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Demotest {
	public WebDriver driver;
	
	@Test
	  public void createnewaccount() {
			driver.findElement(By.name("firstname")).sendKeys("vihaan");
			driver.findElement(By.name("lastname")).sendKeys("penumetsa");
			driver.findElement(By.name("reg_email__")).sendKeys("9573334455");
			driver.findElement(By.id("password_step_input")).sendKeys("9573334455");
			
			new Select(driver.findElement(By.id("day"))).selectByVisibleText("18");
			new Select(driver.findElement(By.id("month"))).selectByVisibleText("march");
			new Select(driver.findElement(By.id("year"))).selectByVisibleText("2021");
			
			driver.findElement(By.xpath("//label[contains(.,'Female')]")).click();
	        //driver.findElement(By.xpath("//*[@id=\"u_0_z_3D\"]/span[2]/label")).click();
			driver.findElement(By.name("websubmit")).click();
			
			 }

	
	
	@Test
  public void login() {
		driver.findElement(By.id("email")).sendKeys("ashajyothi.varma@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asha@$#@");
		driver.findElement(By.id("pass")).click();
		
		
	}
	
	@BeforeTest
  public void openurl() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
		
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }


}
