package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PG13_Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		String baseurl="http://demo.guru99.com/test/newtours/";
		driver.get(baseurl);
		
		 WebElement link_Home = driver.findElement(By.linkText("Home"));
		 
		 WebElement td_Home = driver.findElement(By.xpath("//table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		 
		 //String td_HomeColor= td_Home.getCssValue("background-color");
		// String td_HomeColor= td_Home.getCssValue("bgcolor");
		 
		 //System.out.println(td_HomeColor);
		 
		 Actions builder=new Actions(driver);
		 
		 Action mouseOverHome=builder.moveToElement(link_Home).build();
		 
		 mouseOverHome.perform();
		 

	}

}
