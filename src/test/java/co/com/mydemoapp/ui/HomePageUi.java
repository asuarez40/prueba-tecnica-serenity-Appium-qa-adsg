package co.com.mydemoapp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUi {

    public static final Target BTN_MENUACORDEON = Target.the(("boton menu acordeon"))
            .locatedBy("//android.view.ViewGroup[@content-desc='open menu']");
    public static final Target BTN_LOGING = Target.the(("boton login"))
            .locatedBy("//android.view.ViewGroup[@content-desc='menu item log in']");
}
