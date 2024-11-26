package Questoes.questao03;

import lombok.*;

@Getter
@Setter
public class Livro extends Publicacao{

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return "Livro: " + this.getTitulo() + " (" + this.getAutor() + ")";
    }
}
