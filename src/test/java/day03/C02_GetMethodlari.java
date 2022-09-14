package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasına gidiniz.
        driver.get("https://www.amazon.com");

        // Arama kutusuna locate ediniz.
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusunun tagName'inin input oldugunu test ediniz.
        aramaKutusu.getTagName();
        String tagName="input";

        if (aramaKutusu.getTagName().equals(tagName)){
            System.out.println("TagName input");
        }else {
            System.out.println("TagName input degil. Actual tagName : "+ aramaKutusu.getTagName());
        }

        // Arama kutusunun name attribute degerinin field-keywords oldugunu test ediniz.
        String attribute="field-keywords";
        String actualAttiribute=aramaKutusu.getAttribute("name");

        if (actualAttiribute.equals(attribute)){
            System.out.println("Attribute testi pass");
        }else {
            System.out.println("Attirbute degeri field-keywords degil. Actual attirbute : "+ actualAttiribute);
        }

        // Arama kutusunun konumunu yazdırınız
        System.out.println("aramaKutusu.getLocation() = " + aramaKutusu.getLocation());


        driver.close();
    }
}
