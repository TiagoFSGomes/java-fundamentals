/*
*  2. Classe TesteSalaDeAula:
 Metodo main: Este metodo cria três instâncias da classe SalaDeAula para
 ilustrar que a variável totalAlunos é compartilhada entre todas as
 instâncias. Em seguida, chama o metodo adicionarAluno três vezes para
 simular a adição de alunos e, finalmente, chama o metodo
 exibirTotalAlunos para mostrar o total de alunos na sala.
*
* */

public class TesteSalaDeAula {
    public static void main(String[] args) {
        //Cirando instâncias da classe SalaDeAula
        SalaDeAula sala1 = new SalaDeAula();
        SalaDeAula sala2 = new SalaDeAula();
        SalaDeAula sala3 = new SalaDeAula();
        SalaDeAula sala4 = new SalaDeAula();

        //Adicionando Alunos
        SalaDeAula.adicionarAlunos();
        SalaDeAula.adicionarAlunos();
        SalaDeAula.adicionarAlunos();
        SalaDeAula.adicionarAlunos();

        //Exibindo o numero total de alunos
        SalaDeAula.exibirTotalAlunos();


    }
}
