package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day_4_Odev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna 10 kez basinız
        int ilk=0;
        int son=10;
        while(ilk<son){
            driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        ilk++;
        }
        // 3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> deleteButton =driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));

        if(deleteButton.size()==10){
            System.out.println("Add Element butonuna 10 kez basildi");
        }else{
            System.out.println("Add Element butonuna 10 kez basilmadi");
        }
       // 4 - Delete butonuna görünmeyene kadar basınız
        WebElement deleteButtonWE=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        while(son<ilk){
            deleteButtonWE.click();
            son--;
        }
        // 5- Delete butonunun görünmediğini test ediniz

        if (deleteButtonWE.isDisplayed()){
            System.out.println("Delete butonu gorunur degil");
        }else{
            System.out.println("Delete butonu gorunur");
        }
        //6- Sayfayı kapatınız
        driver.close();
    }

}
