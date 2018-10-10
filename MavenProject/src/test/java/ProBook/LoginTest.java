package ProBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	
	String url = "http://probook.progideo.com";
	String expectedTitle1 = "Fil d'actualités - ProBook";
	String actualTitle1= null;
	String username="lmous.jouhaina";
	String password= "jouhaina";
	String expectedTitle2="Fil d'actualités - ProBook";
	String actualTitle2=null;
	
	WebDriver driver;

  @Test
  public void f() {
	 
		driver.findElement(By.linkText("Se connecter / s'inscrire")).click();
	
		actualTitle1=driver.getTitle();
		
		System.out.println("Login page title: expected values is "+expectedTitle1+" actual value is "+actualTitle1);
		
		if(!actualTitle1.contentEquals(expectedTitle1)) {
			System.out.println("Test Failed");
		}else
			System.out.println("Test OK");
		
		driver.findElement(By.id("login_username")).sendKeys(username);
		driver.findElement(By.id("login_password")).sendKeys(password);
		
		driver.findElement(By.id("loginBtn")).click();
	
		actualTitle2 = driver.getTitle();
		
		System.out.println("Login result: expected value is "+ expectedTitle2+" actual value is "+actualTitle2);
		
		if(!actualTitle2.contentEquals(expectedTitle2)) {
			System.out.println("Test Failed");
		}else
			System.out.println("Test OK");
		
  }
  
  @BeforeMethod
  public void beforeMethod() {
	
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\A632353\\eclipse\\java-2018-09\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
