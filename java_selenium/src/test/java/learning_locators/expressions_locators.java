package learning_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class expressions_locators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationwithpiyush.vercel.app/locators.html");
		
		//ques:9) Locate the paragraph containing the text "Navigation Point".
			WebElement text = driver.findElement(By.xpath("//p[text()='Navigation Point']"));
			String tx = text.getText();
			System.out.println(tx);
			
	//ques:10) Locate the Search Query field
		WebElement searchfield = driver.findElement(By.xpath("//input[@aria-label='search-query']"));
		searchfield.sendKeys("lighweight yeaah buddy");
		
		//ques:11): Locate the Generate Report button
	WebElement buttonreporttag =driver.findElement(By.xpath("//button[text()='Generate Report']"));
		buttonreporttag.click();
		
		//Task 12: Locate the Contact Email field
	WebElement emailfield = driver.findElement(By.xpath("//input[@class=\"form-input\"]"));
	emailfield.sendKeys("nikhilraj04.careers@gmail.com");
	
	//Task 13: Locate the Submit Order 2026 button.
WebElement submitorderbutton = driver.findElement(By.xpath("//button[text()='Submit Order 2026']"));
submitorderbutton.submit();

//task 14 :
WebElement checkbox = driver.findElement(By.xpath("//td[text()='Bob_User']/following-sibling::td/input[@type='checkbox']"));

WebElement checkboxBOB = driver.findElement(By.xpath("//td[text()='Bob_User']"));
checkboxBOB.click();

driver.quit();
	}

}
