import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoloProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		//driver.manage().window().maximize();
		//driver.getTitle();
		//System.out.println("\"https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp\")");
		//driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());

	driver.get("https://www.facebook.com/r.php");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Naba");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pat");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9802569387");
	
		
		
		
		
		

	}

}
