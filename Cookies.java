
import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/URUSERNAME/AppData/Local/Temp/Temp2_chromedriver_win32.zip/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://orteil.dashnet.org/cookieclicker/");
		
		driver.findElement(By.id("langSelect-EN")).click();
		Thread.sleep(5000);
		
		for(int i = 0; i < 100000; i++) {
		driver.findElement(By.xpath("//button[@id='bigCookie']")).click();
		}

	}

}
