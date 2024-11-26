package Questoes.questao04;

import nunes.karla.questao4.exceptions.SaldoInsuficienteException;
import nunes.karla.questao4.exceptions.ValorInvalidoException;

public class Questao4 {
    public void executar(){
        System.out.println("============ QUESTÃO 4 =============");
        try {
            ContaCorrente contaCorrente = new ContaCorrente("123.456", "Karla", 500.00, 20.00);
            System.out.println("Saldo inicial Conta Corrente: " + contaCorrente.getSaldo());
            contaCorrente.depositar(100.0);
            System.out.println("Saldo após depósito: " + contaCorrente.getSaldo());
            contaCorrente.sacar(50.0);
            contaCorrente.sacar(1000);
            System.out.println("Saldo após saque: " + contaCorrente.getSaldo());
        } catch (SaldoInsuficienteException | ValorInvalidoException e) {
            System.out.println("Erro em Conta Corrente: " + e.getMessage());
        }

        System.out.println("------------------------------------------");

        try {
            ContaPoupanca contaPoupanca = new ContaPoupanca("456.789", "Luan", 3000.00, 500.00);
            System.out.println("Saldo inicial Conta Poupança: " + contaPoupanca.getSaldo());
            contaPoupanca.depositar(200.0);
            System.out.println("Saldo após depósito: " + contaPoupanca.getSaldo());
            contaPoupanca.sacar(400.0);
            System.out.println("Saldo após saque: " + contaPoupanca.getSaldo());
            contaPoupanca.sacar(200.0);
        } catch (SaldoInsuficienteException | ValorInvalidoException e) {
            System.out.println("Erro na Conta Poupança: " + e.getMessage());
        }
    }
}
