package learning_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_Direct_Locators {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/synchronization.html");
	//DIRECT LOCATORS - ID() , NAME() , CLASSNAME(),TAGNAME() , LINKTEXT(),PARTIALLINKTEXT(),
	//EXPRESSIONS - CSSSELECTORS , XPATH
	//id
	WebElement username = driver.findElement(By.id("user_login_field"));
	username.sendKeys("Sri-Harivansh");
	
	WebElement password = driver.findElement(By.name("security_passphrase"));
	password.sendKeys("Jai-jai-Sri-Radhe");
	
	WebElement clickbtn = driver.findElement(By.className("btn primary_action submit_btn"));
	clickbtn.click();
}}