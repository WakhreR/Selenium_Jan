package Example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class deleteAllCookie {

	@Test
	public void detAllCookies() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		d1.findElement(By.name("username")).sendKeys("Ritu");
		d1.findElement(By.name("password")).sendKeys("ritu123");
		d1.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		
		
		File f1=new File("C:\\Users\\wakhre.ritukishor\\OneDrive - HCL Technologies Ltd\\Desktop\\reports\\cookies.data");
		
		try {
			
		f1.createNewFile();
		
		FileWriter fw=new FileWriter(f1);
		
		BufferedWriter bf=new BufferedWriter(fw);
		

		Cookie ck1 = new Cookie("cookie1","123@c");
		d1.manage().addCookie(ck1);
		
		Cookie ck2 = new Cookie("cookie2","456@c");
		d1.manage().addCookie(ck2);
		
		d1.manage().deleteAllCookies();
		
		for(Cookie ck:d1.manage().getCookies()) {
			
			bf.write(ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getDomain());
			bf.newLine();
		}
		bf.close();
		fw.close();
		
		
			
		}
		
		catch(Exception e) {
      System.out.println(e);
	}
	
}
}

