package exceptions;

public class NegativeValueValidatorException extends RuntimeException{
    public NegativeValueValidatorException(final String message) { super(message); }
}
