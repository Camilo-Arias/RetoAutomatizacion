package org.demoBlaze.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import org.demoBlaze.steps.CreateUserStep;

public class CreateUserDef {

    @Steps(shared = true)
    CreateUserStep createUserStep;

    @Given("el usuario navega en demoblaze.com")
    public void el_usuario_navega_en_demoblaze_com() {
        createUserStep.openPageURL("https://www.demoblaze.com");
    }

    @When("Doy click en Sign up")
    public void doy_click_en_sign_up() {
        createUserStep.clickSignUp();
    }
    @When("lleno formulario de {string} and {string}")
    public void lleno_formulario_de_and(String user, String pass) {
        createUserStep.typeUser(user);
        createUserStep.typePass(pass);
    }
    @When("Dar click en Sign up Formulario")
    public void dar_click_en_sign_up_formulario() {
        createUserStep.clickSignUpForm();
    }
    @Then("el registro es exitoso")
    public void el_registro_es_exitoso() {

    }
}
