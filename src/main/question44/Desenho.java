package main.question44;

import main.question43.FiguraGeometrica;

public class Desenho {
    private FiguraGeometrica figureA;
    private FiguraGeometrica figureB;
    private double coordenadaX, coordenadaY;

    public Desenho(FiguraGeometrica figuraA, FiguraGeometrica figuraB, double coordenadaX, double coordenadaY) {
        this.figureA = figuraA;
        this.figureB = figuraB;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void apresenta() {
        this.figureA.desenha();
        this.figureB.desenha();
        System.out.println("Coordenada x: " + this.coordenadaX + " y: " + this.coordenadaY);
    }

}