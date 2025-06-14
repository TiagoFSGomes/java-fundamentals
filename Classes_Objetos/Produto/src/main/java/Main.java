/*
 * RESUMO DO FUNCIONAMENTO:
 *
 * - A classe principal (`Main`) contém o metodo `main`, ponto de entrada da aplicação.
 * - Dentro do `main`, são criados múltiplos objetos da classe `Produto`, representando diferentes itens com nome, quantidade e preço.
 * - Para cada objeto criado, o metodo `exibirInformacoes()` é chamado, imprimindo os dados do produto no console.
 *
 * - A classe `Produto` possui três atributos principais:
 *   - `nome`: representa o nome do produto.
 *   - `qtdEstoque`: representa a quantidade em estoque (como String).
 *   - `preco`: representa o valor do produto.
 *
 * - O metodo `exibirInformacoes()` é do tipo `void`, ou seja, realiza uma ação (exibir informações) sem retornar nenhum valor.
 *
 * - As classes estão no mesmo pacote (ou diretório), o que permite o uso direto de uma classe pela outra sem necessidade de `import`.
 *
 * - O código é um exemplo de uso de orientação a objetos em Java, utilizando encapsulamento e criação de múltiplas instâncias de uma mesma classe.
 */

//Classe principal
public class Main{
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", "10", 1000);
        produto1.exibirInformacoes();
        System.out.println("---------------------------------------");
        Produto produto2 = new Produto("Computador", "5", 2000);
        produto2.exibirInformacoes();
        System.out.println("---------------------------------------");
        Produto produto3 = new Produto("Impressora", "2", 500);
        produto3.exibirInformacoes();
        System.out.println("---------------------------------------");
        Produto produto4 = new Produto("Mouse", "1", 100);
        produto4.exibirInformacoes();
        System.out.println("---------------------------------------");
        Produto produto5 = new Produto("Teclado", "3", 200);
        produto5.exibirInformacoes();
        System.out.println("---------------------------------------");
        Produto produto6 = new Produto("Monitor", "4", 300);
        produto6.exibirInformacoes();
        System.out.println("---------------------------------------");
        Produto produto7 = new Produto("Headset", "1", 50);
        produto7.exibirInformacoes();
        System.out.println("---------------------------------------");
        Produto produto8 = new Produto("Tablet", "2", 150);
        produto8.exibirInformacoes();
        System.out.println("---------------------------------------");
        Produto produto9 = new Produto("Smartphone", "3", 700);
        produto9.exibirInformacoes();
        System.out.println("---------------------------------------");
        Produto produto10 = new Produto("Webcam", "5", 370);
        produto10.exibirInformacoes();
    }
}