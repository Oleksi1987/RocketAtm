package pages.create_atm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class SecondStepPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public SecondStepPage(WebDriver driver) {
        super(driver);
    }
    private final By SelectAtm = By.xpath("//li[@id = 'brand_4']");
    public SecondStepPage chooseATM() {
        driver.findElement(SelectAtm).click();
        return this;
    }
    private final By ClickSelectModel = By.cssSelector("[name='Atm[atm_model_id]']");
    public SecondStepPage clickSelectModel() {
        driver.findElement(ClickSelectModel).click();
        return this;
    }
    private final By SelectAtmModel = By.xpath("//select[@id ='Atm_atm_model_id']//option[contains(text(), 'Triton 8100')]");
    public SecondStepPage selectAtmModel() {
        driver.findElement(SelectAtmModel).click();
        return this;
    }
    private final By ClickOnSelectAtmCassettes = By.cssSelector("[id='Atm_number_of_cassetes']");
    public SecondStepPage clickSelectAtmCassettes() {
        driver.findElement(ClickOnSelectAtmCassettes).click();
        return this;
    }
    private final By ChooseAmountOfAtmCassettes = By.xpath("//select[@id='Atm_number_of_cassetes']//option[contains(text(), '2')]");
    public SecondStepPage chooseAmountOfAtmCassettes() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(ChooseAmountOfAtmCassettes).click();
        return this;
    }
    private final By ClickOnCassette1 = By.cssSelector("[name='Atm[cassetes_list][1]']");
    public SecondStepPage clickOnCassette1() {
        driver.findElement(ClickOnCassette1).click();
        return this;
    }
    private final By ChooseAmountOnCassette1 = By.xpath("//select[@id = 'Atm_cassetes_list_1']//option[contains(text(), '20')]");
    public SecondStepPage chooseAmountOnCassette1() {
        driver.findElement(ChooseAmountOnCassette1).click();
        return this;
    }
    private final By ClickOnCassette2 = By.cssSelector("[name='Atm[cassetes_list][2]']");
    public SecondStepPage clickOnCassette2() {
        driver.findElement(ClickOnCassette2).click();
        return this;
    }
    private final By ChooseAmountOnCassette2 = By.xpath("//select[@id = 'Atm_cassetes_list_1']//option[contains(text(), '50')]");
    public SecondStepPage chooseAmountOnCassette2() {
        driver.findElement(ChooseAmountOnCassette2).click();
        return this;
    }
    private final By AtmOwner = By.cssSelector("[id='owner_2']");
    public SecondStepPage chooseAtmOwner() {
        driver.findElement(AtmOwner).click();
        return this;
    }
    private final By NextButtonStepTwo = By.cssSelector("[value='Next']");
    public SecondStepPage clickNextButtonStepTwo() {
        js.executeScript("scrollBy(0, 200)");
        driver.findElement(NextButtonStepTwo).click();
        return this;
    }


}
