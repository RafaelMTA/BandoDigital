package exceptions;

public final class NegativeValueValidatorException extends RuntimeException{
    public NegativeValueValidatorException(final String message) { super(message); }
}
