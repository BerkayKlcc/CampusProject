package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class AttestationsSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();


    @And("Navigate to Attestations")
    public void navigateToAttestations(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement){
            ln.findAndClick(strButton);
        }
    }

    @And("Click on the element in the Attestations")
    public void clickOnTheElementInTheAttestations(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            dc.findAndClick(strButton);
        }
    }

    @And("User sending the key in Attestation")
    public void userSendingTheKeyInAttestation(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }
}
