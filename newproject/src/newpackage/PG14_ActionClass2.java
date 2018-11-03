package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PG14_ActionClass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		String baseurl="https://www.facebook.com/";
		driver.get(baseurl);
		
		WebElement txtEmail= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		//txtEmail.sendKeys("hello");
		
		Actions builder=new Actions(driver);
		
		Action seriesOfActions=builder.keyDown(txtEmail, Keys.SHIFT).sendKeys(txtEmail, "hello").keyUp(txtEmail, Keys.SHIFT).sendKeys(txtEmail, "nuwan").doubleClick().contextClick().build();
		
		seriesOfActions.perform();
	}

}
