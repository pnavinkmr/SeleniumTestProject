package BaseIntegrationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		 
	}

}
//GitHub
//Step 1: Create account and sign in
//Step 2: Create a project and a repository
//Step 3: Start Eclipse
//Step 4: Goto Perspective -> Git Repositories and click on Clone Git repositories
//Step 5: Keep your Git repo as public to clone a repo (maybe because of free version)
//Step 6: Right click on project -> Team -> Share -> Add to Git repo
//Step 7: Right click -> Team -> Commit -> select all/some files ->drag to Git staging
//Step 8: Click commit and push 
//Step 9: If password doesn't work, then goto Github -> user settings -> Developer settings
	// -> Personal access tokens -> Generate new token -> copy token -> Paste in Eclipse commit
	// as password


//css syntax
//tagname.classname, tagname#id, tagname[attribute='value']
//selectorshub - type css selector
//or in console put - $('css')
//xpath syntax
//