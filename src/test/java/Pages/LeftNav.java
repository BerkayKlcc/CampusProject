package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav(){
        PageFactory.initElements(GenWebDrv.getDriver(),this);
    }

    @FindBy(xpath="//span[text()='Human Resources']")
    private WebElement humanResource_1;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    private WebElement setup_1;

    @FindBy(xpath="(//span[text()='Position Categories'])[1]")
    private WebElement positionCategory_1;
    @FindBy(xpath="(//span[text()='Attestations'])[1]")
    private WebElement attestations_1;


    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c252-7 ng-star-inserted']")
    private WebElement setup;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c252-8 ng-star-inserted']")
    private WebElement parameters;

    @FindBy(xpath="//span[normalize-space()='Document Types']")
    private WebElement documentTypes;

    @FindBy (xpath = "//span[text()='Setup']")
    private WebElement setupOneMenu;

    @FindBy (xpath = "//fa-icon//following::span[text()='Parameters']")
    private WebElement parametersSubMenu;

    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Fields']")
    private WebElement fields;


    @FindBy (xpath = "//span[text()='School Setup']")
    private WebElement school_setup;

    @FindBy (xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy (xpath = "//span[text()='Locations']")
    private WebElement locations;


    WebElement myElement;

    public void findAndClick(String strElement){

        switch (strElement){
            case "humanResource_1" : myElement=humanResource_1;break;
            case "setup_1" : myElement=setup_1;break;
            case "positionCategory_1" : myElement=positionCategory_1;break;
            case "attestations_1" : myElement=attestations_1;break;
            case "setup" : myElement=setup;break;
            case "parameters" : myElement=parameters;break;
            case "documentTypes" : myElement=documentTypes;break;
            case "setupOneMenu" : myElement =setupOneMenu; break;
            case "parametersSubMenu" : myElement =parametersSubMenu; break;
            case "fields" : myElement =fields; break;
            case "departments": myElement=departments; break;
            case "school_setup": myElement=school_setup; break;
            case "locations": myElement=locations; break;
        }
        clickFunction(myElement);
    }


}
