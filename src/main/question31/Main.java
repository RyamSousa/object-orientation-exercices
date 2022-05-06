package main.question31;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número real:");
        int real = scanner.nextInt();
        System.out.println("Digite um número imaginário:");
        int imaginary = scanner.nextInt();

        ComplexNumber number1 = new ComplexNumber(real, imaginary);
        ComplexNumber number2 = new ComplexNumber(real);
        ComplexNumber number3 = new ComplexNumber();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        scanner.close();
    }
}
