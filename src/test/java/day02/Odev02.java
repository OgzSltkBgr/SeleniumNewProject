package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.
        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        String actualTitle=driver.getTitle();
        String searchWords="youtube";

        if (actualTitle.equals(searchWords)){
            System.out.println("Sayfa basligi youtube");
        }else {
            System.out.println("Sayfa basligi youtube degil, Actual Title : "+actualTitle);
        }

        //3. Sayfa URL’sinin “youtube” içerip içermediğini
        //(contains) doğrulayın, içermiyorsa doğru URL’yi yazdırın.
        String currentUrl =driver.getCurrentUrl();

        if (currentUrl.contains(searchWords)){
            System.out.println("Sayfa URL'i youtube kelimesini iceriyor");
        }else{
            System.out.println("Sayfa URL'i youtube kelimesini icermiyor, dogru URL :"+currentUrl);
        }

        //4. Daha sonra
        //Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://galatasaray.org");
        Thread.sleep(2000);

        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(2000);

        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(2000);

        //7. Amazon sayfasina donun
       driver.navigate().forward();
       //Thread.sleep(2000);

        //8.Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

        //9. Ardından sayfa başlığının “Amazon” içerip içermediğini (contains) doğrulayın,Yoksa doğru başlığı(Actual Title) yazdırın.
        String title=driver.getTitle();
        String searchWords1="Amazon";
        Thread.sleep(4000);

        if (title.contains(searchWords1)){
            System.out.println("Sayfa title i Amazon kelimesini iceriyor.");
        }else{
            System.out.println("Sayfa title i Amazon kelimesini icermiyor. Dogru title : "+actualTitle);
        }
        //10.Sayfa URL’sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL’yi yazdırın
        String url =driver.getCurrentUrl();
        String searchUrl = "https://www.amazon.com";

        if (url.equals(searchUrl)){
            System.out.println("Sayfa URL'i https://www.amazon.com");
        }else {
            System.out.println("Sayfa URL'i https://www.amazon.com degil, currentUrl : "+currentUrl);
        }
        //11. Sayfayi kapatin

        driver.close();
    }
}
