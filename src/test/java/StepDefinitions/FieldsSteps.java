package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class FieldsSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @When("Navigate to Fields")
    public void navigateToFields(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement){
            ln.findAndClick(strButton);
        }
    }

    @And("Send keys in the Fields")
    public void sendKeysInTheFields(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click on the elements in the Fields")
    public void clickOnTheElementsInTheFields(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            dc.findAndClick(strButton);
        }
    }
}
