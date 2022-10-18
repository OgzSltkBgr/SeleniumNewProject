package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
        // degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String sayfaBasligi =driver.getTitle();
        String arananKelime="facebook";

        if (sayfaBasligi.contains(arananKelime)){
            System.out.println("Title facebook kelimesini iceriyor");
        }else{
            System.out.println("Title facebook kelimesini icermiyor" +
                    " Dogru title :"+driver.getTitle());
        }

       //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin
        String sayfaUrlsi=driver.getCurrentUrl();

        if (sayfaUrlsi.contains(arananKelime)){
            System.out.println("Sayfa Url'i facebook kelimesini iceriyor");
        }else{
            System.out.println("Sayfa Url'i facebook kelimesini icermiyor" +
                    "actual URL :"+driver.getCurrentUrl());
        }

       //4.https://www.walmart.com/sayfasina gidin.
        driver.get("https://www.walmart.com");

       //5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualBaslik = driver.getTitle();
        String arananKelime1="Walmart.com";

        if (actualBaslik.contains(arananKelime1)){
            System.out.println("Sayfa basligi Walmart.com kelimesini iceriyor");
        }else System.out.println("Sayfa basligi Walmart.com kelimesini icermiyor");

       //6.Tekrar “facebook” sayfasina donun
        driver.navigate().back();

       //7.Sayfayi yenileyin
        driver.navigate().refresh();

       //8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

       //9.Browser’i kapatin
        Thread.sleep(1000);
        driver.close();

    }
}
