package Arise.POM;

import Arise.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Homepage extends BaseTest {

    @FindBy(xpath="//a[text()='Practice']") private List<WebElement> btnPractice;
    @FindBy(xpath="//a[text()='Test Login Page']") private List<WebElement> btnLoginPage;
    @FindBy(xpath="//h1[text()='Logged In Successfully']") private List<WebElement> txtLogin;

    public Homepage(){

        PageFactory.initElements(BaseTest.driver,this);
    }
   public void navigatesToLoginPage() throws Exception {
       WebDriverWait wait=new WebDriverWait(BaseTest.driver, Duration.ofMillis(2));
       wait.until(ExpectedConditions.visibilityOf(btnPractice.get(0))).click();
       wait.until(ExpectedConditions.visibilityOf(btnLoginPage.get(0))).click();
   }
   public void verifyTheLogin() throws Exception {
        if(txtLogin.size()>0){
           throw new Exception("page is not navigate to home page");
       }
     //  Assert.assertEquals(txtLogin.get(0).getText(),"Logged In Successfully");
    }

   }

