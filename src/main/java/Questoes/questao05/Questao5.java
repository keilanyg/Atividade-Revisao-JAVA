package Questoes.questao05;

public class Questao5 {
    public void executar() {
        System.out.println("============ QUESTÃO 5 =============");
        Empresa<Funcionario> empresa = new Empresa<>();

        Gerente gerente = new Gerente(1, "Carlos", 5000.0);
        Analista analista = new Analista(2, "Maria", 4000.0);

        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(analista);
        empresa.adicionarFuncionario(new Gerente(1, "Paulo", 6000.0));

        empresa.listarFuncionarios();

        empresa.removerFuncionario(analista);
        empresa.listarFuncionarios();
    }
}
