package Questoes.questao03;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Publicacao {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public abstract String obterResumo();

    @Override
    public String toString() {
        return titulo;
    }
}
