package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class SchoolLocationsSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    FormContent fc = new FormContent();

    @And("Navigate to School Locations")
    public void navigateToSchoolLocations(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            ln.findAndClick(strButton);

        }
    }

    @And("Click on the element in the School Locations")
    public void clickOnTheElementInTheSchoolLocations(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            dc.findAndClick(strButton);
        }
    }

    @And("User sending the key in School Locations")
    public void userSendingTheKeyInSchoolLocations(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User delete item from School Locations")
    public void userDeleteItemFromSchoolLocations(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);

        for (String strButtonName : listElemanlar)
            dc.findAndDelete(strButtonName);
    }

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String strButton : listElement) {
            fc.findAndClick(strButton);
        }
    }
}