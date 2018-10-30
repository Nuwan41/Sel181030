package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG5 {
	public static void main(String[] args) {
	 	System.setProperty("webdriver.chrome.driver","C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String altMessage="";
		
        driver.get("http://jsbin.com/usidix/1");        
        driver.findElement(By.cssSelector("input[value='Go!']")).click();
        
        altMessage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        
        System.out.println("Alert Text Is "+ altMessage);
        
       driver.quit();
       
       
       // driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        
        
       // driver.switchTo().frame("classFrame");
        
      //  driver.findElement(By.linkText("Deprecated")).click();
        
        //driver.close();
        
    }

}
