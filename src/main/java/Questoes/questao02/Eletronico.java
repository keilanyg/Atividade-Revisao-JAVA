package Questoes.questao02;

import lombok.*;

@Getter
@Setter
public class Eletronico extends Produto{
    public Eletronico(int id, String nome, double preco) {
        super(id, nome, preco);
    }
    @Override
    public double calcularDesconto() {
        return this.getPreco() - (this.getPreco() * 0.1); // 10% de desconto
    }
}
