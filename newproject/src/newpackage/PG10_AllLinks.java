package newpackage;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG10_AllLinks {
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		String baseurl="http://demo.guru99.com/test/newtours/";
		String unConsTitle="Under Construction: Mercury Tours";
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(baseurl);
		
		List<WebElement> linkElements=driver.findElements(By.tagName("a"));
		
		String[] linktext=new String[linkElements.size()];
		int i=0;
		
		for(WebElement e:linkElements){
			linktext[i]=e.getText();
			i++;
		}
		for(String lt:linktext){
			System.out.println(lt);
			try{
			driver.findElement(By.linkText(lt)).click();
			if(driver.getTitle().equals(unConsTitle)){
				System.out.println(" Page is Under Construction");
			}
			else{
				System.out.println(" Page is Working");
			}
			
			driver.navigate().back();
			}
			catch(NoSuchElementException nsee){
				System.out.println("Element "+lt+" is not available" );
				
			}
			
			
		}
		
		driver.quit();
	}

}
