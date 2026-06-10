package working_with_Dropdown;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDD {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://automationwithpiyush.vercel.app/signup.html");
	
	//find element for the select tag ( suffix ====> DD )
	WebElement dayDD =  driver.findElement(By.id("day"));
	
	//create an object of select class and pass the webelement
	Select sltDay = new Select(dayDD);
	
	//perform the task
	sltDay.selectByIndex(3);
	
	WebElement mntDD = driver.findElement(By.id("month"));
	Select sltMon = new Select(mntDD);
	sltMon.selectByIndex(7);
	
	/*
	 *

=== When to use selectByVisibleText()

You know the text shown in UI
Dropdown values may change internally
You want readable automation code , easy to understand

Example:
country.selectByVisibleText("India");
	 */

	WebElement yearDD = driver.findElement(By.id("year"));
	Select sltYear = new Select(yearDD);
	sltYear.selectByVisibleText("2001");
	
	/*
	
===When to use selectByValue()===
You know the backend value
Visible text may change
Value is unique and stable

for ex-
<option value="IN">India</option>
<option value="US">United States</option>
	*/
	Thread.sleep(2000);
	driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
	
	//find element for the select tag (with suffix => DD)
	WebElement singleSelectDD = driver.findElement(By.id("single-select"));
	
	//create an object of select class and pass the webElement
	Select selSSDD = new Select(singleSelectDD);
	
	//perform the task
	selSSDD.selectByIndex(3);
	Thread.sleep(1000);
	selSSDD.selectByValue("DXB");
	Thread.sleep(1000);
	selSSDD.selectByVisibleText("Paris, France");
	Thread.sleep(1000);
	
// 	selSSDD.deselectByIndex(3); ===> UnsupportedOperationException: You may only deselect options of a multi-select
	
	//isMultiple() => to check whether the given dd is multi select or not
	if(selSSDD.isMultiple()) {
		selSSDD.deselectByIndex(3);
	}
	
	List<WebElement> opts = selSSDD.getOptions();
	
	for(WebElement i : opts) {
		String text = i.getText();
		System.out.println(text);
	}
	
	
//find element for the select tag (with suffix => DD)
WebElement msDD = driver.findElement(By.id("multi-select"));

//create an object of select class and pass the webElement
Select selMS = new Select(msDD);

//perform the task
selMS.selectByIndex(0);
selMS.selectByIndex(1);
selMS.selectByIndex(2);

Thread.sleep(2000);

//selMS.deselectAll(); ----- when we using getFirstSelectedOptions() don't use deselect all

WebElement selectfirst =selMS.getFirstSelectedOption();
System.out.println(selectfirst.getText());


List<WebElement> selectedAll = selMS.getAllSelectedOptions();
for (WebElement i : selectedAll) {
	System.out.println(i.getText());
	
}

	Thread.sleep(2000);
	driver.quit();
}
}
