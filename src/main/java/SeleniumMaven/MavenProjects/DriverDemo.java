package SeleniumMaven.MavenProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverDemo {

	public static void main(String[] args) {
		// WebDriverManager.chromedriver().setup();
		 
	        //Create driver object for Chrome
	        //WebDriver driver = new ChromeDriver();
		
		//Create driver object for FirefoxDriver
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		 
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		 
		
		driver.get("http://www.yahoo.com");
		
		driver.findElement(By.partialLinkText("Entertainment")).click();
		
	}
	

}