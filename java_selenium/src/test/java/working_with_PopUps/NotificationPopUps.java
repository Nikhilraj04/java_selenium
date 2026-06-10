package working_with_PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUps {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/popups.html");
	
	ChromeOptions settings = new ChromeOptions();
	settings.addArguments("--disable-notifications");
	settings.addArguments("--incognito");
	settings.addArguments("--incognito");
	settings.addArguments("--start-maximimized");
	
	Thread.sleep(3000);
	driver.quit();
}
}
