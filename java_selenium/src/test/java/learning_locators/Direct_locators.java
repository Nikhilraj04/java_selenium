package learning_locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Direct_locators {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/synchronization.html");
	
	
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	int length = links.size();
	System.out.println(length);
	
	Thread.sleep(3000);
	driver.quit();
	
//	
	
}
}
