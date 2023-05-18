package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;

public class ScriptForGoogleMap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps/@21.125498,81.914063,5z");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 WebElement el=driver.findElement(By.xpath("//button[@id='hArJGc']"));
		 el.click();
		 Thread.sleep(1000);
	   WebElement ele1 = driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']"));
	   ele1.sendKeys("bangalore");
	    	
	    		Thread.sleep(2000);
	     WebElement ele2 = driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']"));
	    		 ele2.sendKeys("hassan");
	    ele2.sendKeys(Keys.ENTER);
	          Thread.sleep(1000);
	    		 WebElement ele3 = driver.findElement(By.xpath("//span[@jstcache='1229']"));
	    		 Thread.sleep(1000);
	    		 System.out.println(ele3.getText());
	   
	    	
	    		
		
    	}

}