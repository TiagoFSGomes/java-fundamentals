//Pacote armazena a classe Colaborador
//Necessita estar dentro de uma pasta nomeada com o mesmo nome do package
package empresa.dados;

public class Colaborador {
    String nome;
    double salario;

    //Construtor
    public Colaborador(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}
