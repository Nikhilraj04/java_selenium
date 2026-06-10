 package learning_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demo.nopcommerce.com/");
	
	
	// 1) id     syntax tag#id
	WebElement cs = driver.findElement(By.cssSelector("input#small-searchterms"));
	cs.sendKeys("t-shirt");
	
	
	//ese v likh skte hai
//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("radha");
//											#small-searchterms
	
	//2) class   sytanx - tag.classname
	WebElement searchBox = driver.findElement(By.cssSelector(".search-box-text"));
	searchBox.sendKeys("t-shirt");
	
	
	//3) attribute  syntax - [attribute='value']
	driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("t-shirt");
	//								  [placeholder='Search store']      
	
	// 4) tag class attribute
	driver.findElement(By.cssSelector("#small-searchterms[name='q']")).sendKeys("t-shirt");
	
	driver.quit();
	}
}
