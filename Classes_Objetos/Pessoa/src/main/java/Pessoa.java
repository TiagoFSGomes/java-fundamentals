/*
*  Modificador public: O atributo nome pode ser acessado diretamente de
 qualquer lugar.
 2. Modificador private: O atributo idade só pode ser acessado e modificado
 através dos métodos getIdade e setIdade.
 3. Modificador protected: O atributo endereco pode ser acessado e modificado
 através dos métodos getEndereco e setEndereco.
 4. Modificador default: O atributo telefone pode ser acessado e modificado
 através dos métodos getTelefone e setTelefone
*
* */

import java.sql.SQLOutput;

public class Pessoa {
    //Atributos
    public String nome;
    private int idade;
    protected String endereco;
    String telefone; //modificador defatul

    //Construtor
    public Pessoa(String nome, int idade, String endereco, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    //Metodo get idade
    public int getIdade(){
        return idade;
    }
    //Metodo set idade
    public void setIdade(int idade){
        this.idade = idade;
    }
    //Metodo get endereco
    public String getEndereco(){
        return endereco;
    }
    //Metodo ser endereço
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    //Metodo get telefone
    public String getTelefone(){
        return telefone;
    }
    //Metodo set telefone
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    //Metodo exibir informacoes
    public void exibirNome(){
        System.out.println("Nome: " + nome);
    }
    public void exibirIdade(){
        System.out.println("Idade: " + idade);
    }
    public void exibirEndereco(){
        System.out.println("Endereço: " + endereco);
    }
    public void exibirTelefone(){
        System.out.println("Telefone: " + telefone);
    }
}



