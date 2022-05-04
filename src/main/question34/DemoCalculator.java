package main.question34;

public class DemoCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Integer number1 = 2;
        Integer number2 = 2;

        Double number3 = 2.0;
        Double number4 = 2.0;

        System.out.println("Soma Integer: "+calculator.sum(number1,number2));
        System.out.println("Soma Double: "+calculator.sum(number3,number4));
        System.out.println("Soma Double e Integer: "+calculator.sum(number1,number4));

        System.out.println("Subtração Integer: "+calculator.subtraction(number1,number2));
        System.out.println("Subtração Double: "+calculator.subtraction(number3,number4));
        System.out.println("Subtração Double e Integer: "+calculator.subtraction(number1,number4));


        System.out.println("Multiplicação Integer: "+calculator.multiplication(number1,number2));
        System.out.println("Multiplicação Double: "+calculator.multiplication(number3,number4));
        System.out.println("Multiplicação Double e Integer: "+calculator.multiplication(number1,number4));

        System.out.println("Divisão Integer: "+calculator.division(number1,number2));
        System.out.println("Divisão Double: "+calculator.division(number3,number4));
        System.out.println("Divisão Double e Integer: "+calculator.division(number1,number4));


    }
}
