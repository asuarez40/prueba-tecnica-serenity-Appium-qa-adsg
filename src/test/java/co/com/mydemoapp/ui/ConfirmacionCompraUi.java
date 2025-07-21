package co.com.mydemoapp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionCompraUi {

    public static final Target TITULO_CONFIRMACION = Target.the(("titulo confirmacion oreden exitosa"))
            .locatedBy("//android.widget.TextView[@text='Checkout Complete']");
    public static final String TEXTO_CONFIRMACION = "Checkout Complete";
}
