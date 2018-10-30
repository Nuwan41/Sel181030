package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG2 {
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseurl="https://www.facebook.com/";
		String tagName="";
		
		driver.get(baseurl);
		
		//tagName=driver.findElement(By.id("email")).getTagName();
		tagName=driver.findElement(By.cssSelector("font:contains('Password:')")).getTagName();
		
		System.out.println("Tag Name is "+tagName);
		driver.close();
	}

}
