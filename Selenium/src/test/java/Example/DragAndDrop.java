package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
      @Test
	public void a1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
        d1=new ChromeDriver();  
		d1.get("http://www.leafground.com/pages/drag.html");
		WebElement drag = d1.findElement(By.id("draggable"));
		Actions act = new Actions(d1);
		act.dragAndDropBy(drag, 500, 50).build().perform();
      }
      
      @Test
      public void a2() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
      	WebDriver d1;
        d1=new ChromeDriver();  
  		d1.get("http://www.leafground.com/pages/drop.html"); 
  		Actions act1 = new Actions(d1);
  		WebElement source = d1.findElement(By.id("draggable"));
  		WebElement dest = d1.findElement(By.id("droppable"));
  		act1.dragAndDrop(source, dest).build().perform();
    	  
    	  
      }
      
      
   }
	
		
		
		
		
		
	