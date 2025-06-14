import empresa.dados.RemuneracaoFuncionario;

class Main {
    public static void main(String[] args) {
        //Criação do Objeto
        RemuneracaoFuncionario funcionario = new RemuneracaoFuncionario("Tiago", 5000);
        //Chamada dos Metodos
        funcionario.aumentarSalario(100.20);
        funcionario.exibirInformacoes();
    }
}
