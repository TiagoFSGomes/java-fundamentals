public class Livro {
    //Declação dos atributos
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco; //modificador default

    //Construtor default #1
    public Livro(){
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }
    //Construtor com 2 parametros #2
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0; //Valor default
        this.preco = 0.0; //Valor default
    }
    //Construtor com 4 parametros #3
    public Livro(String titulo, String autor, int anoPublicacao, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    //Metodos
    public void exibirInformacoes(){
        System.out.println("Título: " + titulo + " Autor: " + autor + " Ano Publicacao: " + anoPublicacao + " Preço: " + preco);
    }


}
