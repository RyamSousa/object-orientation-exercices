package main.question34;

public class Calculator {

    public <T extends Number> double sum(T num1, T num2)
    {
        return num1.doubleValue() + num2.doubleValue();
    }

    public <T extends Number> double subtraction(T num1, T num2)
    {
        return num1.doubleValue() - num2.doubleValue();
    }

    public <T extends Number> double multiplication(T num1, T num2)
    {
        return num1.doubleValue() * num2.doubleValue();
    }

    public <T extends Number> double division(T num1, T num2)
    {
        return num1.doubleValue() / num2.doubleValue();
    }
}
