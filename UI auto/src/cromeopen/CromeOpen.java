package cromeopen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CromeOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		String chromepath=System.getProperty("user.dir")+"\\Browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/en");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath( "//button[text()=\"Forgot email?\"]" )).click();
		Thread.sleep(3000);
	
	String actualURL = driver.getCurrentUrl();
	
	driver.quit();
		 actualURL.contains("accounts.google.com/signin/v2");
		System.out.println("TCs Passed ");
	
	}

}
