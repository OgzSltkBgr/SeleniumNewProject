package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//button['Add Element']")).click();

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton =driver.findElement(By.xpath("(//button['Delete'])[2]"));

        if (deleteButton.isDisplayed()){
            System.out.println("Delete button u testi pass");
        }else {
            System.out.println("Delete button u testi Fail");
        }

        //Delete tusuna basin
        deleteButton.click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemove=driver.findElement(By.xpath("//h3"));

        if (addRemove.isDisplayed()){
            System.out.println("Add/Remove Elements test PASS");
        }else {
            System.out.println("Add/Remove Elements testi FAIL");
        }

        Thread.sleep(5000);
        driver.close();
    }
}
