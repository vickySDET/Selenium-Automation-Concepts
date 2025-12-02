package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCapture {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Apple website
        driver.get("https://www.apple.com");

        // Capture all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

        System.out.println("Total Links: " + allLinks.size());

        // Print link text + URL
        for (WebElement link : allLinks) {
            System.out.println(link.getText() + " --> " + link.getAttribute("href"));
        }

        driver.quit();
    }
	}

