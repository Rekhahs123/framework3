package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScriptDragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("http://www.dhtmlgoodies.com/script/drag-drop-custom/demo-drag-drop-b=3.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.id("box3"));
		WebElement dst = driver.findElement(By.id("box103"));

		Thread.sleep(2000);
          Actions a = new   Actions(driver);
          a.dragAndDrop(src,dst).perform();

	}

}
