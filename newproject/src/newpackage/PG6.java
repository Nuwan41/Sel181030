package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PG6 {
	public static void main(String[] args) {
	 	
		System.setProperty("webdriver.chrome.driver","C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Explicit wait
		WebDriverWait myWaitvar=new WebDriverWait(driver, 10);
		
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
        driver.get("http://newtours.demoaut.com/");
        myWaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='userName']")));
        
        driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("Nuwan");
        
        //driver.close();
        
    }

}
