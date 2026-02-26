package basic.c09_exeptions.exceptions;

public class CustomException extends Exception {
    // Darle la capacidad para mostrar mensajes
    public CustomException(String message) {
        super(message);
    }
}
