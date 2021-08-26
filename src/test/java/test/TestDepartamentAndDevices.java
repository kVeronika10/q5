package test;
import Configs.ClientConfigs;
import Configs.Locators;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.Authorisation;
import page.DepartmentsAndDevices;
import page.MainPage;


@Epic("Отделения и устройства")
@Feature("Рабочие места")
public class TestDepartamentAndDevices  extends TestBase {

    @BeforeEach
    @Severity(SeverityLevel.CRITICAL)
    @Story("Авторизация")
    public void before() {
        Authorisation.login(ClientConfigs.CA_LOGIN,ClientConfigs.CA_PASSWORD,ClientConfigs.CA_ROLE);
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка авторизации")
    public void assertMainPage() {
        assert MainPage.checkMainURL();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Переход на страницу Отделения и устройства")
    public void goToDepartmentAndDevices() {
        MainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        assert DepartmentsAndDevices.checkDepartmentAndDevicesURL();
    }

}
