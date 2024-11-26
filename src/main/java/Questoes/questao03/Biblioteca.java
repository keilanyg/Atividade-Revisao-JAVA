package Questoes.questao03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Biblioteca<T extends Publicacao> {
    private List<T> publicacoes = new ArrayList<T>();

    public void adicionarPublicacao(T publicacao) {
        publicacoes.add(publicacao);
        System.out.println("Publicação " + publicacao.toString() + " adicionada");
    }

    public void removerPublicacao(T publicacao) {
        if (!publicacoes.contains(publicacao)) {
            System.out.println("A publicação " + publicacao + "não existe nessa biblioteca!");
        } else {
            publicacoes.remove(publicacao);
        }
    }

    public void listarPublicacoes() {
        if (publicacoes.isEmpty()) {
            System.out.println("Ainda não há publicações nessa biblioteca.");
        } else {
            publicacoes.forEach(publicacao -> System.out.println(publicacao.obterResumo()));
        }
    }
}
