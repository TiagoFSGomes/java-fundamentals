public class Bolo {

    /*
     * Resumo dos conceitos usados no código:
     * Classe: molde/estrutura que define atributos e métodos. Ex: Bolo.
     * Atributo: característica dos objetos. Ex: quantidadeAcucar.
     * Objeto: instância concreta da classe. Ex: bolodeChocolate, boloBaunilha.
     * Metodo: ação ou comportamento que a classe pode executar. Ex: main().
     *
     * */

    //Variáveis de instância - Atributos
    //Variaveis primitiva numerica é sempre iniciada com 0
    int quantidadeAcucar;

    //Metodo principal
    public static void main(String[] args) {

        //Criação do objeto - declarando um objeto instância da classe Bolo
        Bolo bolodeChocolate = new Bolo();
        bolodeChocolate.quantidadeAcucar = 200;

        Bolo boloBaunilha = new Bolo();
        boloBaunilha.quantidadeAcucar = 150;

        System.out.println(" Quantidade de Açucar no bolo de Chocolate: " + bolodeChocolate.quantidadeAcucar + " gramas");
        System.out.println(" Quantidade de Açucar no bolo de Baunilha: " + boloBaunilha.quantidadeAcucar + " gramas");

    }
}
