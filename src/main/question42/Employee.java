package main.question42;

public class Employee {

    private String nome;
    private double valorHora;
    private double salario;

    public Employee(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public Employee(String nome) {
        this.nome = nome;
        this.valorHora = 2;
    }

    public void salaryCalc(int amountHours){
        this.setSalario(this.getValorHora() * amountHours);
    }

    public String getNome() {
        return nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario: \n"+
        "\tNome: "+ this.nome + "\n"+
        "\tValor por hora: "+ this.valorHora + "\n"+
        "\tSalario: "+ this.salario;
    }
}
