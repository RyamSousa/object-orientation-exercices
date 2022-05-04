package main.question39;

public class LivroLivraria extends Livro{

    private int quantidadeEstoque;

    public LivroLivraria(String nome, String autor, int quantidadeEstoque) {
        super(nome, autor);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "LivroLivraria{" + "Nome=" + nome + ", Autor=" + autor + ", Quantidade em Estoque=" + quantidadeEstoque + "}";
    }
}
