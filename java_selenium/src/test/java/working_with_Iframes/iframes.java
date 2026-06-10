package working_with_Iframes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://automationwithpiyush.vercel.app/frames.html");
	driver.switchTo().frame(3);
	
	
	
	
	Thread.sleep(2000);
	driver.quit();
}
}
