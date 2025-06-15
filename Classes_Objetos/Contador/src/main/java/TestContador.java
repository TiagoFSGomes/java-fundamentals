public class TestContador {
    public static void main(String[] args) {
        Contador c1 = new  Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();
        Contador c5 = new Contador();
        System.out.println("Número de objetos criados: " + Contador.contagem);
    }
}

/*
* O que está acontecendo:
A expressão new Contador() cria uma nova instância (objeto) da classe Contador.

Cada linha dessas cria um novo objeto distinto, armazenado em variáveis diferentes (c1, c2, ..., c5).

Toda vez que um objeto é criado, o construtor da classe Contador é chamado, e dentro dele o atributo estático contagem é incrementado.

Resultado:
Ao final, 5 objetos foram instanciados.

O valor de Contador.contagem será 5, pois é um membro estático e foi incrementado 5 vezes no construtor.
*

* */
