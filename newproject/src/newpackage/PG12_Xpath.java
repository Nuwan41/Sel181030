package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG12_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		String baseurl="http://newtours.demoaut.com/";
		driver.get(baseurl);
		String innertext="";
		
		innertext = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td[1]/font")).getText();
		
		System.out.println(innertext);
		
		innertext= driver.findElement(By.xpath("//table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font")).getText();

		System.out.println(innertext);
		
		driver.close();
	}

}
