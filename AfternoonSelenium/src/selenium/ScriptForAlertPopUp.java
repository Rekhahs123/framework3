package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		  driver.get("https://demo.guru99.com/test/delete_customer.php");
		  Thread.sleep(2000);
		  driver.findElement(By.name("cusid")).sendKeys("admin");
		  Thread.sleep(2000);
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(2000);
		 Alert a= driver.switchTo().alert();
		 a.accept();
		  

	}

}
