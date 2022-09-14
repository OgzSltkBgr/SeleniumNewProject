package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu : "+driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(600,300));

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanın yeni Konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanın yeni Boyutu : "+driver.manage().window().getSize());

        //8. Sayfayi kapatin
        driver.close();
    }
}
