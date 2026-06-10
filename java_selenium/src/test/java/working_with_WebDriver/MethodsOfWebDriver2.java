package working_with_WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver2 {
public static void main(String[] args) throws InterruptedException {
 WebDriver driver = new ChromeDriver();
 
 driver.get("https://www.instagram.com/");// return type void
 
 String Title = driver.getTitle();
 System.out.println(Title);
 
 String URL = driver.getCurrentUrl();
 System.out.println(URL);
 
 Thread.sleep(4000);
 
// String PageSource=driver.getPageSource();
// System.out.println(PageSource);
 
 
// driver.manage().window().maximize(); //maximize
// 
// driver.manage().window().minimize(); //minimise
// 
// driver.manage().window().fullscreen(); //fullScreen
 
 

 //===============================================================
 //storing the method into = dim
 Dimension dim = driver.manage().window().getSize(); //DIMENSION <<C>> is a return type of the getSize()
 System.out.println(dim); //=> (width , height)
 
 int w = driver.manage().window().getSize().getWidth(); //int w = dal diya phle 
 // int w = dim.getHeight(); we can write like this also 
 int h = dim.getHeight();

System.out.println(w + " and " + h);


Point pt = driver.manage().window().getPosition();
System.out.println(pt); // => (x , y)

int x = driver.manage().window().getPosition().getX();
int y = pt.getY();

System.out.println(x + " and " + y);

 //=============================================================

// driver.navigate();

	// WINDOW HANDLING

	//driver.getWindowHandle();
	//driver.getWindowHandles();
	//driver.switchTo();


 
// driver.close();  //it will close the current window,it will not stop the server
 driver.quit(); //it will close all the windows , it will stop the server
}
}
