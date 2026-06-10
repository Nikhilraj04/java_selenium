package practice_working_with_WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//===>>>>>>>>>>>>>> 1) navigate.to()
//                    2)navigate.back();
//					3)navigate.forward();
//				    4) navigate.refresh();

public class Navigate_methods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.google.com");
	
	driver.navigate().to("https://bhajanmarg.com/amp/");
	
	driver.navigate().back();
	Thread.sleep(1000);
	
	driver.navigate().forward();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	driver.quit();
	
	
}
}
