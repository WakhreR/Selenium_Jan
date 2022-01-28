package Example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class downloadPDF {
	@Test
	public void PDF() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/download.html");
		d1.findElement(By.linkText("Download PDF")).click();
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_S);
		rt.keyRelease(KeyEvent.VK_S);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		d1.switchTo().alert().accept();		
		
		
		File fileLocation = new File("C:\\Users\\wakhre.ritukishor\\Downloads");
		File[] total_Fi = fileLocation.listFiles();
		
		for(File file:total_Fi) {
			
			
			if(file.getName().equals("testleaf")) {
				
				System.out.println("File Downloaded");
				break;
			}
		}
		
		
	}

}
