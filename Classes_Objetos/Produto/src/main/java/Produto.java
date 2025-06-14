public class Produto {
    //Atributos da classe
    private String nome;
    private String qtdEstoque;
    private double preco;

    //Construtor da Classe publico
    public Produto(String nomeInit, String qtdEstoqueInit, double precoInit){
        this.nome = nomeInit;
        this.qtdEstoque = qtdEstoqueInit;
        this.preco = precoInit;
    }
    //Metodo exibir informacoes
    //O modificador void indica que o metodo nao retorna nenhum valor.
    public void exibirInformacoes(){
        System.out.println("Nome produto: "+ nome);
        System.out.println("Valor do produto: "+ preco);
        System.out.println("Quantidade em estoque: "+ qtdEstoque);
    }
}
