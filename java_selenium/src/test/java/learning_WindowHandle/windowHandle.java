package learning_WindowHandle;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	 driver.get("https://www.instagram.com/accounts/login/");
	 String PID = driver.getWindowHandle();
	 
//	driver.findElement(By.xpath("//button[contains(text(),'Meta')]").cl;
	Thread.sleep(2000);
	
	WebElement fb = driver.findElement(By.xpath("//span[contains(text(),'Meta')]")); 
	fb.click();
	
	Set<String>CID =driver.getWindowHandles();
	for(String i: CID) {
		
	driver.switchTo().window(i);
	
	String title = driver.getTitle();
	if(title.contains("Meta")) {
	break;
		
	}
	
	}
//	driver.close();
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	
     	Thread.sleep(2000);
		WebElement btn = driver.findElement(By.className("_aswb"));
		jse.executeScript("arguments[0].click();",btn);
		Thread.sleep(2000);
		
		
		
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,500)");
		
		driver.close();
	
	
	  Thread.sleep(5000);
	  driver.quit(); 
		}}
	
	
