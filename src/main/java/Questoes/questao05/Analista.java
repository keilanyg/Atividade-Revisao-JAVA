package Questoes.questao05;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Analista extends Funcionario implements Bonus{

    public Analista(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + calcularBonus(5); // 5% de bônus
    }

    @Override
    public double calcularBonus(double percentual) {
        return this.getSalarioBase() * percentual / 100;
    }
}
