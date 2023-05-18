package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScriptForAmazon1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 driver.navigate().to("https://www.amazon.in/");
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Redmi note9 mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			driver.findElement(By.xpath
				("//span[.='(Renewed) Redmi Note 9 (Aqua Green, 4GB RAM, 128GB Storage) - 48MP Quad Camera & Full HD+ Display']")).click();
			 TakesScreenshot tss = (TakesScreenshot)driver;
			    File src = tss.getScreenshotAs(OutputType.FILE);
			    File dst = new File("./screenshot/a3.png");
			    FileHandler.copy(src, dst);
	}

}
