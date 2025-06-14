import restaurante.dados.Alimentacao;
class PagamentoTicket {
    public static void main(String[] args) {
        Alimentacao alimento = new Alimentacao("Lasanha", 45.00);
        System.out.println(alimento.obterTicket()); //Objeto + nome do metodo
    }
}
