package working_with_Screenshot;


import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	driver.get("https://facebook.com/");
	TakesScreenshot tks = (TakesScreenshot)driver; // downcasting here bcz driver doesn't scrnshot taken capa , but now it has srcsht taking cap 

//three ways
	//String ss = tks.getScreenshotAs(OutputType.BASE64);
	//byte[] ss= tks.getScreenshotAs(OutputType.BYTES);
	File source = tks.getScreenshotAs(OutputType.FILE); //screenshot taken temporarily in ram
	File destination = new File("./new/facebook.png"); //this line tells save location  ===rajLoginFb.png = screenshotname
	FileHandler.copy(source,destination); // this line creates the screenshot
	
	
	driver.get("https://www.zomato.com/");
	File sourceFile = tks.getScreenshotAs(OutputType.FILE);
	File destiantion = new File("./new/zomato.jpeg");
	FileHandler.copy(sourceFile, destiantion);
	
	driver.get("https://in.linkedin.com/");
	File src=tks.getScreenshotAs(OutputType.FILE);
	File destinationFile = new File("./new/Linked.png");
	FileHandler.copy(src, destinationFile);
	
	Thread.sleep(3000);
	driver.quit();
}
}
