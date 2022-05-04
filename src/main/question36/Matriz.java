package main.question36;

public class Matriz {

    private float[][] matriz;

    public Matriz(float num1, float num2, float num3, float num4) {
        this.matriz = new float[][]{{num1, num2}, {num3, num4}};
    }

    public float[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(float[][] matriz) {
        this.matriz = matriz;
    }

    public float determinante() {
        return matriz[0][0] * matriz[1][1] + (-1 * (matriz[1][0] * matriz[0][1]));
    }

    public void imprime(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
