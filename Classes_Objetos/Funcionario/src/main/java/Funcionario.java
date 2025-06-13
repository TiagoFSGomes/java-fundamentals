public class Funcionario {
    // Variaveis membros da classe
    String nome;
    String cargo;
    int idade;

    /*
    * Construtor Java
    * Metodo especial usado para inicializar objetos quando eles são criados.
    * Repete o nome da classe.
    * this é uma referência ao objeto atual da classe.
    * */


    //Funcionario(String nomeInit, String cargoInit, int idadeInit){} Caso não queira usar o .this

    Funcionario(String nome, String cargo, int idade){
        //Variaveis locais
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    /*
    * Construtor default
    * Em Java, construtor default (ou construtor padrão) é o construtor
    * sem parâmetros fornecido automaticamente pelo compilador caso você não declare nenhum construtor na classe.
    * */
    Funcionario(){
    }
    //Sobrecarga de Construtores
    Funcionario(String nomeInit){
        nome = nomeInit;
    }

    public static void main(String[] args) {

          // Funcionario funcionario = new Funcionario("Tiago", "Desenvolvedor", 30);
//        funcionario.nome = "Tiago";
//        funcionario.cargo = "Desenvolvedor";
//        funcionario.idade = 30;

        //Utilizando com construtor default
//        Funcionario funcionario = new Funcionario();
//        funcionario.nome = "Tiago";

        //Objeto criado utilizado construtor de sobrecarga
        Funcionario funcionario = new Funcionario("Tiago");

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);

        Funcionario funcionario2 = new Funcionario("Maria", "Gerente", 25);
//        funcionario2.nome = "Maria";
//        funcionario2.cargo = "Gerente";
//        funcionario2.idade = 25;

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);


    }
}
