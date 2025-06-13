public class ListaLigada {
    private Elemento inicio;

    public void adicionar(int valor) {
        Elemento novo = new Elemento(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            Elemento atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public void imprimir() {
        Elemento atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " → ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
