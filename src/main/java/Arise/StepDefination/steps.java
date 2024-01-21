package Arise.StepDefination;

import Arise.POM.Homepage;
import Arise.POM.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
    LoginPage lp;
    @Given("Launch the browser and navigate to login page")
    public void launch_the_browser_and_navigate_to_login_page() throws Exception {

        Homepage hm=new Homepage();
        hm.navigatesToLoginPage();
      //  System.out.println("Launch the browser-->Step1");

    }
    @When("Enter the credentials")
    public void enter_the_valid_username_and_password(DataTable datatable) {

        LoginPage lp=new LoginPage();
     String username=datatable.asMaps().get(0).get("username");
     String password=datatable.asMaps().get(0).get("password");

     lp.enterCredentials(username,password);


    }
    @Then("Verify the user status")
    public void verify_the_user_status() throws Exception {

        Homepage hm=new Homepage();
        hm.verifyTheLogin();

    }





}
