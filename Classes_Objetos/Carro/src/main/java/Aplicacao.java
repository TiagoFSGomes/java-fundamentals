/*
* Instruções
Crie uma classe Carro que possua três atributos: marca, modelo e ano. Implemente três construtores diferentes para a classe:

Um construtor padrão que não recebe parâmetros.

Um construtor que recebe marca e modelo.

Um construtor que recebe marca, modelo e ano.

Passos para Realizar o Exercício
Crie uma nova classe Java chamada Carro.

Declare os atributos marca, modelo e ano na classe Carro.

Implemente o construtor padrão que inicializa os atributos com valores padrão.

Implemente o construtor que recebe marca e modelo e inicializa os atributos correspondentes.

Implemente o construtor que recebe marca, modelo e ano e inicializa todos os atributos.

Crie uma classe Aplicacao com o metodo main para testar os diferentes construtores.
*
*
* */
class Carro {
    //atributos
    private  String marca;
    private String modelo;
    private int ano;

    //Construtor-1 - Default
    public Carro(){
        this.marca = "Descohecida";
        this.modelo = "Descohecido";
        this.ano = 0;
    }
    //Construtor-2
    public Carro(String initMarca, String initModelo){
        this.marca = initMarca;
        this.modelo = initModelo;
        this.ano = 0;
    }
    //Construtor-3
    public Carro(String initMarca, String initModelo, int initAno){
        this.marca = initMarca;
        this.modelo = initModelo;
        this.ano = initAno;
    }

    // Metodo para exibir os detalhes do carro
    public void exibirDetalhes(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}
//O arquivo .java deve ter o mesmo nome da classe pública.
public class Aplicacao {
    public static void main(String[] args) {
            // Testando construtor padrão
            Carro carro1 = new Carro();
            carro1.exibirDetalhes();
            //Testando construtor 2
            Carro carro2 = new Carro("Ford", "Focus");
            carro2.exibirDetalhes();
            //Testando construtor 3
            Carro carro3 = new Carro("Volkswagen", "Golf", 2019);
            carro3.exibirDetalhes();
    }
}




