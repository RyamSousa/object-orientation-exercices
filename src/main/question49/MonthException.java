package main.question49;

public class MonthException extends Throwable{

    private String message;

    public MonthException(String message) {
        super(message);
        this.message = message;
    }
}
