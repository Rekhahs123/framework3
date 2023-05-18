package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptForFileUpload1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromeriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/Parna/Desktop/file.html");
		  Thread.sleep(2000);
		  WebElement ele = driver.findElement(By.id("upload"));
		  ele.sendKeys("C:\\Users\\Parna\\Downloads\\20230104-gagana-project_gagana-Shiva.xlsx");
		  
	}

}
