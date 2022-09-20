package practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GMIBankLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1) https://www.gmibank.com/ adresine gidin
        driver.get("https://www.gmibank.com/");

        // 2) sign in butonuna tıklyanız
        driver.findElement(By.xpath("(//a[@class='dropdown-toggle nav-link'])[2]")).click();
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();

        // 3) Usernam: Batch81 password Batch81+
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch81");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Batch81+", Keys.ENTER);
        //driver.findElement(By.xpath("(//span[text()='Sign in'])[3]")).submit();

        Thread.sleep(2000);
        driver.close();
    }
}
