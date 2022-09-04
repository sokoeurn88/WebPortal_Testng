package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderLiveProject {
	
	@Test(dataProvider="create")
	public void testData(String username, String password) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("username","password");
		driver.findElement(By.id("password")).sendKeys("username","password");
		driver.findElement(By.id("login-button")).click();
		
		driver.close();
	}
	
	
	@DataProvider(name="create")
	public Object[][] provideData() {
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
		};
		
	}
	

}
