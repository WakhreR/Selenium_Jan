package example;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test2 {
	@Test
	public void Datadriven() throws BiffException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		Workbook W1 = Workbook.getWorkbook(new File("C:\\Users\\wakhre.ritukishor\\OneDrive - HCL Technologies Ltd\\Documents\\data1.xls"));
		Sheet s1 = W1.getSheet(0);
		d1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		for(int i=1;i<s1.getRows();i++) {

			d1.get("https://m.ksrtc.in/oprs-mobile/login/show.do?uid=null&OS=null");
			String us = s1.getCell(0,i).getContents();
			String pass = s1.getCell(1,i).getContents();
			d1.findElement(By.id("userName")).sendKeys(us);
			d1.findElement(By.id("password")).sendKeys(pass);
			d1.findElement(By.name ("submitBtn")).click();
			
			
		    
		}




	}

}
