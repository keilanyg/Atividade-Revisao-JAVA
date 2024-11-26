package Questoes.questao05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa<T extends Funcionario> {
    private List<T> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(T funcionario) {
        if(funcionarios.stream().anyMatch(f -> f.getId() == funcionario.getId())) {
            System.out.println("Já existe um funcionário com id = " + funcionario.getId());
        } else {
            funcionarios.add(funcionario);
            System.out.println("Funcionário(a) " + funcionario.getNome() + " adicionado com sucesso!");
        }
    }

    public void removerFuncionario(T funcionario) {
        Optional<T> funcionarioEncontrado = funcionarios
                .stream()
                .filter(f -> f.getId() == funcionario.getId())
                .findFirst();

        if (funcionarioEncontrado.isPresent()) {
            funcionarios.remove(funcionarioEncontrado.get());
            System.out.println("Funcionário(a) " + funcionario.getNome() + " removido com sucesso!");
        } else {
            System.out.println("Funcionário(a) de id " + funcionario.getId() + " não encontrado!");
        }

    }

    public void listarFuncionarios() {
        funcionarios.forEach(f -> System.out.println("Funcionário " + f.getNome() + " | Salário: R$ " + f.calcularSalario()));
    }
}
