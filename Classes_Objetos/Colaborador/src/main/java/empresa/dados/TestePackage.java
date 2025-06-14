package empresa.dados;

public class TestePackage {
    //Contrutor
    public TestePackage(){
        //Criando objeto colaborador com base no construtor criado
        //Buscar em cima do construtor protected de outra classe dentro doutra classe no mesmo pacote de classes
        Colaborador colaborador = new Colaborador();
    }
}
