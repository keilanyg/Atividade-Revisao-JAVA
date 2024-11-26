package Questoes.questao01;

import java.util.ArrayList;
import java.util.List;

public class Questao1 {
    public void executar() {
        System.out.println("============ QUESTÃO 1 =============");
        Curso ads = new Curso(1, "ADS", 900);
        Curso informatica = new Curso(2, "Informática", 300);
        Curso alimentos = new Curso(3, "Alimentos", 300);

        Aluno aluno1 = new Aluno(1, "João", new ArrayList<>());
        Aluno aluno2 = new Aluno(2, "José", new ArrayList<>());
        Aluno aluno3 = new Aluno(3, "Maria", new ArrayList<>());

        Professor professor1 = new Professor(1, "Leo", new ArrayList<>(List.of(ads)));
        SistemaEscolar.associarProfessorACurso(professor1, informatica);
        SistemaEscolar.associarProfessorACurso(professor1, informatica);
        SistemaEscolar.associarProfessorACurso(professor1, alimentos);

        SistemaEscolar.matricularAlunoEmCurso(aluno1, ads);
        SistemaEscolar.matricularAlunoEmCurso(aluno1, informatica);

        SistemaEscolar.matricularAlunoEmCurso(aluno2, informatica);
        SistemaEscolar.matricularAlunoEmCurso(aluno2, alimentos);

        SistemaEscolar.matricularAlunoEmCurso(aluno3, ads);

        List<Aluno> alunos = new ArrayList<>(List.of(aluno1, aluno2, aluno3));

        SistemaEscolar.exibirAlunosDeUmCurso(informatica, alunos);
        SistemaEscolar.exibirCursosMinistradosPorProfessor(professor1);
    }
}

