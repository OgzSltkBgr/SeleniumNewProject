package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String istenenKelime = "Amazon";
        String arananKelime = "amazon";


     //   1- Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        driver.get("https://mackolik.com");
      //  2- Başlığın Amazon içeridğini test ediniz
        if (driver.getTitle().contains(istenenKelime)){
            System.out.println("getTitle testi PASSED");
        }else System.out.println("getTitle testi FAILED");

      //  3- URL nin amazon içerdiğini test ediniz
        if (driver.getCurrentUrl().contains(arananKelime)){
            System.out.println("getCurrentUrl testi PASSED");
        }else System.out.println("getCurrentUrl testi FAILED");

      //  4- Sayfayı kapatınız
        driver.close();
    }
}
