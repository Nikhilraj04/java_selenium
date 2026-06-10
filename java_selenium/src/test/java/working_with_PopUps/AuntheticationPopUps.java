package working_with_PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuntheticationPopUps {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	Thread.sleep(3000);
	
	driver.get("http://guest:guest@jigsaw.w3.org/HTTP/Basic/");
	Thread.sleep(3000);
	driver.quit();
}
}
