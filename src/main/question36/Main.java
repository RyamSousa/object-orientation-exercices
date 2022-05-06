package main.question36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da posição 1 da matriz: ");
        float num1 = scanner.nextFloat();
        System.out.println("Digite o valor da posição 2 da matriz: ");
        float num2 = scanner.nextFloat();
        System.out.println("Digite o valor da posição 3 da matriz: ");
        float num3 = scanner.nextFloat();
        System.out.println("Digite o valor da posição 4 da matriz: ");
        float num4 = scanner.nextFloat();

        Matriz matriz = new Matriz(num1, num2, num3, num4);

        System.out.println("Determinante: "+matriz.determinante());
        matriz.imprime();

        scanner.close();
    }
}
