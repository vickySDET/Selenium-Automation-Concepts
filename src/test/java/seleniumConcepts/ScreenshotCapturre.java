package seleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapturre {

	public static void main(String[] args) throws IOException {
		
		    WebDriver driver = new ChromeDriver();
	        driver.get("https://google.com");
	        
	        
	        // Generate timestamp
	        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());

	        // Take Screenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;

	        File src = ts.getScreenshotAs(OutputType.FILE);
	        
	        // Create destination path inside project folder
	        String path = System.getProperty("user.dir") + "/Screenshots/screenshot_" + timestamp + ".png";

	        // Store in laptop
	        // Create your desired folder path here
	       // File dest = new File("C:\\screenshot\\Desktop\\Screenshots\\google.png");
	        
	        File dest = new File(path);

	        // Create folder if not exists
	        dest.getParentFile().mkdirs();

	        FileUtils.copyFile(src, dest);
	        
	        System.out.println("Screenshot saved at: " + path);

	       // System.out.println("Screenshot saved successfully!");

	        driver.quit();
	    }
	}




