package selenium;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/Parna/Desktop/dropdown.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s=new Select(ele);
		List<WebElement> allopt =s.getOptions();
		TreeSet<String> t=new TreeSet<String>(Collections.reverseOrder());
		for(WebElement opt:allopt)
		{
			t.add(opt.getText());
		}
		for(String o : t)
		{
			System.out.println(o);
		}
	}

}
