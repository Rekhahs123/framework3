package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForScrollBar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);	
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		driver.get("file:///C:/Users/Parna/Desktop/disabled.html");
		Thread.sleep(2000);	
		jsc.executeScript("document.getElementById(''a1),value='50'");
		
		
		
	}

	
}
