package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        // driver.navigate().to() methodu sayfada ileri geri yapıcaksak kullanılır
        // driver.get() methodu gibi bizi istediğimiz url' götürür
        driver.navigate().to("https://mackolik.com");
        //Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back();
        // Tekrar mackolik sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().forward();
        // mackolik sayfasını yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.close();
    }
}
