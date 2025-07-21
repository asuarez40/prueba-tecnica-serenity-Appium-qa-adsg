package co.com.mydemoapp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPageUi {
    public static final String TEXTO_LOGIN = "Select a username and password from the list below, or click on the usernames to automatically populate the username and password.";

    public static final Target TITULO_LOGUI = Target.the(("titulo loguin"))
            .locatedBy("//android.widget.TextView[@text='Select a username and password from the list below, or click on the usernames to automatically populate the username and password.']");

    public static final Target USERNAME_FIELD = Target.the(("campo username"))
            .locatedBy("//android.widget.EditText[@content-desc='Username input field']");

    public static final Target PASSWORD_FIELD = Target.the(("campo de password"))
            .locatedBy("//android.widget.EditText[@content-desc='Password input field']");

    public static final Target BTN_LOGIN = Target.the(("boton login"))
            .locatedBy("//android.view.ViewGroup[@content-desc='Login button']");

    public static final Target TITULO_LOGIN_EXITOSO = Target.the(("titulo login exitoso"))
            .locatedBy("//android.widget.TextView[@text='Products']");

    public static final String TEXTO_LOGIN_EXITOSO = "Products";

    public static final Target TITULO_LOGIN_FALLIDO = Target.the(("titulo login exitoso"))
            .locatedBy("//android.widget.TextView[@text='Sorry, this user has been locked out.']");

    public static final String TEXTO_LOGIN_FALLIDO = "Sorry, this user has been locked out.";

}
