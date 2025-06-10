package com.sprintTasks.pages;

import com.sprintTasks.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {



    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "check-box-windows")
    public WebElement inputUsername;

    @FindBy(id = "checkbox-macos")
    public WebElement inputPassword;

    @FindBy(id = "checkbox-linux")
    public WebElement loginButton;


    public void login(String username,String password){
        this.inputUsername.sendKeys(username);
        this.inputPassword.sendKeys(password);
        this.loginButton.click();
    }


}
