package main.question42;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário 1: ");
        String name = scanner.next();
        System.out.println("Digite a quantidade de horas trabalhadas pelo funcionário 1: ");
        int amoutHours = scanner.nextInt();

        Employee employee1 = new Employee(name);
        employee1.salaryCalc(amoutHours);


        System.out.println("Digite o nome do funcionário 2: ");
        String name2 = scanner.next();
        System.out.println("Digite o valor da hora do funcionário 2: ");
        double hourValue = scanner.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas pelo funcionário 2: ");
        int amoutHours2 = scanner.nextInt();

        Employee employee2 = new Employee(name2, hourValue);
        employee2.salaryCalc(amoutHours2);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
