package Questoes.questao04;

import lombok.*;
import nunes.karla.questao4.exceptions.SaldoInsuficienteException;
import nunes.karla.questao4.exceptions.ValorInvalidoException;

@Getter
@Setter
public class ContaCorrente extends Conta implements Transacao{
    private final double taxaSaque;

    public ContaCorrente(String numeroConta, String titular, double saldo, double taxaSaque) {
        super(numeroConta, titular, saldo);
        this.taxaSaque = taxaSaque;
    }
    @Override
    public double sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor do saque deve ser positivo.");
        }

        double valorTotal = valor + taxaSaque;
        if (valorTotal > this.getSaldo()) {
            throw new SaldoInsuficienteException("Seu saldo é insuficiente!");
        }
        this.setSaldo(this.getSaldo() - valorTotal);
        System.out.println("Taxa de saque: " + taxaSaque);
        return this.getSaldo();
    }

    @Override
    public double depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor do depósito deve ser positivo.");
        }
        this.setSaldo(this.getSaldo() + valor);
        return this.getSaldo();
    }
}
