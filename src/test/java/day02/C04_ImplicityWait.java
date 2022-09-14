package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ImplicityWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://galatasaray.org");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        İleride wait konusunu daha geniş olarak ele alacağız
        Bir sayfayı açarken ilk başta sayfanın içerisinde bulunan elementlere göre bir yükleme
        süresine ihtiyaç vardır veya bir web elementin kullanılabilmesi için zamana ihtiyaç olabilir.
        implicityWait bize sayfanın yüklenmesii ve sayfadaki elementlere ulaşım için beklenecek
        Max sureyi belirleme olanağı tanır
         */


        driver.close();
    }
}
