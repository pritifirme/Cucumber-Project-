package Arise.Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public static WebDriver driver;

    public static void launchBrowser() {
        ChromeOptions chrome = new ChromeOptions();
        chrome.setBrowserVersion("stable");
        WebDriver driver = new ChromeDriver(chrome);
        driver.get("https://practicetestautomation.com/");
        driver.manage().window().maximize();


    }
}
