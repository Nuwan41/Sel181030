package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG11_AccessImageLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		String baseurl="https://www.facebook.com/login/identify?ctx=recover";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(baseurl);
		
		//WebElement homeimage= driver.findElement(By.cssSelector("i[class=\"fb_logo img sp_7W6Es4xLVtl_1_5x sx_e13423\"]"));
		//WebElement homeimage= driver.findElement(By.cssSelector("i.\"fb_logo img sp_7W6Es4xLVtl_1_5x sx_e13423\""));
		WebElement homeimage= driver.findElement(By.cssSelector("a[title='Go to Facebook Home']"));
		//WebElement homeimage= driver.findElement(By.xpath("a[@title='Go to Facebook Home']"));
		
		homeimage.click();
		
		
	}

}
