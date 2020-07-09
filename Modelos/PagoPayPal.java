package Modelos;

public class PagoPayPal implements Pago {

	protected float monto;
	protected String email;

	@Override
	public boolean realizarPago(float monto) {
		return false;
		// realiza el pago
	}

}