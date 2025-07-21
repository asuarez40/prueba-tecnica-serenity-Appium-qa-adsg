package co.com.mydemoapp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoPageUi {

    public static final Target BTN_ARTICULO = Target.the(("boton articulo maleta"))
            .locatedBy("//android.widget.TextView[@content-desc='store item text' and @text='Sauce Labs Backpack']");

    public static final Target BTN_AGREGAR_ARTICULO = Target.the(("boton agregar articulo"))
            .locatedBy("//android.widget.TextView[@text='Add To Cart']");

    public static final String TEXTO_BTN_AGREGAR = "Add To Cart";

    public static final Target TITULO_PRODUCTO = Target.the(("titulo product highlights"))
            .locatedBy("//android.widget.TextView[@content-desc='product price']");
}
