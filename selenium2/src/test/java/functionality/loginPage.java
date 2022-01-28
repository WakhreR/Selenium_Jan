package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import object_repository.Elements;

public class loginPage {
	@Test
	public void login_fn() throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();

		d1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		d1.get("https://login.microsoftonline.com/189de737-c93a-4f5a-8b68-6f4ca9941912/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252fbprhome%252fDefault.aspx&wct=2022-01-13T11%3a57%3a36Z&wreply=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx");



		Elements.userID(d1).sendKeys("wakhre.ritukishor@hcl.com");

		Elements.NextBtn(d1).click();

		Elements.password(d1).sendKeys("Automation@2802");

		Elements.LoginBtn(d1).click();

		Elements.Yes(d1).click();

		Elements.search_box(d1).sendKeys("iTime");
		
		d1.manage().window().maximize();

		Thread.sleep(3000);

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_SHIFT);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_SHIFT);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		Elements.activity(d1).click();

		Elements.dropdown1(d1).click();

		Thread.sleep(5000);
		
		Elements.internalAudit(d1).click();
		
		Thread.sleep(3000);
		
		Elements.meeting(d1).click();
		
		Elements.save_procedure(d1).click();
		
		Thread.sleep(3000);
		
		Elements.enter_time(d1).sendKeys("09:00");

		Elements.saveBtn(d1).click();
		
	    Robot robot1=new Robot();
		Dimension sc=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(sc);
		BufferedImage Source=robot1.createScreenCapture(rect);
		File dest=new File("C:\\Users\\wakhre.ritukishor\\OneDrive - HCL Technologies Ltd\\Desktop\\reports\\screenshot1.jpg");
		ImageIO.write(Source, "jpg", dest);


		
	}	

	

}
