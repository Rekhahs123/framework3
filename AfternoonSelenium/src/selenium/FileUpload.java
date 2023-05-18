package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/Parna/Desktop/file.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("upload"));
		ele.sendKeys("C:\\Users\\Parna\\Downloads\\project.pdf");


	}

}
