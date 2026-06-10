package working_with_Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://jqueryui.com/slider/");
	
	driver.switchTo().frame(0); //The slider is NOT directly on main webpage it is nested webpage so it is present under one webpage
//The slider is NOT directly on main webpage .
//selenium canot find elements inside iframe , before switch you may get Nosuchelementexception bcz selenium searches only in main page
//driver.switchTo().frame(0) ---move control from main webpage into iframe . frames are counted like arrays
	Actions act = new Actions(driver);
WebElement slider = driver.findElement(By.id("slider"));

//moveByOffset(x,y)
act.moveToElement(slider).moveByOffset(100, 0).click().build().perform();
Thread.sleep(1000);

act.moveByOffset(-100, 0).click().perform();
Thread.sleep(1000);

act.moveByOffset(-100, 0).click().perform();
Thread.sleep(1000);

act.moveByOffset(-100, 0).click().perform();
Thread.sleep(2000);
driver.quit();
	
}
}
