package main.question29;

public class Contador {

    private int valor;

    public void zerar(){
        this.valor = 0;
    }

    public void incrementar(){
        this.valor++;
    }

    public void imprimir(){
        System.out.println("Valor = "+this.valor);
    }
}
