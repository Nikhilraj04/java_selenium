package working_with_amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_test_script {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.amazon.in");
	WebElement searchbar =driver.findElement(By.id("twotabsearchtextbox"));
	searchbar.sendKeys("Iphone");
	
	WebElement clicksearch =driver.findElement(By.id("nav-search-submit-text"));
	clicksearch.click();
	
	List<WebElement> iphone = driver.findElements(By.className("a-price-whole"));
//	System.out.println(iphone.getText());
	for (WebElement i : iphone) {
		System.out.println(i.getText());
		
	}
	
	Thread.sleep(3000);
	driver.quit();
	
}
}
