package Example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadPDF {
	
	@Test
	public void PDF1() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("https://www.ilovepdf.com/pdf_to_word");
		d1.findElement(By.xpath("//span[.='Select PDF file']")).click();
		Thread.sleep(3000);
		
		String file_upload = "C:\\Users\\wakhre.ritukishor\\Downloads\\testleaf.pdf";
		StringSelection sel=new StringSelection(file_upload);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
        rob.keyRelease(KeyEvent.VK_CONTROL);
        rob.keyRelease(KeyEvent.VK_V);
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        
        d1.findElement(By.xpath("//span[.='Convert to WORD']")).click();
      
      
   
        
        
        
        
}
}