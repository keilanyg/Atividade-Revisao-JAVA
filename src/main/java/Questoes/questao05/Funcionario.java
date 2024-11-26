package Questoes.questao05;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Funcionario {
    private int id;
    private String nome;
    private double salarioBase;
    public abstract double calcularSalario();
}
