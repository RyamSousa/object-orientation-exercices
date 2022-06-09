package main.question44;

import main.question43.Circulo;
import main.question43.Quadrado;
import main.question43.Triangulo;

public class Main {
    public static void main(String[] args) {
        Desenho drawing1 = new Desenho(new Circulo(), new Quadrado(), 1, 3);
        drawing1.apresenta();

        System.out.println();

        Desenho drawing2 = new Desenho(new Quadrado(), new Triangulo(), 2, 4);
        drawing2.apresenta();
    }
}