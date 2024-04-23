package desafio;

public class ParametrosInvalidosexception extends RuntimeException{
    private String message;

    public ParametrosInvalidosexception(String message) {
        super(message);
        this.message = message;
    }
}
