package Questoes.questao04;

import nunes.karla.questao4.exceptions.SaldoInsuficienteException;
import nunes.karla.questao4.exceptions.ValorInvalidoException;

public interface Transacao {
    public double sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException;
    public double depositar(double valor) throws ValorInvalidoException;
}
