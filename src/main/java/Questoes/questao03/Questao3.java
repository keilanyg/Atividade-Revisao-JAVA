package Questoes.questao03;

public class Questao3 {
    public void executar() {
        System.out.println("============ QUESTÃO 3 =============");
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Revista revista1 = new Revista("National Geographic", "John Doe", 2023);

        Biblioteca<Publicacao> biblioteca = new Biblioteca<>();

        biblioteca.adicionarPublicacao(livro1);
        biblioteca.adicionarPublicacao(livro2);
        biblioteca.adicionarPublicacao(revista1);

        System.out.println("Publicações na biblioteca:");
        biblioteca.listarPublicacoes();

        biblioteca.removerPublicacao(livro2);

        System.out.println("\nPublicações após remoção:");
        biblioteca.listarPublicacoes();
    }
}
