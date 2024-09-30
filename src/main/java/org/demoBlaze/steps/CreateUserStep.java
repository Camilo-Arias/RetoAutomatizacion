package org.demoBlaze.steps;

import net.thucydides.core.annotations.Step;
import org.demoBlaze.pages.CreateUserPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateUserStep extends CreateUserPage {

    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void openPageURL(String url) {
        getDriver().get(url);
    }

    public void clickSignUp() {
        waitForElementToBeVisible(btnSingUp);
        btnSingUp.click();
    }

    public void typeUser(String user) {
        waitForElementToBeVisible(inputUser);
        inputUser.sendKeys(user);
    }

    public void typePass(String pass) {
        inputPassword.sendKeys(pass);
    }

    public void clickSignUpForm() {
        waitForElementToBeVisible(btnSingUpForm);
        btnSingUpForm.click();
    }
}
