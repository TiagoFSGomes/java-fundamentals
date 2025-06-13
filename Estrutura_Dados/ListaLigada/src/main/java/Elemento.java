// Define uma classe pública chamada Elemento (cada nó/elemento da lista ligada será uma instância desta classe).
public class Elemento{
    // Declara um campo inteiro chamado valor que armazenará o dado do elemento.
    int valor;

    //Declara uma referência para outro objeto elemento, ou seja, para o próximo elemento da lista.
    Elemento proximo;

    //Construtor da classe. Recebe um valor inteiro ao criar um novo elemento.
    public Elemento(int valor) {
        //Atribui o valor recebido ao campo valor deste nó.
        this.valor = valor;
        // Inicializa a referência proximo como null (ou seja, por padrão este nó não aponta para ninguém).
        this.proximo = null;
    }
}