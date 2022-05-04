package main.question32;

public class StaticMethods {

    public static int maiorDeDois(int num1, int num2){
        return Math.max(num1, num2);
    }

    public static double maiorDeDois(double num1, double num2){
        return Math.max(num1, num2);
    }

    public static int maiorDeTres(int num1, int num2, int num3){
        int max = Math.max(num1, num2);
        return Math.max(max, num3);
    }

    public static double maiorDeTres(double num1, double num2, double num3){
        double max = Math.max(num1, num2);
        return Math.max(max, num3);
    }

    public static int maiorDeQuatro(int num1, int num2, int num3, int num4){
        int max1 = Math.max(num1, num2);
        int max2 = Math.max(num3, num4);

        return Math.max(max1, max2);
    }

    public static double maiorDeQuatro(double num1, double num2, double num3, double num4){
        double max1 = Math.max(num1, num2);
        double max2 = Math.max(num3, num4);

        return Math.max(max1, max2);
    }

    public static int maiorDeCinco(int num1, int num2, int num3, int num4, int num5){
        int max1 = Math.max(num1, num2);
        int max2 = Math.max(num3, num4);
        int max3 = Math.max(max1, max2);

        return Math.max(max3, num5);
    }

    public static double maiorDeCinco(double num1, double num2, double num3, double num4, double num5){
        double max1 = Math.max(num1, num2);
        double max2 = Math.max(num3, num4);
        double max3 = Math.max(max1, max2);

        return Math.max(max3, num5);
    }
}
