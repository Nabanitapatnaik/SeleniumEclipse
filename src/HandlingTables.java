import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		//driver.manage().window().maximize();
		//Thread .sleep(3000);
		
		//How many rows in a table?
		
		//int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		//System.out.print("Total Rows:"+rows);
		 
		//How many columns in a table?
		//int col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		//System.out.print("Total colums:"+col);
		
		//Retrieve specific row or column data?
		
	//String value=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]")).getText();
	//System.out.print("The value is:"+value);
		
	//String values=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[7]/td[2]")).getText();
	//System.out.print("The value is:"+values);
		
		//String Company=driver.findElement(By.xpath("//table[@id='customers']/tbody//tr//td[contains (text(),'Google')]")).getText();
		//System.out.print("The name is:"+Company);

			
			
		/*	driver.get("https://demo.guru99.com/test/web-table-element.php");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
		int row	=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")).size();
		System.out.println("Total rows:"+row); //26 rows
		int col	=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td")).size();
		System.out.println("Total columns:"+col); //130 columns
		//driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td//a[contains(text(),'HDIL')]//following::td[4]"));

	String Value=driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr//a[contains(text(),'Kwality')]//following::td[1]")).getText();

System.out.println("The value is:"+ Value);
*/
		
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	//int row = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr")).size();
	//System.out.println("The total number of rows are:"+row);
		
	//int col = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//td")).size();
	//System.out.println("The total number of columns are:"+col);
		
	//int row = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
    //System.out.println("The total number of rows are:"+row);

    //int col = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th")).size();
	//System.out.println("The total number of columns are:"+ col);
	
	//WebElement Value = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr//td[contains(text(),'Google')]"));
			//System.out.println(Value.getText()+" ");
		
		
//WebElement Values =driver.findElement(By.xpath("//table[@id='customers']"));
//System.out.println(Values.getText()+ "   ");
		
//System.out.println("Total rows = "+driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size());
//String Retrieve	=driver.findElement(By.xpath("//table[@id='customers']")).getText();

	
System.out.println("Total rows :" +driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr")).size()
);	
	
	
	System.out.println("Total columns :"+driver.findElements(By.xpath("//table[@class='tsc_table_s13']//thead//th")).size()
			);
	
//System.out.println("Retrieve Table:" + driver.findElement(By.xpath("//table[@class='tsc_table_s13']")).getText());
	
	
	System.out.println("Data:" + driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody//th[contains(text(),'Clock')]//following::td[3]")).getText() );
	
	
	
		
	}

}
