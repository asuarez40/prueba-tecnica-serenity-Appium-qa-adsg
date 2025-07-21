package co.com.mydemoapp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DireccionEnvioPageUi {

    public static final Target TITULO_DIRECCION = Target.the(("titulo ingrese la direccion de entrega"))
            .locatedBy("//android.widget.TextView[@text='Enter a shipping address']");
    public static final String TEXTO_DIRECCION = "Enter a shipping address";

    public static final Target NOMBRE_FIELD = Target.the(("campo nombre completo"))
            .locatedBy("//android.widget.EditText[@content-desc='Full Name* input field']");
    public static final Target DIRECCION1_FIELD = Target.the(("campo direccion uno"))
            .locatedBy("//android.widget.EditText[@content-desc='Address Line 1* input field']");
    public static final Target DIRECCION2_FIELD = Target.the(("campo direccion dos"))
            .locatedBy("//android.widget.EditText[@content-desc='Address Line 2 input field']");
    public static final Target CIUDAD_FIELD = Target.the(("campo ciudad"))
            .locatedBy("//android.widget.EditText[@content-desc='City* input field']");
    public static final Target REGION_FIELD = Target.the(("campo estado o region"))
            .locatedBy("//android.widget.EditText[@content-desc='State/Region input field']");
    public static final Target CODIGO_POSTAL_FIELD = Target.the(("campo codigo postal"))
            .locatedBy("//android.widget.EditText[@content-desc='Zip Code* input field']");
    public static final Target PAIS_FIELD = Target.the(("campo pais"))
            .locatedBy("//android.widget.EditText[@content-desc='Country* input field']");
    public static final Target BTN_PAGAR = Target.the(("boton continuar con el pago"))
            .locatedBy("//android.widget.TextView[@text='To Payment']");

}
