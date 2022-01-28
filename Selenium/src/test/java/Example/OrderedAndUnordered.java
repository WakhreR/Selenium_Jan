package Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrderedAndUnordered {
	@Test
	public void OrderedList() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Selectable.html");
		List<WebElement> Element = d1.findElements(By.xpath("//div[@id='Default']/ul/li"));
		System.out.println(Element.size());
		
	}
	
	
	@Test
	public void UnOrderedList() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/AutoComplete.html");
		d1.findElement(By.id("searchbox")).sendKeys("IND");
		Thread.sleep(3000);
		
		List<WebElement> E1 = d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		for(WebElement el:E1) {
			if(el.getText().endsWith("India")) {
				el.click();
				break;
			}
		}
	
		
		
		
	}
	
}
