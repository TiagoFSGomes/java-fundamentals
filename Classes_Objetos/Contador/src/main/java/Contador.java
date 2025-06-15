/*
 * Regras, Vantagens e Desvantagens do uso de Atributos Estáticos em Java
 *
 * Regras:
 * - Atributos estáticos (static) pertencem à classe, e não às instâncias (objetos).
 * - São compartilhados por todas as instâncias da classe.
 * - Podem ser acessados diretamente pela classe: NomeDaClasse.atributo.
 * - Não é necessário instanciar um objeto para acessá-los.

 * Vantagens:
 * - Economia de memória: apenas uma cópia do atributo é criada na memória.
 * - Útil para valores que devem ser compartilhados entre todas as instâncias (ex: contadores, configurações globais).
 * - Fácil acesso sem necessidade de criar objetos.

 * Desvantagens:
 * - Pode levar a problemas de concorrência (race condition) em aplicações multithread se não for bem sincronizado.
 * - Dificulta o uso de princípios de orientação a objetos como encapsulamento e herança, pois cria forte acoplamento.
 * - Dificulta testes unitários, pois o estado é global e pode ser alterado por qualquer parte da aplicação.
 */

public class Contador {
    //Atibutos, membros estaticos
    static int contagem = 0;

    //Contrutor
    public Contador(){
        contagem++;
    }
}

