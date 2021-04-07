package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmail {
	public WebDriver driver;
		
	
	public void openurl() {
		
		driver.get("http://gmail.com");
	}
	
	public void login() {
		driver.findElement(By.id("identifierid")).sendKeys("prudhvi.cse7@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("9676667788");
		driver.findElement(By.xpath("//*[@id=\\\"identifierNext\\\"]/div/button/div[2]")).click();
		
				
		
	}
	
	public void composemail() {
		driver.findElement(By.xpath("//*[@id=\":l0\"]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\":xg\"]")).sendKeys("ashajyothi.varma@gmail.com");
		driver.findElement(By.xpath("//*[@id=\":wy\"]")).sendKeys("resume");
		driver.findElement(By.xpath("//*[@id=\":y3\"]")).sendKeys("new resume");
		
	}
	
	public void logout() {
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
