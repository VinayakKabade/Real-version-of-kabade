package practice_codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstSample  {

public static void main(String[] args)  {

	
System.setProperty("webdriver.gecko.driver", "D:/eclipse/first test/webddriver/firefoxDriver/geckodriver.exe");
WebDriver driver=  new  FirefoxDriver();
driver.get("http://developer.mozilla.org/en-US/docs/Mozilla/Gecko");
WebElement inputObj = driver.findElement(By.name("q"));
inputObj.sendKeys("Vinayak");
driver.close();
}
}