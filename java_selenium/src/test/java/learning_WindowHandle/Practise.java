package learning_WindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/"); // orginal or the parent window
	
	String PID = driver.getWindowHandle(); 
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(text(),'Everywhere')]")).click();
	
	Set<String> CID = driver.getWindowHandles();
	
	for (String i : CID) {
		driver.switchTo().window(i);
		
		String title = driver.getTitle();
		if (title.contains("X")) {
		break;
		
	Thread.sleep(5000);
	driver.close();
	
	Thread.sleep(5000);
	
	
	driver.switchTo().window(PID); //
	driver.close();
	driver.quit();
		}}}
