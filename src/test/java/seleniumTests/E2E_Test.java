package seleniumTests;



	
		import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
		 
		public class E2E_Test {
			private static WebDriver driver;
			
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.ie.driver","D:\\ToolSQA\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.zopa.com");
		 
			//	driver.navigate().to("https://www.zopa.com/loans");
		 
			
				driver.findElement(By.className("button--fullWidth")).click();
				Thread.sleep(3000);
				WebElement a = driver.findElement(By.xpath(".//*[@id='submit-loan-button']"));
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,50)", "");
				driver.findElement(By.xpath(".//*[@id='slider_calc_results']/table/tbody/tr[1]/td[1]/span/label")).click();
			//	WebElement a = driver.findElement(By.xpath("//a[contains(text(),'Accessories')])[3]"));
			//	 WebElement header = driver.findElement(By.xpath("//*[@id='site-header']/div[1]/header/div[2]/a"));
				    
				//<li class="cat-item cat-item-118 cat-parent"><a href="http://shop.demoqa.com/product-category/accessories/" class="xh-highlight">Accessories</a></li>
			//	items.get(0).click();
				//*[@id="woocommerce_product_categories-2"]/ul/li[1]/a
				a.click();
				
								
		//		driver.quit();
		 
			}

}
