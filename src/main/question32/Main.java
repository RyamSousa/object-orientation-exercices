package main.question32;

public class Main {
    public static void main(String[] args) {

        System.out.print("Maior de 2 int: ");
        System.out.println(StaticMethods.maiorDeDois(2, 1));
        System.out.print("\nMaior de 2 double: ");
        System.out.println(StaticMethods.maiorDeDois(1.9, 2.1));
        System.out.print("\nMaior de 3 int: ");
        System.out.println(StaticMethods.maiorDeTres(10, 2, 4));
        System.out.print("\nMaior de 3 double: ");
        System.out.println(StaticMethods.maiorDeTres(1.9, 2.1, 9.8));
        System.out.print("\nMaior de 4 int: ");
        System.out.println(StaticMethods.maiorDeQuatro(12, 29, 90, 87));
        System.out.print("\nMaior de 4 double: ");
        System.out.println(StaticMethods.maiorDeQuatro(2.8, 109.9, 90.9, 8.7));
        System.out.print("\nMaior de 5 int: ");
        System.out.println(StaticMethods.maiorDeCinco(789, 13, 59, 987, 230));
        System.out.print("\nMaior de 5 double: ");
        System.out.println(StaticMethods.maiorDeCinco(78.89, 3.12, 5.9, 97.45, 20.3));
    }
}
