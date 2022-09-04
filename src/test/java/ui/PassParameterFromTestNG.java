package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PassParameterFromTestNG {

//	public static String browser = "chrome";
	public static WebDriver driver;
	
	
	@Parameters({"browser"})
	@Test
	public void lauchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("Chrome")) {		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
				
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@class='btn btn-success block full-width']")).click();	
		
		driver.close();
		driver.quit();

	}

}
