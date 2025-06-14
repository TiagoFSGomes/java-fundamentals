//import empresa.dados.Colaborador;
import empresa.dados.*;//Importa todas as classes de um pacote
public class FolhaDePagamento {
    public static void main(String[] args) {
        //Criando objeto colaborador com base no construtor criado
//        Colaborador colaborador = new Colaborador("Tiago", 6200.00);
//        System.out.println("Nome Colaborador: " + colaborador.nome);
//        System.out.println("Salario Colaborador: "+ colaborador.salario);  //Erro.Atributo privado

        //Acesso pelo construtor default posteriormente o construtor privado
//        Colaborador colaborador = new Colaborador();

        //Acesso pelo construtor TestePackage()  posteriormente o construtor protected
        TestePackage tp = new TestePackage();
    }
}


