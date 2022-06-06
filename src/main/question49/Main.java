package main.question49;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um valor inteiro correspondente a um mês do ano: ");
            String month = verifyNumber(scanner.next());

            System.out.println("Mês digitado: "+ month);
        }catch (MonthException | NumberFormatException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    private static String verifyNumber(String number) throws MonthException {
        String[] monthNames = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        Integer validNumber = Integer.parseInt(number);
        if (validNumber < 1 || validNumber > 12){
            throw new MonthException("Número não corresponde a nenhum mês do ano");
        }

        return monthNames[validNumber -1];
    }
}
