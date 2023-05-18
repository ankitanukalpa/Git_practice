import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "/Users/GU20463639/Downloads/chromedriver_mac_arm64/chromedriver");
     WebDriver driver=new ChromeDriver();
     Actions a=new Actions(driver);
     
     driver.navigate().to("https://demoqa.com/buttons");
     Thread.sleep(5000);
     WebElement dc=driver.findElement(By.id("doubleClickBtn"));
     a.doubleClick(dc);
     Thread.sleep(5000);

     WebElement rc=driver.findElement(By.id("rightClickBtn"));
     a.contextClick(rc);
     Thread.sleep(5000);
//need to abspath for dynamically changing id
    WebElement c=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
    c.click();
    Thread.sleep(5000);
     a.perform();
     Thread.sleep(10000);
driver.close();

}
}
