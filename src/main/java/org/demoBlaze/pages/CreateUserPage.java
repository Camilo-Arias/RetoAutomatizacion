package org.demoBlaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateUserPage extends PageObject {

    @FindBy(id = "signin2")
    protected WebElement btnSingUp;

    @FindBy(id = "sign-username")
    protected WebElement inputUser;

    @FindBy(id = "sign-password")
    protected WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign up']")
    protected WebElement btnSingUpForm;


}
