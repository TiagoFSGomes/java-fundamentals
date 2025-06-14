/*
 * RESUMO: SOBRECARGA DE MÉTODOS EM JAVA
 *
 * - A sobrecarga de métodos (method overloading) ocorre quando uma classe possui dois ou mais métodos
 *   com o mesmo nome, mas com **assinaturas diferentes**.
 *
 * REGRAS DA SOBRECARGA:
 *
 * 1. MESMO NOME:
 *    - Os métodos devem ter exatamente o mesmo nome.
 *
 * 2. PARÂMETROS DIFERENTES:
 *    - A diferença deve estar na lista de parâmetros:
 *      -> Quantidade de parâmetros
 *      -> Tipo dos parâmetros
 *      -> Ordem dos parâmetros
 *    - Apenas o nome diferente de parâmetros não é suficiente.
 *
 * 3. RETORNO NÃO DIFERENCIA:
 *    - O tipo de retorno (ex: `int`, `void`) **não é considerado** para sobrecarga.
 *    - Métodos com o mesmo nome e mesmos parâmetros, mas tipos de retorno diferentes, causam erro de compilação.
 *
 * 4. MODIFICADORES DE ACESSO:
 *    - Pode-se usar modificadores diferentes (`public`, `private`, etc.), mas eles não influenciam na sobrecarga.
 *
 * 5. EXEMPLOS VÁLIDOS:
 *    - metodo()
 *    - metodo(int a)
 *    - metodo(double a, int b)
 *    - metodo(String texto)
 *
 * BENEFÍCIOS:
 * - Melhora a legibilidade e reutilização do código.
 * - Permite oferecer diferentes formas de executar uma ação com base nos dados disponíveis.
 */

package empresa.dados;

public class RemuneracaoFuncionario {
    //Atributos
    private String nome;
    public double salario;

    //Construtor
    public RemuneracaoFuncionario(String nomeInit, double salarioInit){
        nome = nomeInit;
        salario = salarioInit;
    }

    //Sobrecarga de Metodos
    //Aumenta Salario com base em um valor primitivo double
    public void aumentarSalario(double aumento){
        salario += aumento;
    }
    //Sobrecarga de Metodos
    //Aumenta Salario com base em um valor primitivo int - Porcentagem
    public void aumentarSalario(int porcentagem){
        salario += salario * (porcentagem / 100.0);
    }
    //Metodo exibir informacoes
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + ", Salario: " + salario);
    }

}
