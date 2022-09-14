package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_02_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumunu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari :"+driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(10,10));
        driver.manage().window().setSize(new Dimension (800,400));

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Setden sonra sayfanin konumunu :"+driver.manage().window().getPosition());
        System.out.println("Setden sonra sayfanin boyutlari :"+driver.manage().window().getSize());

        //8. Sayfayi kapatin
        driver.close();
    }
}
