package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScriptForYouTube {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf");
         WebElement ele = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	                   Actions a = new Actions(driver);
	                   a.doubleClick(ele).perform();
	    driver.findElement(By.xpath(("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"))).click();
	    TakesScreenshot tss = (TakesScreenshot)driver;
	    File src = tss.getScreenshotAs(OutputType.FILE);
	    File dst = new File("./screenshot/a1.png");
	    FileHandler.copy(src, dst);
	    
	}
	
}