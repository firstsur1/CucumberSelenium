package seleniumTests;


	import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
	public class Test {
	

	public static void main(String[] args) throws InterruptedException {

	
		System.setProperty("webdriver.chrome.driver","D:\\ToolSQA\\Drivers\\chromedriver.exe");
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("disable-extensions");
	    opt.addArguments("--start-maximized");
	    WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://saucelabs.com");
	//	driver.get("http://demo.guru99.com/test/facebook.html");
	  //   driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc");
	//     driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ABC");
	   //*[@id="email"]
	//     <a class="MSz5 _1QSO hidden-sm-down" href="/beta/login" data-reactid="10"><!-- react-text: 11 -->Sign In<!-- /react-text --><i class="_1JbS _1MOS _1RDP" data-reactid="12"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 32 32"><path d="M-248.49,3768.4h1a14,14,0,0,1,4.1-9.9,14,14,0,0,1,9.9-4.1,14,14,0,0,1,9.9,4.1,14,14,0,0,1,4.1,9.9,14,14,0,0,1-4.1,9.9,14,14,0,0,1-9.9,4.1,14,14,0,0,1-9.9-4.1,14,14,0,0,1-4.1-9.9h-2a16,16,0,0,0,16,16,16,16,0,0,0,16-16,16,16,0,0,0-16-16,16,16,0,0,0-16,16h1Z" transform="translate(249.49 -3752.4)"></path><path d="M-237.34,3765.76h1a4.52,4.52,0,0,1,.91-2.8,2.5,2.5,0,0,1,1.94-1,2.5,2.5,0,0,1,1.94,1,4.52,4.52,0,0,1,.91,2.8,4.52,4.52,0,0,1-.91,2.8,2.5,2.5,0,0,1-1.94,1,2.5,2.5,0,0,1-1.94-1,4.52,4.52,0,0,1-.91-2.8h-2a6.51,6.51,0,0,0,1.35,4,4.5,4.5,0,0,0,3.51,1.8,4.5,4.5,0,0,0,3.51-1.8,6.51,6.51,0,0,0,1.35-4,6.51,6.51,0,0,0-1.35-4,4.5,4.5,0,0,0-3.51-1.8,4.5,4.5,0,0,0-3.51,1.8,6.51,6.51,0,0,0-1.35,4h1Z" transform="translate(249.49 -3752.4)"></path><path d="M-222.55,3779.63a5.2,5.2,0,0,0-1.63-3.64,5.79,5.79,0,0,0-4.07-1.67h-10.47a5.79,5.79,0,0,0-4.07,1.67,5.2,5.2,0,0,0-1.63,3.64,1,1,0,0,0,1,1,1,1,0,0,0,1-1,3.23,3.23,0,0,1,1-2.21,3.79,3.79,0,0,1,2.67-1.09h10.47a3.79,3.79,0,0,1,2.67,1.09,3.23,3.23,0,0,1,1,2.21,1,1,0,0,0,1,1,1,1,0,0,0,1-1h0Z" transform="translate(249.49 -3752.4)"></path></svg></i></a>
	    WebElement header = driver.findElement(By.cssSelector("."));
	    
	  header.click();
	//    assertTrue((header.isDisplayed()));

	//    driver.close();        
	   }
	}


