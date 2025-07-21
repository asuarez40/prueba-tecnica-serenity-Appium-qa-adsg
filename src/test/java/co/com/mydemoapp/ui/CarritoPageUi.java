package co.com.mydemoapp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPageUi {

    public static final Target BTN_CARRITO = Target.the(("boton carrito"))
            .locatedBy("//android.view.ViewGroup[@content-desc='cart badge']/android.widget.ImageView");

    public static final Target TITULO_ARTICULO = Target.the("articulo seleccionado")
            .locatedBy("//android.widget.TextView[@content-desc='product label']");
    public static final String TEXTO_ARTICULO_SELECCIONADO = "Sauce Labs Backpack";

    public static final Target BTN_CONTINUAR_PAGO = Target.the("boton proceder con el pago")
            .locatedBy("//android.widget.TextView[@text='Proceed To Checkout']");
}
