package Questoes.questao03;

public class Revista extends Publicacao{
    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return "Revista: " + this.getTitulo() + " (" + this.getAnoPublicacao() + ")";
    }
}
