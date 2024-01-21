package Arise.POM;

import Arise.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {

    @FindBy(xpath="//input[@name='username']") private WebElement inpUserName;
    @FindBy(xpath="//input[@name='password']") private WebElement inpPassword;
    @FindBy(xpath = "//input[@id='submit']") private WebElement btnSubmit;
    @FindBy(xpath="div[@id='error']") private WebElement txtLoginError;

    public LoginPage(){

        PageFactory.initElements(BaseTest.driver,this);
    }

    public void enterCredentials(String username,String password){

        WebDriverWait wait=new WebDriverWait(BaseTest.driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOf(inpUserName)).sendKeys("username");
        wait.until(ExpectedConditions.visibilityOf(inpPassword)).sendKeys("password");
        wait.until(ExpectedConditions.visibilityOf(btnSubmit)).click();
    }
    public void verifythewrongcredentials() throws Exception {
        WebDriverWait wait=new WebDriverWait(BaseTest.driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOf(txtLoginError));
      //  Assert.assertEquals(txtLoginError.getText(),"Your username is invalid!");
        if(!(txtLoginError.getText().contains("is invalid!"))){
            throw new Exception("it's not showing the error msg");
        }

    }

}
