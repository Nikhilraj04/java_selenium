package working_with_Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebookwebelement {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://facebook.com/");
		WebElement srcpath =	driver.findElement(By.xpath("//[@class='xr4gsrn xa83c8o x3oym20 x1i84rja x1is6hmk x1pwz1hh x12fhftt x19kjcj4 x1u2x60b xsjzec5'"));
		
	}

}
