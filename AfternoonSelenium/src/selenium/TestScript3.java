package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("");
		Thread.sleep(2000);
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		  for(WebElement ele :links)
		  {
			  System.out.println(ele.getText());
		  }
	

	}

	}


