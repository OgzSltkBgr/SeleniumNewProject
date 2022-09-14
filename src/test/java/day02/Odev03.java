package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Odev03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // ödev3
        //ClasslassWork : L oginoginTest
        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        driver.findElement(By.xpath("//*[@id=\"sign-in\"]")).click();
        Thread.sleep(3000);

        /////////////////////////////////////////////////////////////////////////////////////////////////////

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz
        driver.findElement(By.id("session_email")); // email-textbox
        driver.findElement(By.id("session_password")); // password-textbox
        driver.findElement(By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input"));// sign-in

        /////////////////////////////////////////////////////////////////////////////////////////////////////

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        driver.findElement(By.xpath("//*[@id=\"sign-in\"]")).click();
        Thread.sleep(2000);

        WebElement sigInKutusu=driver.findElement(By.xpath("//*[@id=\"session_email\"]"));
        sigInKutusu.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);

        WebElement passwordKutusu=driver.findElement(By.xpath("//*[@id=\"session_password\"]"));
            passwordKutusu.sendKeys("Test1234!");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input")).click();

        /////////////////////////////////////////////////////////////////////////////////////////////////////

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement signOutButton = driver.findElement(By.xpath("(//a[@class='nav-item nav-link'])[2]"));

        if (signOutButton.isDisplayed()) {
            System.out.println("user mail: testtechproed@gmail.com");
        } else {
            System.out.println("user mail: testtechproed@gmail.com degil");
        }

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.xpath("//a[@data-test='addresses']"));
        WebElement signOut = driver.findElement(By.xpath("//a[@data-test='sign-out']"));

        if (addresses.isDisplayed() && signOut.isDisplayed()) {
            System.out.println("Addresses ve Sign Out textleri isDisplayed.");
        } else {
            System.out.println("Addresses ve Sign Out textleri notDisplayed.");
        }

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki link sayisi: " + webElements.size() );


        Thread.sleep(3000);
        driver.close();
    }
}
