package com.sprintTasks.step_definitions;

import com.sprintTasks.pages.LoginPage;
import com.sprintTasks.utilities.BrowserUtils;
import com.sprintTasks.utilities.ConfigurationReader;
import com.sprintTasks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class LoginPage_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("I enter {string} as username, enter {string} as password")
    public void i_enter_as_username_enter_as_password(String userName, String password) {
        loginPage.inputUsername.sendKeys(userName);
        loginPage.inputPassword.sendKeys(password);

    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String string) {
        loginPage.loginButton.click();
        // actions.moveToElement(loginPage.loginButton).click().perform();

    }

    @Then("I should be able to login and see the dashboard")
    public void i_should_be_able_to_login_and_see_the_dashboard() {

        BrowserUtils.sleep(2);
        String currentURL = Driver.getDriver().getCurrentUrl();
        String expectedInURL = "stream";
        Assert.assertTrue(currentURL.contains(expectedInURL));


    }

    @Given("the <role> user is logged in")
    public void theRoleUserIsLoggedIn() {
        
    }

    @And("the user is on the download page")
    public void theUserIsOnTheDownloadPage() {
        
    }

    @When("the user selects {int} desktop versions")
    public void theUserSelectsDesktopVersions(int arg0) {
    }
}
