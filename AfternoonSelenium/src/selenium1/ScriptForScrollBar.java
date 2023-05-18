package selenium1;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForScrollBar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);	
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);	
		for(int i=1;i<=8;i++)
		{
			jsc.executeScript("window.scrollBy(0.500)");
			Thread.sleep(2000);	
		}
		for(int i=1;i<=3;i++)
		{
			jsc.executeScript("Window.scrollBy(0.500)");
			Thread.sleep(2000);	
		}
	
		
	}

}
