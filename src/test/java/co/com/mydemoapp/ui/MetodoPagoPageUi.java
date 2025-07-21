package co.com.mydemoapp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class MetodoPagoPageUi {

    public static final Target TITULO_METODOPAGO = Target.the(("titulo metodo de pago"))
            .locatedBy("//android.widget.TextView[@text='Enter a payment method']");
    public static final String TEXTO_METODOPAGO = "Enter a payment method";
    public static final Target NOMBRE_CC_FIELD = Target.the(("campo nombre completo tarjeta"))
            .locatedBy("//android.widget.EditText[@content-desc='Full Name* input field']");
    public static final Target NUMERO_TARJETA_FIELD = Target.the(("campo numero tarjeta"))
            .locatedBy("//android.widget.EditText[@content-desc='Card Number* input field']");
    public static final Target FECHA_VENCIMIENTO_FIELD = Target.the(("campo fecha de vencimiento"))
            .locatedBy("//android.widget.EditText[@content-desc='Expiration Date* input field']");
    public static final Target CCV_FIELD = Target.the(("campo codigo de seguridad CCV"))
            .locatedBy("//android.widget.EditText[@content-desc='Security Code* input field']");

    public static final Target BTN_VERIFICAR_ORDEN = Target.the(("boton verificar orden"))
            .locatedBy("//android.widget.TextView[@text='Review Order']");
}
