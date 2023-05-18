package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class ScriptSelectMulti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		  driver.get("http://www.uitestpractice.com/Students/Actions");
		  Thread.sleep(2000);
           Actions a = new Actions(driver);
           a.keyDown(Keys.CONTROL);
           a.click(driver.findElement(By.name("one")));
           a.click(driver.findElement(By.name("two")));
           a.click(driver.findElement(By.name("three")));
           a.keyUp(Keys.CONTROL).perform();
           Thread.sleep(2000);
           driver.quit();
           

	}

	
}
