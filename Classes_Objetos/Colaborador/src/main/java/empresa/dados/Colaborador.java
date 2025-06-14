//Pacote armazena a classe Colaborador
//Necessita estar dentro de uma pasta nomeada com o mesmo nome do package
package empresa.dados;

public class Colaborador {
//   public String nome; //modificador acesso public garante a visualização
   private String nome; //modificador acesso private garante visualização dentro da propria classe
    double salario;

    //Construtor privado
    private Colaborador(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    //Sobrecarga de construtor
    protected Colaborador() {
        Colaborador colab = new Colaborador("Mario",4385.00);
    }
}
