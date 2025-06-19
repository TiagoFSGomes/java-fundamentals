public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa  = new Pessoa("Joao", 30, "Rua A, 123", "1234-54678");

        //Acessando e modificando os atributos
        pessoa.exibirNome();  // Acesso direto ao public
        pessoa.exibirIdade();  // Acesso via metodo (private) 30
        System.out.println("Idade: "+ pessoa.getIdade()); //metodo get

        pessoa.setIdade(36); //Setando idade 36
        pessoa.exibirIdade(); //Exibindo 36
        System.out.println("Nova idade: " + pessoa.getIdade()); //Exibindo 36

        pessoa.exibirEndereco(); //exibindo endereco
        System.out.println("Endereco: " + pessoa.getEndereco());//exibindo endereco

        pessoa.setEndereco("Avenida Olegário, 456"); //Setando endereço
        pessoa.exibirEndereco();
        System.out.println("Novo endereco: " + pessoa.getEndereco());

        pessoa.exibirTelefone();
        System.out.println("Telefone: " + pessoa.getTelefone());

        pessoa.setTelefone("3261-5698"); //Set numero telefone
        pessoa.exibirTelefone();
        System.out.println("Novo telefone: " + pessoa.getTelefone());
    }
}
