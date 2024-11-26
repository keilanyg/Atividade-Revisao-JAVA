package Questoes.questao02;

public class Questao2 {
    public void executar() {
        System.out.println("============ QUESTÃO 2 =============");
        Eletronico eletronico = new Eletronico(1, "TV", 3000.00);
        Vestuario vestuario = new Vestuario(1, "Camiseta", 30.00);

        System.out.println("Preço de " + eletronico.getNome() + " com desconto: R$ " + eletronico.calcularDesconto());
        System.out.println("Preço de " + vestuario.getNome() + " com desconto: R$ " + vestuario.calcularDesconto());

        Pagamento pagamentoCartao = new PagamentoCartao(eletronico.calcularDesconto());
        pagamentoCartao.processarPagamento();

        Pagamento pagamentoPix = new PagamentoPix(vestuario.calcularDesconto());
        pagamentoPix.processarPagamento();
    }
}
