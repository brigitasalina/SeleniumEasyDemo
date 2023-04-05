import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import java.time.Duration;

public class DemoSelenium {
    public WebDriver driver;

    @Test(priority = -1)
    public void fillFormWithCorrectDataTest(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Brigita");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("Salina");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("brigita.salina@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("8455551212");
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
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Brigita");
        String name = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/i")).getAttribute("class"));
        assertTrue(name.contains("glyphicon-ok"));
    }
    @Test
    public void NotCorrectFirstNameOneSymbolInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("b");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getText(), "Please enter more than 2 characters");
        String name = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/i")).getAttribute("class");
        assertTrue(name.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectFirstNameNoSymbolInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getText(), "Please enter more than 2 characters");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).getText(), "Please supply your first name");
        String name= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/i")).getAttribute("class");
        assertTrue(name.contains("glyphicon-remove"));
    }
    @Test
    public void correctLastNameInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("Salina");
        String lastName = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/i")).getAttribute("class"));
        assertTrue(lastName.contains("glyphicon-ok"));
    }
    @Test
    public void NotCorrectLastNameOneSymbolInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("s");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[1]")).getText(), "Please enter more than 2 characters");
        String lastName = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/i")).getAttribute("class");
        assertTrue(lastName.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectLastNameNoSymbolInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[1]")).getText(),"Please enter more than 2 characters");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).getText(), "Please supply your last name");
        String lastName = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/i")).getAttribute("class");
        assertTrue(lastName.contains("glyphicon-remove"));
    }
    @Test
    public void correctEmailInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("brigita.salina@gmail.com");
        String email = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/i")).getAttribute("class"));
        assertTrue(email.contains("glyphicon-ok"));
    }
    @Test
    public void NotCorrectEmailInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("sa@");
        String email = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/i")).getAttribute("class"));
        assertTrue(email.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectEmptyEmailInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[1]")).getText(),"Please supply your email address");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[2]")).getText(),"Please supply a valid email address");
        String email = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/i")).getAttribute("class"));
        assertTrue(email.contains("glyphicon-remove"));
    }
    @Test
    public void correctPhoneNumberInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("8455551212");
        String phoneNumber = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/i")).getAttribute("class"));
        assertTrue(phoneNumber.contains("glyphicon-ok"));
    }
    @Test
    public void NotCorrectPhoneNumberInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("845");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getText(),"Please supply a vaild phone number with area code");
        String phoneNumber = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/i")).getAttribute("class"));
        assertTrue(phoneNumber.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectEmptyPhoneNumberInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[1]")).getText(),"Please supply your phone number");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getText(),"Please supply a vaild phone number with area code");
        String phoneNumber = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/i")).getAttribute("class"));
        assertTrue(phoneNumber.contains("glyphicon-remove"));
    }
    @Test
    public void correctAddressInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("k.skirpos 13-29");
        String address = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/i")).getAttribute("class"));
        assertTrue(address.contains("glyphicon-ok"));
    }
    @Test
    public void NotCorrectAddressOneCharacterInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("mo");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[1]")).getText(),"Please enter more than 8 characters");
        String address = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/i")).getAttribute("class"));
        assertTrue(address.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectAddressNoSymbolInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[1]")).getText(),"Please enter more than 8 characters");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[2]")).getText(),"Please supply your street address");
        String address = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/i")).getAttribute("class"));
        assertTrue(address.contains("glyphicon-remove"));
    }
    @Test
    public void correctCityInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("Kaunas");
        String city = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/i")).getAttribute("class"));
        assertTrue(city.contains("glyphicon-ok"));
    }
    @Test
    public void NotCorrectCityNameOneCharacterInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("d");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[1]")).getText(),"Please enter more than 4 characters");
        String city = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/i")).getAttribute("class"));
        assertTrue(city.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectEmptyCityNameInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[1]")).getText(),"Please enter more than 4 characters");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[2]")).getText(),"Please supply your city");
        String city = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/i")).getAttribute("class"));
        assertTrue(city.contains("glyphicon-remove"));
    }
    @Test
    public void correctStateInputTest(){
        driver.findElement(By.name("state")).click();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select/option[4]")).click();
    }
//    @Test
//    public void NotCorrectEmptyStateFieldInputTest(){
//        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
//        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")).sendKeys(" ");
//        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/small")).getText(),"Please select your state");
//        String classes = (driver.findElement(By.xpath("///*[@id=\"contact_form\"]/fieldset/div[7]/div/i")).getAttribute("class"));
//        assertTrue(classes.contains("glyphicon-remove"));
//    }
    @Test
    public void correctZipCodeInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("49211");
        String zipCode = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/i")).getAttribute("class"));
        assertTrue(zipCode.contains("glyphicon-ok"));
    }
    @Test
    public void NotCorrectZipCodeOneNumberInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("3");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/small[2]")).getText(),"Please supply a vaild zip code");
        String zipCode = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/i")).getAttribute("class"));
        assertTrue(zipCode.contains("glyphicon-remove"));
    }
    @Test
    public void correctProjectDescriptionInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys("bhgggghgguy");
        String projectDescription = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/i")).getAttribute("class"));
        assertTrue(projectDescription.contains("glyphicon-ok"));
    }
    @Test
    public void NotCorrectProjectDescriptionOneSymbolInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys("f");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[1]")).getText(),"Please enter at least 10 characters and no more than 200");
        String projectDescription = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/i")).getAttribute("class"));
        assertTrue(projectDescription.contains("glyphicon-remove"));
    }
    @Test
    public void NotCorrectProjectDescriptionEmptySymbolInputTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[1]")).getText(),"Please enter at least 10 characters and no more than 200");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[2]")).getText(),"Please supply a description of your project");
        String projectDescription = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/i")).getAttribute("class"));
        assertTrue(projectDescription.contains("glyphicon-remove"));
    }
//    @Test
//    public void correctLabelClassInputTest(){
//        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
//        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]l")).("yes");
//        String classes = (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div")).getAttribute("class"));
//        assertTrue(classes.contains("glyphicon-ok"));
//    }
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.com.driver","drivers\\chromedriver111.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @BeforeMethod
    public void beforeMethod(){
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
    }

    @AfterClass
    public void afterClass(){
//        driver.quit();
    }

}
