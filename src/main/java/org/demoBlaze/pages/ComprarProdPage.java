package org.demoBlaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComprarProdPage extends PageObject {

    @FindBy(xpath = "//a[.='Add to cart']")
    protected WebElement btnAddCart;

    @FindBy(id = "cartur")
    protected WebElement btnCart;

    @FindBy(xpath = "//button[.='Place Order']")
    protected WebElement btnOrder;

    @FindBy(id = "name")
    protected WebElement inpName;

    @FindBy(id = "country")
    protected WebElement inpCountry;

    @FindBy(id = "city")
    protected WebElement inpCity;

    @FindBy(id = "card")
    protected WebElement inpCard;

    @FindBy(id = "month")
    protected WebElement inpMonth;

    @FindBy(id = "year")
    protected WebElement inpYear;

    @FindBy(xpath = "//button[.='Purchase']")
    protected WebElement btnPurchase;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    protected WebElement lblConfirm;

    @FindBy(xpath = "//button[.='OK']")
    protected WebElement btnOK;

}
