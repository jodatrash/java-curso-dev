package basic.c09_exeptions.ex_10.exceptions;

public class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}
