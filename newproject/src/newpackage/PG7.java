package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG7 {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String baseurl="http://demo.guru99.com/test/login.html";
		
		driver.get(baseurl);
		
		WebElement email=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.name("passwd"));
		WebElement btnSubmit= driver.findElement(By.cssSelector("button[id='SubmitLogin']"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		System.out.println("Text Field Set");
		
		// Deleting values in the text box
		email.clear();
		password.clear();
		System.out.println("Text Field Cleared");
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		System.out.println("Text Field Set");
		
		btnSubmit.click();
		
		
		
	}

}
