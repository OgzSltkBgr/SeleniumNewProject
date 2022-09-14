package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonGiftCard {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        //2 https://www.amazon.com/ adresine gidin
        driver.get("https://amazon.com");
        
        //        3 Browseri tam sayfa yapin
        //        4 Sayfayi "refresh" yapin
        driver.navigate().refresh();

        //        5 Sayfa basliginin "Spend less" ifadesi icerdigini test edin
        String sayfaBasligi= driver.getTitle();
        String expectedBaslik="Spend less";

        if (sayfaBasligi.contains(expectedBaslik)) {
            System.out.println("Sayfa basligi spend less içeriyor");
        }else {
            System.out.println("Sayfa basligi spend less içermiyor");
        }

        //        6 Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        //        7 Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();

        //        8 Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();

        //        9 Gift card details'den 25 $'i secin
        WebElement gitfCard =driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]"));
        gitfCard.click();

        //        10 Urun ucretinin 25$ oldugunu test edin
        String urunUcreti =driver.findElement(By.xpath("        (//span[text()='$25.00'])[2]")).getText();


        if (urunUcreti.contains("$25")){
            System.out.println("Urun ucreti $25");
        }else{
            System.out.println("Urun ucreti $25 degil");
        }

        //        11 Sayfayi kapatin
        driver.close();
    }
    
            
           
}
