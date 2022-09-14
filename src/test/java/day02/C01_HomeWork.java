package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi "+driver.getTitle());

        //Sayfa basliginin "Amazon" icerdigini test edin
        String title = driver.getTitle();
        String istenenKelime = "Amazon";

        if (title.contains(istenenKelime)){
            System.out.println("Kelime testi PASS");
        }else{
            System.out.println("Kelime testi FAILED");
        }

        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Adresi : " +driver.getCurrentUrl());

        //Sayfa url'inin "amazon" icerdigini test edin.
        String url=driver.getCurrentUrl();
        String urlİstenen="amazon";

        if (url.contains(urlİstenen)){
            System.out.println("Url kelime testi PASS");
        }else{
            System.out.println("Url kelime testi FAILED");
        }

        //Sayfa handle degerini yazdirin
        System.out.println("Sayfa handle degeri : "+driver.getWindowHandle());

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String handle=driver.getPageSource();
        String handleIstenen="Gateway";

        if (handle.contains(handleIstenen)){
            System.out.println("Handle HTML testi PASS");
        }else{
            System.out.println("Handle HTML testi FAILED");
        }

        //Sayfayi kapatin.
        driver.close();
    }
}
