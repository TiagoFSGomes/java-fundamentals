package restaurante.dados;

// O modificador 'private' implementa o encapsulamento ao:
// - Ocultar os atributos internos da classe.
// - Impedir acesso direto externo aos dados.
// - Forçar o uso de métodos (get/set) para controle e validação.
// - Proteger a integridade do estado do objeto.

public class Alimentacao {
    private String refeicao; //encapsulamento
    private double valor;

    //construtor publico de classe
    public Alimentacao(String refeicao, double valor){
        this.refeicao = refeicao;
        this.valor = valor;
    }
    //metodo
    // acesso controlado via métodos públicos
    public String obterTicket(){
        return refeicao + " - R$ " + valor;
    }

}
