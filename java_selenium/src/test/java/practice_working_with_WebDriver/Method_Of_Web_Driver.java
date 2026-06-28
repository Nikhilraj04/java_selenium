package practice_working_with_WebDriver;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Of_Web_Driver {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	// 1) getTitle 
	driver.get("https://www.amazon.com"); // if not passed fully : InvalidArgumentException();
		String title = driver.getTitle();
	System.out.println(title); 
	
	// 2) getURL
	String URL = driver.getCurrentUrl();
	System.out.println("url of the webpage is "+URL);
	
	
	// verify the Title
	String titleVerf = "Amazon"; 
	String titlecheck = driver.getTitle();
	
	if (titlecheck.contains(titleVerf))
	System.out.println("title matched");
	
	String url = driver.getCurrentUrl();
	System.out.println(url);

	driver.getTitle();
    driver.getCurrentUrl();
    driver.getPageSource();
    
// ====================== GET SIZE ================================ 
	
	//where Dimension is a class have two methods getHeight and getWidth
 Dimension dim = driver.manage().window().getSize();
	System.out.println("dimension of the Webpage:"+ dim);  //(width , height )
	
	int w = dim.getWidth();
	
	int h = dim.getHeight(); //dim m store hai aage ka jse driver.manage().window().getSize()
	
	System.out.println("the width of the webpage :" + w + "and" + " the height of the webpage :" + h);
	
	
// ==========================
	
	
//=================GET POSITION ==================================	
	Point pt = driver.manage().window().getPosition();
	
	
	int x =pt.getX();
	int y = pt.getY();
	
	
	//SET SIZE AND POSITION
System.out.println("the position of the X "+ x + " and "+"the positon of the Y" + y);

 driver.manage().window()	.setSize(new Dimension(500,500));
 driver.manage().window().setPosition(new Point(150,150));
 System.out.println(pt);
	
	
	
System.out.println("--------------------------");

    driver.manage();
    driver.navigate();
    driver.getWindowHandle();
    driver.getWindowHandles();
    
    Thread.sleep(1000);
//    driver.close();
    driver.quit();
    
    
    
    
    
    }
}
