package exception;

public class NegativeNumberException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public NegativeNumberException (double number) {
		super("El n�mero ingresado es negativo: " + number);
	}

	public NegativeNumberException() {
		super ("El n�mero ingresado es negativo");
	}

}
