abstract class Pago{
    abstract void procesarPago();
}

class TarjetaDeCrédito extends Pago{
    private String numerotarjeta;
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaDeCrédito(String numerotarjeta, String fechaExpiracion, String codigoSeguridad){
        this.numerotarjeta = numerotarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }
}

@Override
void procesarPago(){
    System.out.println("Procesando pago con tarjeta de crédito");
}

public void verificarLimiteCredito(){
    System.out.println("Verificando límite de crédito");
}

class PayPal extends Pago{

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    void procesarPago(){
        System.out.println("Procesando pago con PayPal");
    }

    public void enviarRecibo(){
        System.out.println("Enviando recibo");
    }
}

public class ProcesadorDePagos{
    public void procesar(Pago pago){
        pago.procesarPago();

    if(pago instanceof TarjetaDeCrédito){
        TarjetaDeCrédito tarjeta = (TarjetaDeCrédito) pago;
        tarjeta.verificarLimiteCredito();
    } else if (pago instanceof PayPal){
        PayPal paypal = (PayPal) pago;
        paypal.enviarRecibo();
    }
    }
}