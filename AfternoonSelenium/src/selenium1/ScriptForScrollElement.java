package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForScrollElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);	
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[.='About Us']"));
		Point loc = ele.getLocation();
		System.out.println(loc);
		int x=loc.getX();
		int y = loc.getY();
		jsc.executeScript("window.scrollBy("+x+","+y+")");
		}

}


