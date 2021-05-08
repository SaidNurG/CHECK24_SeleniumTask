package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TaskPage {

    public TaskPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath="//a[@class='c24-cookie-consent-button']")
    public WebElement akzeptieren;

    @FindBy(xpath = "//*[@id=\"200007\"]//a")
    public WebElement barclayCardVisa;

    @FindBy(id = "cl_login")
    public WebElement emailInput;

    @FindBy(id = "c24-uli-login-btn")
    public WebElement formWeiter;

    @FindBy(xpath = "//*[@xpath=\"1\"]")
    public WebElement gastFortfahren;

    @FindBy(xpath = "//*[@class=\"sc-bBXqnf cqnVzA\"]")
    public WebElement genderMale;

    @FindBy(xpath = "//*[@class=\"sc-bBXqnf kXGNYs\"]")
    public WebElement genderFemale;

    @FindBy(id = "GIVEN_NAME")
    public WebElement givenNameInput;

    @FindBy(id = "LAST_NAME")
    public WebElement lastNameInput;

    @FindBy(id = "DATE_OF_BIRTH")
    public WebElement birthdayInput;

    @FindBy(id = "MARITAL_STATUS")
    public WebElement maritialStatusDropDown;

    @FindBy(id = "NATIONALITY")
    public WebElement nationalityDropDown;

    @FindBy(id = "POSTAL_CODE")
    public WebElement postalCodeInput;

    @FindBy(xpath = "//*[@name=\"STREET\"]")
    public WebElement streetInput;

    @FindBy(id = "HOUSE_NUMBER")
    public WebElement houseNumberInput;

    @FindBy(id = "HOUSING_SITUATION")
    public WebElement housingStationDropDown;

    @FindBy(id = "PHONENUMBER_MOBILE")
    public WebElement phoneNumberInput;




}
