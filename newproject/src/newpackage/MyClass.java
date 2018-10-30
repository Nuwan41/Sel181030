package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseurl="http://newtours.demoaut.com/";
				
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		
		//Launch Chrome & direct to Url
		driver.get(baseurl);
		
		actualTitle=driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		}
		else{
			System.out.println("Test Failed");
		}
		
		//System.exit(0);
		driver.close();
	}

}
