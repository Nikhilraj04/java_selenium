package working_with_WebDriver;

	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Navigation;
	import org.openqa.selenium.WebDriver.Window;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class MethodOfWebDriver {
		public static void main(String[] args) throws InterruptedException, MalformedURLException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.facebook.com/");
			// fully qualified path => InvalidArgumentException

			String exTitle = "Facebook";
			String actTitle = driver.getTitle();
			
//verification of the title
			if (actTitle.contains(exTitle))
			System.out.println("title matched");

//verification of the theURL
			String exUrl = "facebook";
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(exUrl))	
			System.out.println("url matched");

//			String actSourceCode = driver.getPageSource();
//			System.out.println(actSourceCode);

			Window win = driver.manage().window();

//			modify size	
			Dimension dim = win.getSize();
			System.out.println("dimension of the window :"+  dim);
			System.out.println("the width of the window :"+  dim.getWidth());
			System.out.println("the height of the window :"+ dim.getHeight());

			Dimension dim2 = new Dimension(1000, 500);
			win.setSize(dim2);

//			modify position
			win.setPosition(new Point(300, 150));

			Point pt = win.getPosition();
			System.out.println("get position" + pt);
			System.out.println("position of the x:" + pt.getX());
			System.out.println("position of the y:" + pt.getY());

			Navigation nav = driver.navigate();

			nav.to("https://www.x.com/");
			
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
			nav.to(new URL("https://www.instagram.com/"));

			Thread.sleep(2000);
			nav.back();

			Thread.sleep(2000);
			nav.forward();

			Thread.sleep(2000);
			nav.refresh();

//			driver.getWindowHandle();
//			driver.getWindowHandles();
//			driver.switchTo();

			Thread.sleep(3000);

			driver.quit();
//			driver.close(); NoSuchSessionException		
		}
	}


