package co.com.mydemoapp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class VerificacionOrdenUi {

    public static final String TEXTO_VERIFICACION = "1 item";

    public static final Target TITULO_VERIFICACION = Target.the(("titulo verificacion compra"))
            .locatedBy("//android.widget.TextView[@content-desc='total number']");

    public static final Target BTN_REALIZAR_COMPRA = Target.the(("boton para confirmar la orden"))
            .locatedBy("//android.view.ViewGroup[@content-desc='Place Order button']");
}
