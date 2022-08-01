package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part6 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		List<WebElement> topics = driver.findElements(By.xpath("//div[@class='footer']"));

		for (WebElement list : topics) {
			String reference = list.getText();
			System.out.println(reference);

		}

	}

}
