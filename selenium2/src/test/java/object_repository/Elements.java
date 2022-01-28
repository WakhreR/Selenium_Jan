package object_repository;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Elements {
	
	public static WebElement userID(WebDriver d1) {
	return	d1.findElement(By.id("i0116"));
		
	}
	
	public static WebElement NextBtn(WebDriver d1) {
		return d1.findElement(By.xpath("//input[@value='Next']"));
	}
	
	public static WebElement password(WebDriver d1) {
		return	d1.findElement(By.name("passwd"));
	}
	
	public static WebElement LoginBtn(WebDriver d1) {
		return d1.findElement(By.xpath("//input[@value='Sign in']"));
	}
	
	
	public static WebElement Yes(WebDriver d1) {
		return d1.findElement(By.xpath("//input[@value='Yes']"));
	}
	
	public static WebElement search_box(WebDriver d1) {
		return d1.findElement(By.id("txtSearch"));
	}
	
	
	public static WebElement activity(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"WeeklyData\"]/div/div[1]/div/div/div[1]/button"));
	}
	
	
	
	
	
	
	
	public static  WebElement  dropdown1(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"phaseActivity\"]/div[2]/div/div[1]/div[1]/div/div[2]/div/select/option[2]"));
	}
	
	public static WebElement internalAudit(WebDriver d1) {
	 
   return d1.findElement(By.xpath("//*[@id=\"mCSB_6_container\"]/div/div[1]"));
    
	}
	
	
	public static WebElement meeting(WebDriver d1) {
	return	d1.findElement(By.xpath("//*[@id=\"mCSB_7_container\"]/div/div/ul/li[1]/span[1]/a"));
	}
	
	public static WebElement save_procedure(WebDriver d1) {
	return	d1.findElement(By.xpath("//button[.='Save And Proceed To Time Entry']"));
	}
	
	public static WebElement enter_time(WebDriver d1) {
		return	d1.findElement(By.xpath("//*[@id=\"mCSB_5_container\"]/span[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div/input"));
		}
		
	
	
	public static WebElement saveBtn(WebDriver d1) {
		return	d1.findElement(By.xpath("(//button[@class='btn secondry-button'])[1]"));
		}
		 
	
	
	
	
	
	
}
