package org.demoBlaze.steps;

import net.serenitybdd.core.pages.PageObject;
import org.demoBlaze.pages.ComprarProdPage;
import org.demoBlaze.utilities.ActionsWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComprarProdStep extends ComprarProdPage {

    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    private ActionsWeb actionsWeb;

    public void confirmarPedido() {
        waitForElementToBeVisible(btnAddCart);
        actionsWeb.posicionarElementoScroll(btnAddCart);
        actionsWeb.bordearElemento(btnAddCart);
        btnAddCart.click();
        actionsWeb.aceptarAlerta();
        waitForElementToBeVisible(btnCart);
//        getDriver().switchTo().alert().accept();
        actionsWeb.posicionarElementoScroll(btnCart);
        actionsWeb.bordearElemento(btnCart);
        btnCart.click();
        waitForElementToBeVisible(btnOrder);
        actionsWeb.posicionarElementoScroll(btnOrder);
        actionsWeb.bordearElemento(btnOrder);
        btnOrder.click();
    }

    public  void formulario(String name, String country, String city, String card, String month, String year) {
        waitForElementToBeVisible(btnPurchase);

        inpName.sendKeys(name);
        inpCountry.sendKeys(country);
        inpCity.sendKeys(city);
        inpCard.sendKeys(card);
        inpMonth.sendKeys(month);
        inpYear.sendKeys(year);

        actionsWeb.posicionarElementoScroll(btnPurchase);
        actionsWeb.bordearElemento(btnPurchase);
        btnPurchase.click();
        actionsWeb.posicionarElementoScroll(btnOK);
        actionsWeb.bordearElemento(btnOK);

        btnOK.click();
//        actionsWeb.aceptarAlerta();
//        getDriver().switchTo().alert().accept();
    }
}
