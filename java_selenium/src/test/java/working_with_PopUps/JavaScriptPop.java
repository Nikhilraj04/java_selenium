package working_with_PopUps;
	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	

	public class JavaScriptPop {
		public static void main(String[] args) throws InterruptedException {
			
//			ChromeOptions setting = new ChromeOptions();
//			setting.addArguments("--disable-notifications");     -  for notification popUp		
//			WebDriver driver = new ChromeDriver(setting);
			
//			javaScript popUp ---
//			we have three type --  1). alert popUp , 2). confirmation popUp , 3). prompt popUp 
//			methods og alert<<I>> --  accept() , dismiss() , sendKeys() , getText() 
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://automationwithpiyush.vercel.app/popups.html");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent()); // expected consitions have 18 methods ExpectedConditions.
			
			Alert ele = driver.switchTo().alert();
			ele.sendKeys("hy there!!!");
			ele.accept();
			Thread.sleep(2000);
			
			 JavascriptExecutor jse =(JavascriptExecutor) driver;
			 jse.executeScript("window.scrollby='0,500'");
			 
			
//			alert  popUp is done !!!
			driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
	        ele.accept();
	        Thread.sleep(2000);
	        
//	        confirmation popUp is done !!
	        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
	        ele.dismiss();
	        Thread.sleep(2000);
	        
//	        promt popUp is done !!
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait1.until(ExpectedConditions.alertIsPresent());
	        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
	        
//	        ele.sendKeys("promt popUp has been accepted!!");
//	        ele.accept();
	        
	        
	        
	        
			
			Thread.sleep(2000);
			driver.quit();
			
		}

	}

