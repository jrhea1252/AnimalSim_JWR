
public class InvalidSimIDException extends RuntimeException {
    public InvalidSimIDException(String message) {
        super(message);
        System.out.println(message);
    }
}
