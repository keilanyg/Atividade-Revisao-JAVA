package Questoes.questao02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoPix implements Pagamento{
    private double valor;
    @Override
    public boolean processarPagamento() {
        System.out.println("Pagamento via PIX de R$ " + this.valor + " realizado com sucesso!");
        return true;
    }
}
