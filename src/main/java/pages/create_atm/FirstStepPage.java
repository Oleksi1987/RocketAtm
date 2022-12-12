package pages.create_atm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.StoreData.*;

public class FirstStepPage extends BasePage {

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
    /** private final By StateProvinceSelector = By.xpath("//input[@id = 'Atm_state_id']");
    public FirstStepPage clickStateProvinceSelector() {
        driver.findElement(StateProvinceSelector).click();
        return this;
     }
     */

    private final By SelectProvince = By.xpath("//input[@id = 'Atm_state_id']");
    public FirstStepPage chooseStateProvinceSelector() {
        driver.findElement(SelectProvince).sendKeys("ALASKA");
        return this;
    }
    private final By InsertZip = By.xpath("//input[@id = 'Atm_zip']");
    public FirstStepPage insertZip() {
        driver.findElement(InsertZip).sendKeys("ALASKA");
        return this;
    }
    private final By InsertStoreNumber = By.xpath("//input[@id = 'Atm_cellPhone']");
    public FirstStepPage insertStoreNumber() {
        driver.findElement(InsertStoreNumber).sendKeys(STORE_TELEPHONE_NUMBER);
        return this;
    }
    private final By LegalName = By.xpath("//input[@id = 'Atm_cellPhone']");
    public FirstStepPage insertLegalName() {
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
        driver.findElement(LegalName).sendKeys(LEGAL_EIN);
        return this;
    }
}