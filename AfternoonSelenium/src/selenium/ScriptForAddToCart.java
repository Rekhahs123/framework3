package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScriptForAddToCart {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Redmi note9 mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			driver.findElement(By.xpath
				("//span[.='(Renewed) Redmi Note 9 (Aqua Green, 4GB RAM, 128GB Storage) - 48MP Quad Camera & Full HD+ Display']")).click();
			 TakesScreenshot tss = (TakesScreenshot)driver;
			    File src = tss.getScreenshotAs(OutputType.FILE);
			    File dst = new File("./screenshot/a3.png");
			    FileHandler.copy(src, dst);
			    

	}
	
	

}
