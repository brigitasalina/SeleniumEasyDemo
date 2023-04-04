import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import java.time.Duration;

public class DemoSelenium {
    public WebDriver driver;

    @Test
    public void fillFormWithCorrectDataTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Brigita");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("Salina");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("brigita.salina@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("86455551212");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("k.skirpos 13-29");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("Kaunas");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")).sendKeys("Arkansas");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("49211");
       driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input")).sendKeys("www.facebook.lt");//nevaliduojam
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys("lalalalalal");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).click();

    }


    @Test
    public void correctFirstNameInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Brigita");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-ok"));
    }
    @Test
    public void correctLastNameInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("Salina");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-ok"));
    }
    @Test
    public void correctEmailInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("brigita.salina@gmail.com");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-ok"));
    }
    @Test
    public void correctPhoneNumberInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("8455551212");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-ok"));
    }
    @Test
    public void correctAddressInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("k.skirpos 13-29");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-ok"));
    }
    @Test
    public void correctCityInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("Kaunas");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-ok"));
    }
    @Test
    public void correctStateInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")).sendKeys("Arkansas");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-ok"));
    }
    @Test
    public void correctZipCodeInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("49211");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-ok"));
    }

    @Test
    public void correctProjectDescriptionInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys("bhgggghgguy");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-ok"));
    }
//    @Test
//    public void correctLabelClassInputTest(){
//        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
//        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]l")).("yes");
//        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).getAttribute("class"));
//        assertTrue(classes.contains("glyphicon-ok"));
//    }
    @Test
    public void NotCorrectFirstNameOneSymbolInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("b");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getText(), "Please enter more than 2 characters");
        String classes = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/i")).getAttribute("class");
        assertTrue(classes.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectFirstNameNoSymbolInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getText(), "Please enter more than 2 characters");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).getText(), "Please supply your first name");
        String classes = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/i")).getAttribute("class");
        assertTrue(classes.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectLastNameOneSymbolInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("s");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[1]")).getText(), "Please enter more than 2 characters");
        String classes = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/i")).getAttribute("class");
        assertTrue(classes.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectLastNameNoSymbolInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[1]")).getText(),"Please enter more than 2 characters");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).getText(), "Please supply your last name");
        String classes = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/i")).getAttribute("class");
        assertTrue(classes.contains("glyphicon-remove"));
    }

    @Test
    public void NotCorrectEmailInputTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("sa@");
        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/i")).getAttribute("class"));
        assertTrue(classes.contains("glyphicon-remove"));
    }


//    @Test
//    public void NotCorrectPhoneNumberInputTest(){
//        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
//        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("845");
//        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/i")).getAttribute("class"));
//        assertTrue(classes.contains("glyphicon-remove"));
//    }







    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.com.driver","drivers\\chromedriver111.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterClass
    public void afterClass(){
//        driver.quit();
    }

}
