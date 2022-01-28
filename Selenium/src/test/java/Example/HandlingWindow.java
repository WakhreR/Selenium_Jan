package Example;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWindow {
	@Test
	public void window() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://demo.automationtesting.in/Windows.html");
	String t1 = d1.getTitle();
    d1.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
    Set<String> W1 = d1.getWindowHandles();
    Iterator<String> iter= W1.iterator();
    String win = iter.next();
    String win1 = iter.next();
    String W2 = d1.getTitle();
    System.out.println("W1");
    System.out.println("W2");
    
    
    System.out.println("win");
    System.out.println("win1");
}

}