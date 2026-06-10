package working_with_Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
public static void main(String[] args) throws InterruptedException {	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://automationwithpiyush.vercel.app/actions.html");

//actions - hover, left click,right click ,double click,click and hold,release,drag & drop,scrolling

//right-click- contextclick() , contextclick(elemement)
//drag & drop - drag & drop(source,destination) , drag and dropBy(Source,X,Y)
//scrolling - scrolltoElement(element), scrollByAmount(X,Y)
//======>Mandatory Elements - build() , perform()

Actions actionclass = new Actions(driver);
//Select sel = new Select(element);
//======= we pass driver bcz it tells which browser it should call chrome , edge , firefox====

//hover
Thread.sleep(2000);
WebElement hover = driver.findElement(By.xpath("//button[contains(text(),'Hover Me')]"));
actionclass.moveToElement(hover).build().perform();
Thread.sleep(1000);


//left-click
WebElement leftclick = driver.findElement(By.id("click-box"));
actionclass.moveToElement(leftclick).click().build().perform();
Thread.sleep(1000);

//right-click
WebElement rightclick = driver.findElement(By.id("right-click-area"));
actionclass.moveToElement(rightclick).contextClick().build().perform();
Thread.sleep(1000);

//double-click
WebElement doubleclick = driver.findElement(By.id("double-click-area"));
actionclass.moveToElement(doubleclick).doubleClick().build().perform();
Thread.sleep(1000);

//clickandhold
WebElement clickandhold =driver.findElement(By.id("click-hold"));
actionclass.moveToElement(clickandhold).pause(Duration.ofSeconds(3)).release().perform();
Thread.sleep(3000);




driver.quit();
}
}