// ----------------------------------------------------------
// RESUMO: Funcionamento da Passagem de Parâmetros em Java
// ----------------------------------------------------------
//
// Java sempre usa PASSAGEM POR VALOR (pass-by-value):
//
// 1. Tipos Primitivos (int, double, boolean, etc):
//    - O valor é copiado.
//    - Alterações feitas dentro do metodo NÃO afetam o valor original.
//
//    Exemplo:
//      public void tentarAumentar(int valor) {
//          valor += 10; // Só altera a cópia local.
//      }
//
// 2. Objetos (instâncias de classes):
//    - A cópia da REFERÊNCIA do objeto é passada.
//    - O metodo pode alterar os atributos do objeto original.
//
//    Exemplo:
//      public void mudarNome(Personagem p) {
//          p.nome = "Guerreiro"; // Altera o atributo do objeto original.
//      }
//
// ----------------------------------------------------------
// DICAS DE USO:
//
// ✔ Use tipos primitivos se quiser proteger o valor original.
// ✔ Use objetos quando quiser permitir que o metodo modifique o estado.
// ✔ Para alterar valores primitivos, retorne o novo valor ou use um objeto wrapper.
// ----------------------------------------------------------
public class Personagem {
    //Atributos
    String nome;
    int nivelDePoder;

    //Construtor
    public Personagem(String nome, int nivelDePoder){
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }

    //Metodo que tenta modificar um valor primitivo
     public void tentarAumentarNivelDePoder(int nivelDePoder){
        nivelDePoder += 10;
    }
    // Metodo que recebe modifica um objeto
    public void mudarNome(Personagem personagem) {
        personagem.nome = "Guerreiro";
    }
    //Metodo que realmente aumenta o nível de poder do personagem
    //Esse metodo acessa diretamente o atributo do objeto (this.nivelDePoder), e por isso a alteração persiste.
    public void aumentarNivelDePoder() {
        this.nivelDePoder += 10;
    }
}
