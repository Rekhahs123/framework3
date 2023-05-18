package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownScript 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	 driver.get("file:///C:/Users/Parna/Desktop/dropdown.html");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//select[@id='hotel']"));
	Select s=new Select(ele);
	List<WebElement> allopt=s.getOptions();
	for(WebElement opt:allopt)
	{
		String text = opt.getText();
		System.out.println(text);
	}
	
	
	
}
}
