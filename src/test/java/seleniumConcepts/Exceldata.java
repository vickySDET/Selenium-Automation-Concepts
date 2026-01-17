package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceldata {

	public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://digival-staging-nginx-ds-yk25kmkzeq-el.a.run.app/staging1-dsweb/login");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("digiproductsadmin@digi.com");
       // driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
        
        driver.findElement(By.xpath("//button[normalize-space()='login']")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//img[@alt=\"DigiClass - Admin\"]")).click();
	
	
	
}
}