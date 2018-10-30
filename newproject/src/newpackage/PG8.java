package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG8 {
	
public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String baseurl="http://demo.guru99.com/test/radio.html";
		
		driver.get(baseurl);
		
		WebElement rad1=driver.findElement(By.id("vfb-7-1"));
		WebElement rad2=driver.findElement(By.id("vfb-7-2"));
		
		WebElement chk1=driver.findElement(By.id("vfb-6-0"));
		
		
		rad1.click();
		System.out.println("Rad 1 Selected");
		rad2.click();
		System.out.println("Rad 2 Selected");
		
		for(int i=0;i<2;i++){
		
		chk1.click();
		
		if(chk1.isSelected()){
			System.out.println("Check Box 1 is Selected");
		}
		else{
			System.out.println("Check Box 1 is Not Selected");
		}
		}
	}

}
