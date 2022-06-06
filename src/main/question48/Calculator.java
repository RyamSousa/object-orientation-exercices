package main.question48;

public class Calculator {

    public int obterIntValido(String number) throws NumberFormatException{
        return Integer.parseInt(number);
    }

    public Integer sum(Integer num1, Integer num2){
        return num1 + num2;
    }
}
