package swag_labs_test_Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Script {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver(); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.saucedemo.com/inventory.html");
	
	//click on username
	WebElement username = driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	
	//click on password
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	
	//click on login button
	WebElement loginbtn = driver.findElement(By.id("login-button"));
	loginbtn.click();
	
	//we are navigated on the homepage or not 
	WebElement homepage = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
	if(homepage.isDisplayed()) {
		System.out.println("we are on the homepage ");	
	}

	//we are able to view the view the bagpack
  WebElement bagpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	if(bagpack.isDisplayed()) {
		System.out.println("we are able to view the bagpack");
	}
	
	
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sauce Labs Backpack")));
	//we are selecting the product bagpack
	WebElement clickbagpack = driver.findElement(By.linkText("Sauce Labs Backpack"));
	if(clickbagpack.isDisplayed()) {
		System.out.println("we are able to select the product");
	}
	clickbagpack.click(); //=====>>>>>>>>>>>>>>>>>>>>>be very carefull here . click after verifying it other staleElementException
	
	//VERIFY THAT ITEM CAN BE ADDED TO THE CART
	wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart")));
	WebElement addtocart= driver.findElement(By.id("add-to-cart"));
	addtocart.click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("shopping_cart_container")));
	WebElement shop = driver.findElement(By.id("shopping_cart_container"));
	shop.click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("continue-shopping")));
	WebElement checkout = driver.findElement(By.id("continue-shopping"));
	checkout.click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("first-name")));
	WebElement firstname = driver.findElement(By.id("first-name"));
	firstname.sendKeys("Nikhil");
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("last-name")));
	WebElement lastname = driver.findElement(By.id("last-name"));
	lastname.sendKeys("Raj");
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("postal-code")));
	WebElement pincode = driver.findElement(By.id("postal-code"));
	pincode.sendKeys("841101");
	
	
	Thread.sleep(3000);
	
	
	driver.quit();
}
}
