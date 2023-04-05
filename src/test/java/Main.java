import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.operadriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com");  // demoqa.com sitesine gitmek için get komutu kullanıldı.
        driver.manage().window().maximize(); // pencere boyutu büyütüldü.

        // scroll işlemi bu kod parcacığı ile yapıldı:
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("0,300");

        WebElement click = driver.findElement(By.cssSelector("path"));
        click.click();

        WebElement webTables = driver.findElement(By.xpath("//span[normalize-space()='Web Tables']"));
        webTables.click();

        WebElement buttonAdd = driver.findElement(By.id("addNewRecordButton"));
        buttonAdd.click();

        WebElement firstName= driver.findElement(By.cssSelector(".form-control[placeholder=\"First Name\"]"));
        firstName.click();
        firstName.sendKeys("Murat");

        WebElement lastName= driver.findElement(By.cssSelector(".form-control[placeholder=\"Last Name\"]"));
        lastName.click();
        lastName.sendKeys("Bektas");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        eMail.click();
        eMail.sendKeys("mb@outlook.com");

        WebElement age = driver.findElement(By.cssSelector(" .form-control[placeholder=\"Age\"]"));
        age.click();
        age.sendKeys("22");

        WebElement salary = driver.findElement(By.cssSelector(".form-control[placeholder=\"Salary\"]"));
        salary.click(); salary.sendKeys("1200");

        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.click();
        department.sendKeys("Test Otomasyon");

        WebElement submit = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        submit.click();

        driver.quit();


    }
}