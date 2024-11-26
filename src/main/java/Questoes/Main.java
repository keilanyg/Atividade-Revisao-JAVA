package Questoes;
import Questoes.questao01.Questao1;
import Questoes.questao02.Questao2;
import Questoes.questao03.Questao3;
import Questoes.questao04.Questao4;
import Questoes.questao05.Questao5;


public class Main {
    public static void main(String[] args) {
        Questao1 questao1 = new Questao1();
        questao1.executar();

        Questao2 questao2 = new Questao2();
        questao2.executar();

        Questao3 questao3 = new Questao3();
        questao3.executar();

        Questao4 questao4 = new Questao4();
        questao4.executar();

        Questao5 questao5 = new Questao5();
        questao5.executar();
    }
}