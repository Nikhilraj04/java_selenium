package working_with_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();//no return type so we have to not store in some variable
	driver.get("https://www.facebook.com/?locale=hi_IN");
	
	String title = driver.getTitle(); //we have to put it in the string bcz it has string as the return type
	System.out.println(title);
	
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
}
}
