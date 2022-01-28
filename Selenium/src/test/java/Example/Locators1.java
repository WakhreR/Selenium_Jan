package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators1 {
	@Test(enabled=false)
	public void edit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/");
		d1.findElement(By.linkText("Edit")).click();
		d1.findElement(By.id("email")).sendKeys("karun@gmail.com");
		WebElement App = d1.findElement(By.cssSelector("input[value='Append ']"));
		App.clear();
		App.sendKeys("HCL");
		WebElement TE = d1.findElement(By.name("username"));
		TE.clear();
		TE.sendKeys("Good");
		WebElement text = d1.findElement(By.cssSelector("input[value='Clear me!!']"));
		text.clear();
		text.sendKeys("Automation");
}
	@Test(enabled=false)
	public void Button() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/");
		d1.findElement(By.linkText("Button")).click();	
		d1.findElement(By.id("home")).click();
	}
	
	@Test(enabled=false)
	public void Hyperlink() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/");
		d1.findElement(By.xpath("//h5[.='HyperLink']")).click();
		d1.findElement(By.partialLinkText("Find where am ")).click();
		Navigation nav = d1.navigate();
		nav.back();
		d1.findElement(By.linkText("Verify am I broken?")).click();
		nav.back();
		d1.findElement(By.partialLinkText("Go to")).click();
		}
	
	@Test(enabled=false)
	public void image() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/");
		d1.findElement(By.linkText("Image")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img")).click();
		}
		
	@Test(enabled=false)
	public void RadioButton() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/");
		d1.findElement(By.linkText("Radio Button")).click();
		d1.findElement(By.id("yes")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]")).click();
	}
	
	@Test
	public void checkbox() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/");
		d1.findElement(By.linkText("Checkbox")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input")).click();
		
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input")).click();
		
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click();
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
		
	}
	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}