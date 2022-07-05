package SeleniumFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumFirstProject {
	
	 //Browser properties
	   
    // chrome ==> webdriver.chrome.driver
    // firefox ==> webdriver.gecko.driver
    // edge ==> webdriver.edge.driver
   
    //Launch Browser window
   
    //chrome ==> new ChromeDriver();
    //firefox ==> new FirefoxDriver();
    //edge ==> new EdgeDriver();

	public static void main(String[] args) {
		//1.Launch Browser(Browser=chrome)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navya\\eclipse-workspace\\SeleniumFirst\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        //2. Maximize the browser window
        driver.manage().window().maximize();
        
        //3.delete all the cookies
        driver.manage().deleteAllCookies();
        
        //4. Launch the application(URL=https://parabank.parasoft.com/parabank/index.htm)
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
       
        //5.close the application
        driver.quit();
        
	}

}
