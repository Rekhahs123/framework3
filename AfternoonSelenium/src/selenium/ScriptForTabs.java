package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScriptForTabs {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//a[.='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//a[.='Documentations']"));
		WebElement ele3 = driver.findElement(By.xpath("//a[.='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//a[.='Supports']"));
		//store the ele in collection
		ArrayList<WebElement> l = new ArrayList<WebElement>();
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		//perform right click action
		Actions a = new Actions(driver);
		//to perform keyboard action
		Robot r = new Robot();
		
		for(WebElement ele:l)
		{
			a.contextClick(ele).perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}

       
        
        
        
        

}
}
