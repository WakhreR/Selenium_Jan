package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandelTheTableByUsingBasicCommands {
	@Test
	public void Table() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver d1;
	     d1=new ChromeDriver();  
	     d1.get("http://www.leafground.com/pages/table.html");
	     String value= d1.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[4]")).getText();
	     System.out.println(value);
	     System.out.println(d1.getTitle());
	     System.out.println(d1.getCurrentUrl());
	     System.out.println(d1.getPageSource());
	     Thread.sleep(3000);
	     d1.navigate().back();
	     Thread.sleep(3000);
	     d1.navigate().to("http://www.leafground.com/");
	     Thread.sleep(3000);
	     d1.navigate().back();
	     d1.navigate().forward();
	     d1.navigate().refresh();
	     
	     d1.manage().window().maximize();
	     
         Dimension DIA = new Dimension(200,400);	     
	     d1.manage().window().setSize(DIA);
	     
	     
	}

}