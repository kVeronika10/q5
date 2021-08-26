package page;

import Configs.ClientConfigs;
import Configs.URL;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Authorisation
{
    private static final SelenideElement inputUsername = $("#admin_login__input--login");
    private static final SelenideElement inputPassword = $("#admin_login__input--password");
    private static final SelenideElement loginButton = $("#admin_login__button--submit");
    private static final SelenideElement rolesList = $("#admin_login__nz-select--authorizationRole");
    private static final SelenideElement submitButton=$("#modal-dialog__button--submit");

    public static void goToLoginPage() {

        open(URL.AUTHORISATION_URL);
    }

    public static void login(String username,String password, String role) {
        goToLoginPage();
        inputUsername.clear();
        inputUsername.sendKeys(username);
        inputPassword.clear();
        inputPassword.sendKeys(password);
        rolesList.click();
        SelenideElement centralAdminRole = $("nz-option-item[title='"+role+"']");
        centralAdminRole.click();
        loginButton.click();
//        try{
//            submitButton.click();
//        }
//        catch (NoSuchElementException e)
//        {}
    }
}
//{
//    String SITE_URL="http://localhost:8080/admin/login";
//    public Authorisation(WebDriver driver) {
//        super(driver);
//    }
//
//    public Authorisation goTo(){
//        driver.get(SITE_URL);
//        return this;
//    }
//    public Authorisation clickAutorisation(){
//        click(By.id("admin_login__button--submit"));
//        return this;
//    }
//    public Authorisation checkPageIsCorrect(){
//        isElementDisplayed(By.id("admin_login__input--login"));
//        return this;
//    }
//}
