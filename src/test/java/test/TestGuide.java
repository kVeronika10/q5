package test;

import Configs.ClientConfigs;
import Configs.Locators;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.Authorisation;
import page.DepartmentsAndDevices;
import page.Guide;
import page.MainPage;

@Epic("Справочники")
@Feature("Услуги")
public class TestGuide extends TestBase{
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
    @Story("Переход на страницу Справочники")
    public void goToGuide() {
        MainPage.sidebarListElementClick(Locators.guide);
        assert Guide.checkGuideURL();
    }
}
