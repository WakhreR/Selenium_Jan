package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testing() throws IOException {
		WebDriver d1;

		FileInputStream st=new FileInputStream("src\\test\\java\\example\\Config.properties");		
		Properties prop=new Properties();
		prop.load(st);
		String browserName = prop.getProperty("browser");
		String driverPath = prop.getProperty("path");


		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath);
			d1=new ChromeDriver();
		}

		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverPath);
			d1=new FirefoxDriver();
		}


		else {
			System.setProperty("webdriver.ie.driver", driverPath);
		d1=new InternetExplorerDriver();
		}
		
		d1.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB014S6TV0Q%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		d1.findElement(By.id("ap_customer_name")).sendKeys("karuna");
		d1.findElement(By.name("email")).sendKeys("karun@gamil.com");
		d1.findElement(By.id("ap_password")).sendKeys("kar123");
		d1.findElement(By.id("ap_password_check")).sendKeys("kar123");
		d1.findElement(By.id("continue")).click();
		
	}

}


