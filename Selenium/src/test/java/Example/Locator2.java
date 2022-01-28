package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Locator2 {
	@Test(enabled=false)
	public void Dropdown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/Dropdown.html");
		Select drop1=new Select(d1.findElement(By.id("dropdown1")));
		drop1.selectByVisibleText("Loadrunner");
		Thread.sleep(3000);
		Select drop2=new Select(d1.findElement(By.name("dropdown2")));
		drop2.selectByIndex(2);
		Thread.sleep(3000);
		Select drop3=new Select(d1.findElement(By.id("dropdown3")));
		drop3.selectByValue("3");	
		
		Select drop4=new Select(d1.findElement(By.className("dropdown")));
		boolean msg = drop4.isMultiple();	
		System.out.println(msg);
		
		Select drop6=new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
		boolean Na = drop6.isMultiple();
		System.out.println(Na);
	}
	
	
	
	@Test(enabled=false)
	public void Popup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Alerts.html");
		d1.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		String msg1 = d1.switchTo().alert().getText();
		System.out.println(msg1);
		d1.switchTo().alert().accept();
	
	    d1.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
	    d1.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	    d1.switchTo().alert().dismiss();
	   
	    
	    d1.findElement(By.xpath("//a[.='Alert with Textbox ']")).click();
	    d1.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	    d1.switchTo().alert().sendKeys("Selenium");
	    d1.switchTo().alert().accept();
	    
	}
		
		
		@Test
		public void frame() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d1;
			d1=new ChromeDriver();
			d1.get("http://demo.automationtesting.in/Frames.html");
			d1.switchTo().frame(0);
			WebElement text = d1.findElement(By.xpath("/html/body/section/div/div/div/input"));
			text.sendKeys("HCL");
			d1.switchTo().defaultContent();
            d1.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();
			
			WebElement E2 = d1.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			d1.switchTo().frame(E2);
			WebElement E3 = d1.findElement(By.xpath("/html/body/section/div/div/iframe"));
			d1.switchTo().frame(E3);
	        WebElement E4 = d1.findElement(By.xpath("/html/body/section/div/div/div/input"));
	        E4.click();
		    E4.sendKeys("Selenium");
			
		}
		
		
		
		
		
		
		
	

}
