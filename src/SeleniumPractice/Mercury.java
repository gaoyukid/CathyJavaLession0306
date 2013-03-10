package SeleniumPractice;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Mercury {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		File file = new File("D:/testing/Selenium/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver webdriver = new InternetExplorerDriver(ieCapabilities);
		webdriver.get("http://newtours.demoaut.com/mercuryreservation.php");
		System.out.println("open Mercury");
		
		WebElement UserName=null;
        WebElement Password=null;
        WebElement Signin=null;
		WebElement SearchVPoint;
		
        UserName=webdriver.findElement(By.xpath("//td[2]/input"));
        UserName.clear();
        UserName.sendKeys("mercury");
     
        Password=webdriver.findElement(By.xpath("//tr[3]/td[2]/input"));
        Password.clear();
        Password.sendKeys("mercury");
      
        Signin=webdriver.findElement(By.xpath("//td[2]/div/input"));
        Signin.click();
        
        Thread.sleep(10000);
        
		SearchVPoint=webdriver.findElement(By.xpath("//font/b"));
        if(SearchVPoint.getText().contains("Flight Details")){
        	System.out.println("the flight finder page is opened successful!");
        }
        else{
        	System.out.println("maybe some issues happened when open the flight finder page.");
        }

        List<WebElement>TripType=webdriver.findElements(By.name("tripType" ));
        for(WebElement item:TripType){
        	if(item.getText().equals("oneway")){
        		item.click();
                System.out.println("select one way as trip type successfully");
       	 }
        	else{
        		System.out.println("select one way as trip type failed");
        	}
        }
        System.out.println("finish select trip type");
        
	}

}
