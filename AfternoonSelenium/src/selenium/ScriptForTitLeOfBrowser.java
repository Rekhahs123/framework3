package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForTitLeOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> all_id = driver.getWindowHandles();
		for (String id : all_id) 
		{
			Thread.sleep(2000);
			driver.switchTo().window(id);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
		 
		
	}

}
