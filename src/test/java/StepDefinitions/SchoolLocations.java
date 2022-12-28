package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class SchoolLocations {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to Setup on LeftNav")
    public void navigateToSetupOnLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            ln.findAndClick(strButton);
        }
    }

    @And("User press TAB button")
    public void userPressTABButton() {
        dc.closeWindow();
    }

    @And("Click on the element in the Locations")
    public void clickOnTheElementInTheLocations(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            ln.findAndClick(strButton);

        }
    }

    @And("User sending the key in Locations")
    public void userSendingTheKeyInLocations(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }
}