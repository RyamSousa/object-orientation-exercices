package main.question34;

public class Calculator {

    public <T extends Number> double sum(T first, T second)
    {
        return first.doubleValue() + second.doubleValue();
    }

    public <T extends Number> double subtraction(T first, T second)
    {
        return first.doubleValue() - second.doubleValue();
    }

    public <T extends Number> double multiplication(T first, T second)
    {
        return first.doubleValue() * second.doubleValue();
    }

    public <T extends Number> double division(T first, T second)
    {
        return first.doubleValue() / second.doubleValue();
    }
}
