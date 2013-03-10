package SeleniumPractice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class SelectPractice {

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
		webdriver.get("http://www.baidu.com");
		System.out.println("open baidu");
		
//      1 使用find element & by需找单个对象
		WebElement Searchtext=null;
		WebElement SearchButton;
		WebElement SearchVPoint;
		
		Searchtext=webdriver.findElement(By.id("kw"));		
		System.out.println("found search textfield");
		Searchtext.sendKeys("selenium");
		
		SearchButton=webdriver.findElement(By.id("su"));
		SearchButton.click();
		System.out.println("search for selenium");
		
		Thread.sleep(5000);
			
		SearchVPoint=webdriver.findElement(By.xpath("//h3/a"));
        if(SearchVPoint.getText().contains("百度百科")){
        	System.out.println("search function is successful!");
        }
        else{
        	System.out.println("maybe some issues happened...");
        }
	
        webdriver.close();
        System.out.println("closed");
	}

}
