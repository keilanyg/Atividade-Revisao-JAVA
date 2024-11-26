package Questoes.questao02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoCartao implements Pagamento{
    private double valor;

    @Override
    public boolean processarPagamento() {
        System.out.println("Pagamento via cartão de R$ " + this.valor + " processado com sucesso!");
        return true;
    }
}
