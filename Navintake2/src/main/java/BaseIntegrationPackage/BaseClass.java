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
//tagname[attribute='value']:nth-child(indexnumberstartingwith1)
//or in console put - $('css')
//xpath syntax
//- //tagname[@attribute='value']
//or in console put - $x('//tagname[@attribute="value"]')
//- //tagname[@attribute='value'][indexnumberstartingwith1]
//Parent to child navigation using tags only - without any attributes
//xpath
//- //parenttagname/childtagname[indexnumber], //parenttagname[@att='']/childttagname[index]
//css
// parenttagname childtagname
//Using Regular expressions
//css
// tagname[attribute*='partial_text']
//xpath
//- //tagname[contains(@attribute,'full text')] -if you use classname attribute put full compound value here as you are building a custom xpath

//xpath
//- //tagname[text()='LOG OUT'] -no css to select an element based on text
//or //*[text()='LOG OUT'] -* will search for any tag name, use it only when this text is unique on the page

//Thread.Sleep(); helps in java to wait explicitly but not recommended

//Automate a web application and assert it with TestNG
//Automate a web application and use BDD Cucumber
//Automate a web application with Saucelabs/Browserstack for cross browser testing (extension)
//Automate a web application using Appium for IoS and Android (extension)
//Automate single page web applications written by Angular and React, URL no change
//Automate API testing using RestAssured
//Build a common CI/CD Jenkins and Azure pipelines for the above
//Build different repos in Github
//+projects - Assert and automate ETL testing
