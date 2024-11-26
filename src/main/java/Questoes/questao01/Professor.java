package Questoes.questao01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor {
    public class Professor {
        private int id;
        private String nome;
        private List<Curso> cursos = new ArrayList<>();

        public void adicionarCurso(Curso curso) {
            cursos.add(curso);
        }

        public void removerCurso(Curso curso) {
            if (cursos.contains(curso)) {
                cursos.remove(curso);
                System.out.println("O curso " + curso.getNome() + " foi removido para esse professor");
            } else {
                System.out.println(this.getNome() + " não ensina no curso " + curso.getNome());
            }
        }
    }

}
