package working_with_WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver(); //webdriver is a an interface , driver is a reference var , chrome driver constructor call is used to 1) load the empty browser , 2) load , register and re-intialize  the non-static memebers, 3) start the server 
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//open site
	driver.navigate().to("https://google.com");
	
	Thread.sleep(null);
	
	//go to open another site 
	driver.navigate().to("https://fb.com"); //it is much faster than the get()
	Thread.sleep(null);
	
	
	//back
	driver.navigate().back();
	
	//forward
	driver.navigate().forward();
	
	//refresh
	driver.navigate().refresh(); //used to refresh the page
	
	driver.quit(); 
	
	Thread.sleep(2000);
	
}

}
