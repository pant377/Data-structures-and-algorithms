package javaapplication1;

public class StackFullException extends RuntimeException
{
    public StackFullException (String err)
    {
        super(err);
    }
}
