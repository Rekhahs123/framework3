package selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ScriptForDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		  driver.get("file:///C:/Users/Parna/Desktop/dropdown1.html");
		  Thread.sleep(2000);
		  WebElement ele = driver.findElement(By.xpath("//select"));
		  Select s = new Select(ele);
		  List<WebElement> alopt = s.getOptions();
		  Actions a = new Actions(driver);
		  a.keyDown(Keys.CONTROL);
		  for (WebElement opt : alopt)
		  {
			opt.click();
			 Thread.sleep(2000);
		  }
			a.keyUp(Keys.CONTROL).perform();
			{
			System.out.println(s.getOptions().get(2).getText());
		  }
		  
		  
		 
		  
		 
		  
	}
		  
}
