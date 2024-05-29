package day38_exceptions;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(){ // first constructor, extends to RuntimeException and send the message
        super("It's break time");
    }
    public BreakTimeException(String message){  // second constructor
        super(message);
    }
}
