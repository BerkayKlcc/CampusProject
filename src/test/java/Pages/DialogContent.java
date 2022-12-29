package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DialogContent extends Parent {

    public DialogContent() {

        PageFactory.initElements(GenWebDrv.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    @FindBy(css = "button[class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;                                               // Ortak

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;                                               // Ortak

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;                                          // Ortak

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    private WebElement searchInput;                                             // Ortak

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;                                            // Ortak

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;                                            // Ortak

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteDialogBtn;                                         // Ortak

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;                                              // Ortak

    @FindBy(css = "svg[class='svg-inline--fa fa-pen-to-square']")
    private WebElement editButton;                                              // Ortak

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(css = "input[data-placeholder='Capacity']")
    private WebElement capacity;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        //element get

        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "capacity":
                myElement = capacity;
                break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        //element get
        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "acceptCookies":
                myElement = acceptCookies;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "deleteDialogBtn":
                myElement = deleteDialogBtn;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "editButton":
                myElement = editButton;
                break;

        }
        clickFunction(myElement);
    }

    public void findAndCountainsText(String strElement, String text) {

        switch (strElement) {
            case "txtTechnoStudy":
                myElement = txtTechnoStudy;
                break;
            case "successMessage":
                myElement = successMessage;
                break;
        }
        verifyContainsTextFunc(myElement, text);
    }

    public void findAndDelete(String searchTex) {
        findAndSend("searchInput", searchTex);
        findAndClick("searchButton");

        waitUntilLoading();
        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }

    public void closeWindow() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

    }
}
