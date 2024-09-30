package org.demoBlaze.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.demoBlaze.pages.ComprarProdPage;
import org.demoBlaze.steps.ComprarProdStep;
import org.demoBlaze.utilities.ActionsWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComprarProdDef extends ComprarProdPage {

    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    private ActionsWeb actionsWeb;
    private ComprarProdStep comprarProdStep;

    @When("Seleccionar {string} compra y {string} a comprar")
    public void seleccionar_compra_y_a_comprar(String category, String product) {
        WebElement btnCategories = find(By.xpath("//a[.='"+category+"']"));
        waitForElementToBeVisible(btnCategories);
        actionsWeb.posicionarElementoScroll(btnCategories);
        actionsWeb.bordearElemento(btnCategories);
        btnCategories.click();
        WebElement btnProducts = find(By.xpath("//a[.='"+product+"']"));
        waitForElementToBeVisible(btnProducts);
        actionsWeb.posicionarElementoScroll(btnProducts);
        actionsWeb.bordearElemento(btnProducts);
        btnProducts.click();

    }
    @When("ingresa al carrito de compras y confirma el pedido")
    public void ingresa_al_carrito_de_compras_y_confirma_el_pedido() {
        comprarProdStep.confirmarPedido();
    }
    @When("el usuario completa la información de pago {string}, {string}, {string}, {string}, {string}, {string}")
    public void el_usuario_completa_la_información_de_pago(String name, String country, String city, String card, String month, String year) {
        comprarProdStep.formulario(name, country, city, card, month, year);
    }
    @Then("se confirma la compra exitosa")
    public void se_confirma_la_compra_exitosa() {

    }
}
