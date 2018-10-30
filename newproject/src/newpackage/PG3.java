package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG3 {
	 public static void main(String[] args) {
		 	System.setProperty("webdriver.chrome.driver","C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	        driver.get("http://www.popuptest.com/popuptest2.html");
	        //driver.close();
	        driver.quit();  // using QUIT all windows will close
	    }
	}
