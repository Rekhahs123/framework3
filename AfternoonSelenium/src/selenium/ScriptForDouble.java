package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScriptForDouble {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		  driver.get("https://demo.guru99.com/test/simple-context-menu.html");
		  WebElement ele = driver.findElement(By.xpath("//button[.='Double Click Me To See Alert']"));
          Thread.sleep(2000);
          Actions a = new   Actions(driver);
          a.doubleClick(ele).perform();

	}

	
}
