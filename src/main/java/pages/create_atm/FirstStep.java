package pages.create_atm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.util.Base64;

public class FirstStep extends BasePage {

    public FirstStep(WebDriver driver) {
        super(driver);
    }
    private final By StoreNameField = By.xpath("//input[@id = 'Atm_location']");
    public FirstStep insertStoreName() {
        driver.findElement(StoreNameField).sendKeys("STORE_NAME");
        return this;
    }
    private final By StoreAddressField = By.xpath("//input[@id = 'Atm_address']");
    public FirstStep insertStoreAddress() {
        driver.findElement(StoreNameField).sendKeys("STORE_ADDRESS");
        return this;
    }
    private final By StoreCityField = By.xpath("//input[@id = 'Atm_address']");
    public FirstStep insertCityAddress() {
        driver.findElement(StoreCityField).sendKeys("STORE_CITY");
        return this;
    }

}
