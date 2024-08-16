
public class InvalidSubspeciesException extends RuntimeException {
    public InvalidSubspeciesException(String message) {
        super(message);
        System.out.println(message);
    }
}
