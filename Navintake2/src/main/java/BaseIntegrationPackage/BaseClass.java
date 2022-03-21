package BaseIntegrationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public BaseClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		//chromedriver.exe->invokes chrome driver
		//webdriver.chrome.driver is a property-> value of path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium learning\\ChromeDriver\\chromedriver.exe");
		//WebDriver is an interface which defines driver methods & ChromeDriver implements it using overriding
		WebDriver driver = new ChromeDriver();
		//get method to launch a URL
		driver.get("https://rahulshettyacademy.com");
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
