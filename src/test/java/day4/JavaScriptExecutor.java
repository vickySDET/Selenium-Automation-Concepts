package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) {

		
		    WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://testautomationpractice.blogspot.com/");

	        driver.manage().window().maximize();
	        
	       WebElement namebox= driver.findElement(By.xpath("//input[@id=\"name\"]"));
	       
	       //passing the text using javascriptExecutor....
	       
	       JavascriptExecutor js = (JavascriptExecutor) driver;	
	       js.executeScript("arguments[0].value='Vicky';", namebox);
	       
	       
	       
	       //Clicking the radio button using javascriptexecutor 
	       
	      WebElement radiobtn=driver.findElement(By.xpath("//input[@id=\"male\"]"));
	      
	      js.executeScript("arguments[0].click()", radiobtn);
	      
	      System.out.println("Successfully click using javaScriptExecutor ");
	      
	      
	      driver.quit();
	       
	        
	}

}
