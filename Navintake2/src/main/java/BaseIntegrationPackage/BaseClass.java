package BaseIntegrationPackage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseClass {

	public BaseClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IllegalMonitorStateException {
		
		//chromedriver.exe->invokes chrome driver
		//webdriver.chrome.driver is a property-> value of path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium learning\\ChromeDriver\\chromedriver.exe");
		//WebDriver is an interface which defines driver methods & ChromeDriver implements it using overriding
		WebDriver driver = new ChromeDriver();
		//declare an implicit wait for all its operations
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//get method to launch a URL
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandles());
		driver.findElement(By.id("email")).sendKeys("navinkumar");
		driver.findElement(By.className("btn-primary")).click();
		//driver.wait(3000); don't use doesn't work
		//driver.close();
		Assert.assertEquals("", "");
		 
	}

}
