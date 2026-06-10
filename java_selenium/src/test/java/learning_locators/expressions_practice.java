package learning_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class expressions_practice {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/locators.html");
	
//	driver.findElement(By.xpath(null))
	//td[text()='Alice_Admin']/..//td[text()='Administrator']
	}
}
