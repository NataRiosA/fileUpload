package com.indra.steps_definitions;


import com.indra.actions.UploadActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class UploadSteps {
    @Managed
    WebDriver driver;
    UploadActions uploadActions = new UploadActions(driver);

    @Given("^el usuario se encuentra en la pagina principal$")
    public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
        uploadActions.open();
    }

    @When("^el usuario carga el archivo$")
    public void elUsuarioCargaElArchivo() {
        uploadActions.sendFile();
    }

    @Then("^el sisteme deberia mostrar mensaje de confirmacion$")
    public void elSistemeDeberiaMostrarMensajeDeConfirmacion() {
        uploadActions.compare();
    }


}
