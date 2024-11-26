package Questoes.questao02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Produto {
    private int id;
    private String nome;
    private double preco;

    public abstract double calcularDesconto();
}
