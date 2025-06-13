public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.imprimir(); // Deve exibir: 10 → 20 → 30 → null
    }
}