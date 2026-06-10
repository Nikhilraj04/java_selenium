package working_with_PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptPopUps {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/popups.html");
	    
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); //explicit wait
	wait.until(ExpectedConditions.alertIsPresent()); //
	
	Alert ale = driver.switchTo().alert(); //alert is a interface
	
	ale.sendKeys("Radha vallabh sri harivansh");
	ale.accept();
	Thread.sleep(3000);
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.alert('welcome to automationwithnikhil')");
	Thread.sleep(3000);
	ale.accept();
	
	jse.executeScript("window.confirm('Are you going to Stay Harivanshi Forever ??');");
	Thread.sleep(3000);
	ale.dismiss();
//	ale.getText();
	
	jse.executeScript("window.prompt('Enter your level of bhakti.....');");
	Thread.sleep(3000);
	ale.dismiss();
	
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
