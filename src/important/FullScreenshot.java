package important;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File trg = new File(".\\Screenshots\\homepage.png");
	FileUtils.copyFile(src, trg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
