package main.question26;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite uma descrição para a fatura: ");
        String description = scanner.nextLine();
        System.out.println("Digite a quantidade de itens: ");
        int amount = scanner.nextInt();
        System.out.println("Digite o valor unitário de cada item: ");
        double unitPrice = scanner.nextDouble();

        Fatura fatura = new Fatura();
        fatura.setIdentificationNumber(random.nextInt(1000));
        fatura.setDescription(description);
        fatura.setAmountBuy(amount);
        fatura.setUnitPrice(unitPrice);

        System.out.println();
        System.out.println("Número de identificação: "+ fatura.getIdentificationNumber());
        System.out.println("Valor total: "+ fatura.calculaTotal());
        System.out.println("Descrição: "+ fatura.getDescription());

        scanner.close();
    }
}
