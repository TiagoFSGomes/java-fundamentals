public class Aplicacao {
    public static void main(String[] args) {
        //Teste construtor #1
        Livro livro1= new Livro();
        livro1.exibirInformacoes();
        // Não é possível acessar diretamente 'autor' pois é private
        //System.out.println("Autor: " + livro1.autor);

        //Teste construtor #2
        Livro livro2  = new Livro("1984",  "George Orwell");
        livro2.exibirInformacoes();

        //Teste construtor #3
        Livro livro3 = new Livro("Senhor dos Anéis", "J.R.R. Tolkien", 1954, 49.90);
        livro3.exibirInformacoes();
    }
}
