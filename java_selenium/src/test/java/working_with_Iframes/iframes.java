package working_with_Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://automationwithpiyush.vercel.app/frames.html");
	
//	outer frame A using indexing------------ FASTEST
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("name_input")).sendKeys("this is outer frame A");
	
//	outer frmae B using ID ------- slowest--
    
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame_b");
	driver.findElement(By.id("critical_check")).click();
	
//	outer frame C using webElement ----
	
	driver.switchTo().defaultContent();
	WebElement frameC = driver.findElement(By.id("frame_c"));
	driver.switchTo().frame(frameC);
	driver.findElement(By.cssSelector("input[value='B+']")).click();
	
//Outer Frame D (Deep Nesting Level 4)------	
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(3);           // Enters frame_d
		
	driver.switchTo().frame(0);          // Enters frame_H
	driver.findElement(By.id("notes_area")).clear();
	
	driver.switchTo().frame(0);           // Enters frame_i
	WebElement DD =  driver.findElement(By.id("voltage_level"));
	Select sel = new Select(DD);
	sel.selectByValue("medium");
	
	driver.switchTo().frame(0);          // Enters frame_J
	driver.findElement(By.id("secret_code")).sendKeys("Hii, this is ujjwal sharma!!");
			
	Thread.sleep(2000);
	driver.quit();		
}
}
