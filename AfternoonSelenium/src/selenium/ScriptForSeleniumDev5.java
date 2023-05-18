package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScriptForSeleniumDev5 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.selenium.dev");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[.='Blog']"));
	Actions a = new Actions(driver);
	a.contextClick(ele).perform();
	Thread.sleep(2000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(2000);
	Set<String> all_id = driver.getWindowHandles();
	int size = all_id.size();
	System.out.println(size);
	for(String id :all_id)
	{
	System.out.println(id);
	}

	}

}
