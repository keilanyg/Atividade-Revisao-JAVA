package Questoes.questao01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    private int id;
    private String nome;
    private List<Curso> cursosMatriculados = new ArrayList<>();

    public void adicionarCurso(Curso curso) {
        if (!cursosMatriculados.contains(curso)) {
            cursosMatriculados.add(curso);
        } else {
            System.out.println(this.getNome() + " já está matriculado(a) no curso " + curso.getNome());
        }
    }

    public void removerCurso(Curso curso) {
        if (cursosMatriculados.contains(curso)) {
            cursosMatriculados.remove(curso);
            System.out.println("O curso " + curso.getNome() + " foi removido para " + this.getNome());
        } else {
            System.out.println(this.getNome() + " não está matriculado(a) no curso " + curso.getNome());
        }
    }

}