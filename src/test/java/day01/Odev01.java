package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Amazon Sayfasına gidelim
        driver.get("https://amazon.com");

        // Sayfa baslığını yazdırın
        System.out.println("Sayfa Basligi " +driver.getTitle());
    }
}
