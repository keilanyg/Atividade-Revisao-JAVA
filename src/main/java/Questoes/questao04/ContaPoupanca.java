package Questoes.questao04;

import lombok.Getter;
import lombok.Setter;
import nunes.karla.questao4.exceptions.SaldoInsuficienteException;
import nunes.karla.questao4.exceptions.ValorInvalidoException;

@Getter
@Setter
public class ContaPoupanca extends Conta implements Transacao{
    private final double limiteSaqueDiario;
    private double totalSacadoHoje = 0;

    public ContaPoupanca(String numeroConta, String titular, double saldo, double limiteSaqueDiario) {
        super(numeroConta, titular, saldo);
        this.limiteSaqueDiario = limiteSaqueDiario;
    }
    @Override
    public double sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor do saque deve ser positivo.");
        }

        if (valor > this.getSaldo()) {
            throw new SaldoInsuficienteException("Seu saldo é insuficiente!");
        }

        if (totalSacadoHoje + valor > limiteSaqueDiario){
            throw new SaldoInsuficienteException("O valor do saque excede o limite diário permitido!");
        }

        this.setSaldo(this.getSaldo() - valor);
        totalSacadoHoje += valor;
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
