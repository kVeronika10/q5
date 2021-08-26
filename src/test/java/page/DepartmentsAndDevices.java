package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DepartmentsAndDevices extends PageBase{
    private final SelenideElement workplace = $("#tab__button--workplace");

    public void goToWorkplace(){

        workplace.click();
    }
    public static boolean checkDepartmentAndDevicesURL()
    {
        return checkURL("http://localhost:8080/admin/DepartmentsAndDevices/schedule");
    }
}
