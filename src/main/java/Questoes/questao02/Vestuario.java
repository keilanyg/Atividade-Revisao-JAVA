package Questoes.questao02;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vestuario extends Produto{
    public Vestuario(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return this.getPreco() - (this.getPreco() * 0.2); // 20% de desconto
    }
}
