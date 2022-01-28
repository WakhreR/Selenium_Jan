package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {
	@Test
	public void test1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/");
	d1.findElement(By.xpath("//h5[.='Edit']")).click();
	Actions act = new Actions(d1);
	WebElement E1 = d1.findElement(By.id("email"));
	act.sendKeys(E1, "karuna12@gamil.com");
	
	act.doubleClick().build().perform();
	
	d1.navigate().refresh();
	 
	act.contextClick().build().perform();
	
	
	
	
	
	
	
	
	
	}

}
