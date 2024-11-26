package Questoes.questao01;

import java.util.List;

public abstract class SistemaEscolar {
    public static void matricularAlunoEmCurso(Aluno aluno, Curso curso) {
        if (!aluno.getCursosMatriculados().contains(curso)) {
            aluno.adicionarCurso(curso);
            System.out.println("O aluno(a) " + aluno.getNome() + " foi matriculado no curso " + curso.getNome());
        } else {
            System.out.println("O aluno(a) " + aluno.getNome() + " já está matriculado em " + curso.getNome());
        }
    }

    public static void associarProfessorACurso(Professor professor, Curso curso) {
        if (!professor.getCursos().contains(curso)) {
            professor.adicionarCurso(curso);
            System.out.println("O professor(a) " + professor.getNome() + " foi adicionado ao curso " + curso.getNome());
        } else {
            System.out.println("O professor(a) " + professor.getNome() + " já ensina em " + curso.getNome());
        }
    }

    public static void exibirAlunosDeUmCurso(Curso curso, List<Aluno> alunos) {
        System.out.println("Alunos matriculados no curso " + curso.getNome());

        List<Aluno> alunosMatriculados = alunos
                .stream()
                .filter(aluno -> aluno.getCursosMatriculados().contains(curso))
                .toList();

        if (alunosMatriculados.isEmpty()){
            System.out.println("Nenhum aluno matriculado no curso " + curso.getNome());
        } else {
            alunosMatriculados.forEach(aluno -> System.out.println(" - " + aluno.getNome()));
        }
    }

    public static void exibirCursosMinistradosPorProfessor(Professor professor) {
        System.out.println("Cursos ministrados pelo professor(a) " + professor.getNome());

        if (professor.getCursos().isEmpty()) {
            System.out.println("O professor(a) " + professor.getNome() + " não está ministrando nenhum curso");
        } else {
            professor.getCursos().forEach(curso -> System.out.println(" - " + curso.getNome()));
        }
    }
}