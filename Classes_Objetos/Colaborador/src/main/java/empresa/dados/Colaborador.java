// ========================================================
// Modificadores de Acesso em Java - Regras de Visibilidade
// ========================================================

/*
1. public
   - Visível em qualquer lugar (dentro e fora do pacote).

2. protected
   - Visível no mesmo pacote.
   - Visível em subclasses (mesmo fora do pacote).

3. (sem modificador) - package-private
   - Visível apenas dentro do mesmo pacote.
   - Também chamado de "default" (não confundir com palavra-chave `default`).

4. private
   - Visível apenas dentro da própria classe.
*/




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
