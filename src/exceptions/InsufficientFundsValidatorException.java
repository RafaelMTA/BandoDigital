package exceptions;

public class InsufficientFundsValidatorException extends RuntimeException{
    public InsufficientFundsValidatorException(final String message) { super(message); }
}
