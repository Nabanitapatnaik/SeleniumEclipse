import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	/*String	Expected_Result ="Connect with friends and the world around you on Facebook.";
	String Actual_Result = driver.findElement(By.xpath("//h2[text()='Connect with friends and the world around you on Facebook.']")).getText();
		
		if(Actual_Result.equals(Expected_Result))
		{
		 
			System.out.println("TC passed");
			
			
		}
		else
			
		{
			System.out.println("TC failed");
			
		}
		}*/
		
		driver.findElement(By.id("email")).sendKeys("nabanitapatnaik@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		String Expected_Result = "The password you’ve entered is incorrect. Forgot Password?";
		String Actual_Result=driver.findElement(By.xpath("//div[contains(text(),'The password you’ve entered is incorrect. ')]")).getText();
		System.out.println(Actual_Result);
		if(Actual_Result.equals(Expected_Result))
		
		{
			System.out.println("The TC is passed");
		}
		
		else
		{
			System.out.println("The TC is failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}	

	}


