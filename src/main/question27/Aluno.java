package main.question27;

public class Aluno {

    private int matricula;

    private String nome;

    private double notaTrabalho;

    private double notaProva1;

    private double notaProva2;

    public double media(){
       return  ((notaProva1 * 2.5) + (notaProva2 * 2.5) + (notaTrabalho * 2)) / 7;
    }

    public double provaFinal(){
        double media = media();

        if (media < 7.0){
            return 7.0 - media;
        }

        return 0;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }
}
