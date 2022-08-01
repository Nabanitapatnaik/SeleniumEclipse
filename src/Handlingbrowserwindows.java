import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingbrowserwindows {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		/*//getWindow handle
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//String winI = driver.getWindowHandle();
		//System.out.println(winI); //CDwindow-BF70080C573C8DE38D7945B8FCC8782B
		
		//getWindowHandles
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> winid = driver.getWindowHandles();
		
		Iterator<String>it =  winid.iterator();
		String parent = it.next();
		String child = it.next();
		System.out.println("Parent id is:"+parent);
		System.out.println("Child id is:"+child);
		*/
		
		driver.get("https://www.novatesoft.io/");
		String win = driver.getWindowHandle();
		//System.out.println(win);//CDwindow-3AB626B61CEDABEA3680D495D9605830
		driver.findElement(By.xpath("//i[@class='fab fa-facebook-square']")).click();
		Set<String> han = driver.getWindowHandles();
		Iterator<String> it = han.iterator();
		String parent = it.next();
		String child = it.next();
		System.out.println("Parent id is:"+parent);
		System.out.println("Child id is:"+child);
        
		//Parent id is:CDwindow-5515D72F34556823C08FC2D30C68ABAF
		//Child id is:CDwindow-9AC923F608B323C9759D11CEE8892736
		
		driver.switchTo().window(parent);
		System.out.println("Titele is:" +driver.getTitle());

		driver.switchTo().window(child);
		System.out.println("Titele is:" +driver.getTitle());
        
        /*driver.get("http://heydaycs.com/");
        driver.findElement(By.xpath("//i[@class='fa fa-facebook']")).click();
       Set<String> hey =  driver.getWindowHandles();
       Iterator<String> id = hey.iterator();
       String parent = id.next();
       String child = id.next();
       System.out.println("Parent id is:"+parent);
		System.out.println("Child id is:"+child);*/
	
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
