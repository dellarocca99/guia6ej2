package excepciones;

public class ExtraccionInvalidaException extends Exception {
	
	private DatoInvalido dato;

	public ExtraccionInvalidaException(DatoInvalido dato) {
		super();
		this.dato = dato;
	}

	public DatoInvalido getDato() {
		return dato;
	}
	
	
}
