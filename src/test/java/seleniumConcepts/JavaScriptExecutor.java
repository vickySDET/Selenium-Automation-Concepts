package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		
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
	      
	      
	      //Scrolling to the particular Element 
	      
	     WebElement ele=driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
	     
	     js.executeScript("arguments[0].scrollIntoView(true);", ele);
	     
	     Thread.sleep(3000);
	     
	     System.out.println(js.executeScript("return window.pageYOffset;"));
	     
	     //Zooming the page as per user requirement 
	     js.executeScript("document.body.style.zoom='50%';");
	     
	     Thread.sleep(4000);
	      
	      
	      driver.quit();
	       
	        
	}

}
