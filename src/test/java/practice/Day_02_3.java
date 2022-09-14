package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day_02_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");
        // id ile
     //  WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
     //  aramaKutusu.sendKeys("Nutella");

        //xPath ile
        //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Nutella"+ Keys.ENTER);

        //driver.findElement(By.linkText("Sell products on Amazon")).click();

        // Amazon sayfasındaki tag'ların sayısını yazdırınız
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("a tag inin sayisi : "+tag.size());

        Thread.sleep(2000);
        driver.close();
    }
}
