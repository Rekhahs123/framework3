package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Parna/Desktop/rc6.html");
		Thread.sleep(2000);
		  List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
		  for(WebElement ele :checkbox)
		  {
			  ele.click();
		  }
		  for(int i=checkbox.size()-1;i>=0;i--)
		  {
			  WebElement ele = checkbox.get(i);
		
			  ele.click();
		  }
			  
		
	}
}
