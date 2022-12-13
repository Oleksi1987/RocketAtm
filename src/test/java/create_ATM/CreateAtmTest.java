package create_ATM;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.ROCKET_HOME_PAGE;

public class CreateAtmTest extends BaseTest {

    @Test
    public void registerAtm() {
        basePage
                .open(ROCKET_HOME_PAGE);
        loginPage
                .enterLogin()
                .enterPassword()
                .clickLoginButton();
        masterPage
                .createAtmOption();
        firstStepPage
                .insertStoreName()
                .insertStoreAddress()
                .insertCity()
                .clickStateProvinceSelector()
                .chooseStateProvince()
                .insertZip()
                .insertStoreNumber()
                .insertLegalName()
                .chooseLegalType()
                .insertLegalEIN();
    }
}
