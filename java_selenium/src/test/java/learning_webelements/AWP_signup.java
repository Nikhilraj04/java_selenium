package learning_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//webElements - 1) actions 2) getters 3)booleans/verfications
//action-   click(),clear(),submit(),sendKeys()
//getters - getTagName(),getAttributeName, getCSSValue(),gettext(),getLocation(),getSize(),getRect()
//verification/booleans - isDisplayed(),isEnabled(),isSelected()

public class AWP_signup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/signup.html");
	   //actions - click() , clear() , submit(), sendkeys()
     	Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.name("firstname")); // yaha pe By.name se direct search kr rhe toh aa raha hai first name aur v boht sare jageh pe rhta toh
		WebElement lastname = driver.findElement(By.name("lastname"));
		
		//sendkeys
		Thread.sleep(1000);
		firstname.sendKeys("rajnikhil");
		lastname.sendKeys("raj");
		
		 //clear
		 Thread.sleep(1000);
		 firstname.clear();
		 
		 
		 //submit
		 Thread.sleep(1000);
	     WebElement submittxtfld= driver.findElement(By.tagName("button"));
		 submittxtfld.submit();
		 
		 //GETTTERS - getTagName(),getAttributeName(),getCssValue,getLocation(),getText(),getSize(),getRect
		
		 //1) getTageName()
		WebElement tagName = driver.findElement(By.name("lastname"));
		 System.out.println(tagName.getTagName());
		
		 WebElement tagName1 = driver.findElement(By.name("firstname"));
		 System.out.println(tagName1.getTagName());
		
		 
        // 2) getAttributeName()
		 WebElement attributeName = driver.findElement(By.name("firstname"));
		// String attribute = attributeName.getAttribute("name");
		 System.out.println(attributeName.getAttribute("name"));
		 
		//3) getCSSvalue
		WebElement css = driver.findElement(By.xpath("//button[@type='submit']"));
		 System.out.println(css.getCssValue("background-color"));
		
		 //4) getText
		WebElement text = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(text.getText());
		
		//5)getSize()
		WebElement size = driver.findElement(By.xpath("//h1[@class='text-3xl font-bold']"));
		System.out.println(size.getSize());
		
		//6)getLocation()
	    WebElement location = driver.findElement(By.xpath("//h1[@class='text-3xl font-bold']"));
		System.out.println(location.getLocation());
		 
		//7)getRect()
		 WebElement Rect = driver.findElement(By.xpath("//h1[@class='text-3xl font-bold']"));
		Rectangle r = Rect.getRect();
		System.out.println(r.getDimension());
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		System.out.println(r.getX());
		System.out.println(r.getPoint());
		System.out.println(r.getPoint());
		
		
	
		
	
		 
		
		 
		 Thread.sleep(2000);
	//	 WebElement 
		 driver.quit();
		 

	
}
}
