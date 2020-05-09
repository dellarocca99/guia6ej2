import excepciones.DatoInvalido;
import excepciones.DepositoInvalidoException;
import excepciones.ExtraccionInvalidaException;

public class CuentaBancaria {

	private double saldo;
	private String titular;
	
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public CuentaBancaria(String titular) {
		super();
		this.titular = titular;
	}
	
	public void depositar(double cantidad) throws DepositoInvalidoException {
		
		if (cantidad>0)
			saldo+=cantidad;
		else
			throw new DepositoInvalidoException(cantidad);
	}
	
	public void extraer(double cantidad) throws ExtraccionInvalidaException {

		if (cantidad>0)
			if (saldo-cantidad>=0)
				saldo-=cantidad;
			else
				throw new ExtraccionInvalidaException(new DatoInvalido(cantidad,saldo));
	}
}
