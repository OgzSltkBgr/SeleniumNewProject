package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_02_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


      driver.get("https://youtube.com");

      WebElement ara =driver.findElement(By.xpath("//input[@name='search_query']"));

      Thread.sleep(2000);

      ara.sendKeys("ara");
      ara.submit();

      Thread.sleep(5000);
       WebElement ara1 =driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
       ara1.click();

    //  driver.get("https://izlesene.com");
    //  WebElement ara =driver.findElement(By.xpath("//input[@id='searchtext_top']"));
    //  ara.sendKeys("Zeynep Bastık",Keys.ENTER);
    //  Thread.sleep(5000);

    //  driver.findElement(By.xpath("//img[@alt='Zeynep Bastık - Şahaneyim']")).click();

        Thread.sleep(30000);
        driver.close();
    }
}
