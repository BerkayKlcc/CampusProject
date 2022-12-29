package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent(){
        PageFactory.initElements(GenWebDrv.getDriver(),this);
    }

    @FindBy(xpath = "")
    private WebElement write;
    @FindBy (css = "mat-select[formcontrolname='type']")
    private  WebElement locationtype;
    @FindBy (xpath = "//span[text()=' Classroom ']")
    private WebElement selecttype;

    WebElement myElement;

    public void findAndClick(String strlement) {
        //element get :burda string isimden weblemente ulaşıcam
        switch (strlement){
          //  case "academicPeriod" : myElement = academicPeriod;break;
            case "locationtype": myElement=locationtype; break;
            case "selecttype": myElement=selecttype; break;



        }
        clickFunction(myElement);
    }
}
