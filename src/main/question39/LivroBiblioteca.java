package main.question39;

public class LivroBiblioteca extends Livro{

    private String donoBiblioteca;

    public LivroBiblioteca(String nome, String autor, String donoBiblioteca) {
        super(nome, autor);
        this.donoBiblioteca = donoBiblioteca;
    }

    public String getDonoBiblioteca() {
        return donoBiblioteca;
    }

    public void setDonoBiblioteca(String donoBiblioteca) {
        this.donoBiblioteca = donoBiblioteca;
    }

    @Override
    public String toString() {
        return "LivroBiblioteca{" + "Nome="+nome+", Autor="+autor+", Dono="+donoBiblioteca+"}";
    }
}
