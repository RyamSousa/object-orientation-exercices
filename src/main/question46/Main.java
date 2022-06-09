package main.question46;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite alguma string: ");
        String value = scanner.nextLine();

        String[] characters = value.split("");

        Map<String, Integer> occurring = Operations.getOccurring(characters);
        Operations.printOccurring(occurring);
    }

}
