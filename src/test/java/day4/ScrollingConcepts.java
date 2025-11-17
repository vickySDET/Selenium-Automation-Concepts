package day4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingConcepts {
	
	

	public static void main(String[] args) {
		
		   WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://google.com");

	        driver.manage().window().maximize();
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        Long x = (Long) js.executeScript("return window.pageXOffset;");
	        Long y = (Long) js.executeScript("return window.pageYOffset;");
	        
	        System.out.println("X Offset: " + x);
	        System.out.println("Y Offset: " + y);
	        
	        
	        driver.quit();
		
     
	}

}
