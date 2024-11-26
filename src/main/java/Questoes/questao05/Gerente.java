package Questoes.questao05;

import lombok.*;

@Getter
@Setter
public class Gerente extends Funcionario implements Bonus{

    public Gerente(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + calcularBonus(10); // 10% de bônus
    }

    @Override
    public double calcularBonus(double percentual) {
        return this.getSalarioBase() * percentual / 100;
    }
}
