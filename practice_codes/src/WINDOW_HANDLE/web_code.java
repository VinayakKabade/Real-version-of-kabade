package WINDOW_HANDLE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_code
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*
		URL objUrl = new URL("http://www.google.com");
		driver.navigate().to(objUrl);
		//driver.get("http://www.google.com");
		//driver.navigate().to("http://in.yahoo.com/?p=us");
		driver.navigate().back();
		
		 * System.out.println("Back"); driver.navigate().forward();
		 * System.out.println("forward"); driver.navigate().back();
		 * System.out.println("Back"); driver.navigate().forward();
		 * System.out.println("forward"); driver.navigate().back();
		 * System.out.println("Back"); driver.navigate().forward();
		 * System.out.println("forward");
		 */
		driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		driver.findElement(By.className("tree-indicator glyphicon glyphicon-chevron-right")).click();
		driver.findElement(By.className("tree-indicator glyphicon glyphicon-chevron-right")).click();
		
		
		
		Thread.sleep(5000);
		
	}

}

