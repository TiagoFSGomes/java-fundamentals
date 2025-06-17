/*
* Explicação do código
 1. Classe SalaDeAula:
 Variável estática totalAlunos: Esta variável é usada para contar o
 número total de alunos na sala de aula. Como é estática, ela pertence à
 classe e não a instâncias individuais.
 Metodo estático adicionarAluno: Este metodo incrementa a variável
 totalAlunos em 1 cada vez que é chamado.
 Metodo estático exibirTotalAlunos: Este metodo exibe o valor atual da
 variável totalAlunos.
*
* */

public class SalaDeAula {
    //Variavel contagem do total de alunos
    static int totalAlunos = 0;

    //Metodo estatico para dicionar alunos
    public static void adicionarAlunos(){
        totalAlunos++;
    }
    //Metodo estatico para exibir o numero total de alunos
    public static void exibirTotalAlunos(){
        System.out.println("Total de alunos na sala: " + totalAlunos);
    }
}
