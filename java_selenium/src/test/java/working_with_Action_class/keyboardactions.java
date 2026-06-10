package working_with_Action_class;

import java.net.http.WebSocket;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {
	//sendkeys() , keyDown() , keyUp();
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.facebook.com/");
	
	Actions act = new Actions(driver);
//	act.contextClick().perform(); //to prove the position of mouse pointer in top left corner
	
	Thread.sleep(1000);
	act.sendKeys("dudenikhilraj@gmail.com").perform();
	
	act.keyDown(Keys.CONTROL).perform();
	act.sendKeys("a").perform(); // same as ctrl + a
	act.keyUp(Keys.CONTROL).perform();
	
	Thread.sleep(2000);
	
	act.keyDown(Keys.TAB).perform(); // press key
	act.keyUp(Keys.TAB).perform(); // key release
	
	Thread.sleep(3000);
	driver.quit();
}
}
