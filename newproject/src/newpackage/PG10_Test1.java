package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG10_Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		String baseurl="http://demo.guru99.com/test/radio.html";
				
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseurl);
		
		List<WebElement> webform = driver.findElements(By.name("webform"));
		
		System.out.println(webform.size());		
	
		webform.get(1).click();
		
		
		

	}

}
