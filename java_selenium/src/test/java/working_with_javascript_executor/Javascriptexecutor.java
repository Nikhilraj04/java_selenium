package working_with_javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://automationwithpiyush.vercel.app/");
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	WebElement chngTheme = driver.findElement(By.id("theme-toggle-desktop"));
	jse.executeScript("arguments[0].click();", chngTheme );
	Thread.sleep(1000);
	
	WebElement locatorsnav = driver.findElement(By.xpath("//h4[text()='Locators']"));
	jse.executeScript("arguments[0].click();", locatorsnav);
	Thread.sleep(1000);
	
	jse.executeScript("window.location='https://www.oracle.com/java/technologies/javase-jdk26-doc-downloads.html';");
	
	WebElement click1 = driver.findElement(By.xpath("//a[contains(text(),'jdk-26.0.1_doc-all.zip')]"));
	jse.executeScript("arguments[0].click();",click1);
	Thread.sleep(3000);
	
	WebElement click2 = driver.findElement(By.cssSelector("a[class='download-file icn-download']"));
	jse.executeScript("arguments[0].click();",click2);
	
//	
//	 driver.findElement(By)
//	driver.findElement(By.xpath("//a[@class='download-file icn-download']"));
//	
//	
//	WebElement un = driver.findElement(By.name("licenseAccept"));
//	
	
	Thread.sleep(5000);
	driver.quit();
	
}
}
