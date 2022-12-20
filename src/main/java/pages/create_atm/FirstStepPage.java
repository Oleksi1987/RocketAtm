package pages.create_atm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Emails.USER_EMAIL_ADDRESS;
import static constants.Constant.StoreData.*;

public class FirstStepPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public FirstStepPage(WebDriver driver) {
        super(driver);
    }
    private final By StoreNameField = By.xpath("//input[@id = 'Atm_location']");
    public FirstStepPage insertStoreName() {
        driver.findElement(StoreNameField).sendKeys(STORE_NAME);
        return this;
    }
    private final By StoreAddressField = By.xpath("//input[@id = 'Atm_address']");
    public FirstStepPage insertStoreAddress() {
        driver.findElement(StoreAddressField).sendKeys(STORE_ADDRESS);
        return this;
    }
    private final By StoreCityField = By.xpath("//input[@id = 'Atm_city']");
    public FirstStepPage insertCity() {
        driver.findElement(StoreCityField).sendKeys(STORE_CITY);
        return this;
    }
     private final By StateProvinceSelector = By.xpath("//select[@id = 'Atm_state_id']");
    public FirstStepPage clickStateProvinceSelector() {
        driver.findElement(StateProvinceSelector).click();
        return this;
     }
    private final By SelectProvince = By.cssSelector("[id='Atm_state_id'],[value='2']");
    public FirstStepPage chooseStateProvince() {
        driver.findElement(SelectProvince).click();
        return this;
    }
    private final By InsertZip = By.xpath("//input[@id = 'Atm_zip']");
    public FirstStepPage insertZip() {
        driver.findElement(InsertZip).sendKeys(ZIP);
        return this;
    }
    private final By InsertStoreNumber = By.xpath("//input[@id = 'Atm_cellPhone']");
    public FirstStepPage insertStoreNumber() {
        driver.findElement(InsertStoreNumber).sendKeys(STORE_TELEPHONE_NUMBER);
        return this;
    }
    private final By LegalName = By.xpath("//input[@id = 'Atm_legal_name']");
    public FirstStepPage insertLegalName() {
        js.executeScript("scrollBy(0, 170)");
        driver.findElement(LegalName).sendKeys(LEGAL_NAME);
        return this;
    }
    private final By LegalType = By.xpath("//input[@id = 'Atm_legal_type_0']");
    public FirstStepPage chooseLegalType() {
        driver.findElement(LegalType).click();
        return this;
    }
    private final By LegalEIN = By.xpath("//input[@id = 'Atm_legal_ein']");
    public FirstStepPage insertLegalEIN() {
        driver.findElement(LegalEIN).sendKeys(LEGAL_EIN);
        return this;
    }
    private final By NewUser = By.xpath("//input[@id='Atm_select_user_2']");
    public FirstStepPage chooseNewUserOption() {
        driver.findElement(NewUser).click();
        return this;
    }
    private final By UserEmail = By.xpath("//input[@id='StoreOwner_email']");
    public FirstStepPage insertUserEmail(){
        driver.findElement(UserEmail).sendKeys(USER_EMAIL_ADDRESS);
        return this;
    }
    private final By UserName = By.xpath("//input[@id='StoreOwner_first_name']");
    public FirstStepPage insertFirstName(){
        driver.findElement(UserName).sendKeys(USER_FIRST_NAME);
        return this;
    }
    private final By UserLastName = By.xpath("//input[@id='StoreOwner_last_name']");
    public FirstStepPage insertLastName(){
        driver.findElement(UserLastName).sendKeys(USER_LAST_NAME);
        return this;
    }
    private final By UserAddress = By.xpath("//input[@id='StoreOwner_address']");
    public FirstStepPage insertUserAddress(){
        driver.findElement(UserAddress).sendKeys(USER_ADDRESS);
        return this;
    }
    private final By UserCity = By.xpath("//input[@id='StoreOwner_city']");
    public FirstStepPage insertUserCity(){
        driver.findElement(UserCity).sendKeys(USER_CITY);
        return this;
    }
    private final By UserState = By.xpath("//select[@id='StoreOwner_state_id']");
    public FirstStepPage clickUserStateProvinceSelector() {
        driver.findElement(UserState).click();
        return this;
    }
    private final By SelectUserProvince = By.xpath("//select[@id = 'StoreOwner_state_id']//option[contains(text(), 'ARIZONA - AZ')]");
    public FirstStepPage chooseUserStateProvince() {
        driver.findElement(SelectUserProvince).click();
        return this;
    }
    private final By UserZip = By.xpath("//input[@id='StoreOwner_zip']");
    public FirstStepPage insertUserZip() {
        driver.findElement(UserZip).sendKeys(USER_ZIP);
        return this;
    }
    private final By UserCellPhone = By.xpath("//input[@id='StoreOwner_phone']");
    public FirstStepPage insertUserCellPhone() {
        driver.findElement(UserCellPhone).sendKeys(USER_CELL_PHONE);
        return this;
    }
    private final By UserBirthDate = By.xpath("//input[@id='StoreOwner_birth_date']");
    public FirstStepPage chooseUserBirthDate() {
        driver.findElement(UserBirthDate).click();
        return this;
    }
    private final By OwnerLegalName = By.xpath("//input[@id='StoreOwner_legal_name']");
    public FirstStepPage insertOwnerLegalName() {
        js.executeScript("scrollBy(0, 150)");
        driver.findElement(OwnerLegalName).sendKeys(USER_FIRST_NAME + " " + USER_LAST_NAME);
        return this;
    }
    private final By SocialSecurity = By.xpath("//input[@id='StoreOwner_socSec']");
    public FirstStepPage insertSocialSecurity() {
        js.executeScript("scrollBy(0, 150)");
        driver.findElement(SocialSecurity).sendKeys(SOCIAL_SECURITY);
        return this;
    }
    private final By NextButtonStepOne = By.cssSelector("[value='Next']");
    public FirstStepPage clickNextButtonStepOne() {
        driver.findElement(NextButtonStepOne).click();
        return this;
    }

}
