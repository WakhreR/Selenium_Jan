package example;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class ImplicitwaitAndExplicitlwait {

		@Test
		public void Time1() throws BiffException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d1;
			d1=new ChromeDriver();
			//d1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			
			d1.get("https://m.ksrtc.in/oprs-mobile/login/show.do?uid=null&OS=null");
          
			WebDriverWait ww=new WebDriverWait(d1,20);
			ww.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
			
			d1.findElement(By.id("userName")).sendKeys("ritu");
			
            d1.findElement(By.name("password")).sendKeys("khade");
            d1.findElement(By.id("submitBtn")).click();
            
            
            
}
}