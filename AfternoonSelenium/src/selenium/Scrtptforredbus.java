package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Scrtptforredbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[.='BUS TICKETS']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='txtSource']")).sendKeys("mangalur");
	     
	     
	     
		
		 

	}

}
