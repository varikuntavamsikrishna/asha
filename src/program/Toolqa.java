package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Toolqa {
public WebDriver driver;
  
public void openurl() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
	driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/automation-practice-form");
	
}

public void practicefrom() {
	driver.findElement(By.id("firstName")).sendKeys("vihaan");
	driver.findElement(By.id("lastName")).sendKeys("penumetsa");
	driver.findElement(By.id("userEmail")).sendKeys("prudhvi.cse7@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")).click();
	driver.findElement(By.id("userNumber")).sendKeys("9573334455");
	driver.findElement(By.id("dateOfBirthInput")).sendKeys("27feb2019");
	driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("english");
	driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
	driver.findElement(By.id("uploadPicture")).click();
	driver.findElement(By.id("currentAddress")).sendKeys("bhimavaram");
	driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"stateCity-wrapper\"]/div[3]")).click();
	driver.findElement(By.id("submit")).click();
}
	public static void main(String[] args) {
		Toolqa r = new Toolqa();
		r.openurl();
		r.practicefrom();

	}

}