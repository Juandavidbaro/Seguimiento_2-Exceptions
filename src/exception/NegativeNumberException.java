package exception;

public class NegativeNumberException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public NegativeNumberException (double number) {
		super("El número ingresado es negativo: " + number);
	}

	public NegativeNumberException() {
		super ("El número ingresado es negativo");
	}

}
