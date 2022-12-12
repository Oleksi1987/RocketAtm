package pages.master_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MasterPage extends BasePage {
    public MasterPage(WebDriver driver) {
        super(driver);
    }
    private final By CreateNewAtm = By.xpath("//div[@class = 'inner']//p[contains (text(), 'add new')]");
    public MasterPage createAtmOption() {
        driver.findElement(CreateNewAtm).click();
        return this;
    }

}
