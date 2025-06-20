// -----------------------------------------------------------------------------
// HERANÇA EM JAVA - RESUMO
// -----------------------------------------------------------------------------

// ➤ CONCEITO:
// Herança é um dos pilares da Programação Orientada a Objetos (POO).
// Permite que uma classe (subclasse ou classe filha) herde atributos e métodos
// de outra classe (superclasse ou classe pai).

// ➤ SINTAXE:
// class Subclasse extends Superclasse {
//     // Subclasse herda tudo que for public ou protected da Superclasse
// }

// ➤ EXEMPLO:
// class Animal {
//     void fazerSom() { System.out.println("Algum som"); }
// }
//
// class Cachorro extends Animal {
//     void abanarRabo() { System.out.println("Abanando o rabo"); }
// }
//
// Cachorro c = new Cachorro();
// c.fazerSom();     // Metodo herdado da classe Animal
// c.abanarRabo();   // Metodo próprio da classe Cachorro

// ➤ APLICAÇÃO PRÁTICA:
// Usada quando várias classes compartilham características comuns.
// Permite reutilização de código e organização hierárquica de classes.
// Ideal para modelar hierarquias: Ex: Veículo → Carro, Moto, Caminhão.

// ➤ BENEFÍCIOS:
// ✔ Reutilização de código (evita repetição).
// ✔ Facilita manutenção e extensão de funcionalidades.
// ✔ Permite polimorfismo (uma referência da superclasse pode apontar para objetos das subclasses).
// ✔ Melhora a organização lógica das classes (relacionamento “é um”).

// ➤ CUIDADOS:
// ✘ Evitar herança excessiva ou desnecessária (pode levar a código rígido).
// -----------------------------------------------------------------------------

//Super class
class Animal {
    public void comer(){
        System.out.println("Todo animal come");
    }
}
// Subclasse
class Cachorro extends Animal{
    public void latir(){
        System.out.println("O Cachorro late");
    }
}


