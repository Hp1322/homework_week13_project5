package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class UserSignIn extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField = By.name("user[email]");
    By passField = By.id("user[password]");
    By loginButton = By.xpath("//body/main[@id='main-content']/div[1]/div[1]/article[1]/form[1]/div[4]/input[1]");
    By invalidMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void sendEmail(String mail){
        sendTextToElement(emailField, mail);
    }
    public void sendPassWord(String pass){
        sendTextToElement(passField, pass);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getInvalidMessage(){
        return getTextFromElement(invalidMessage);
    }


}
