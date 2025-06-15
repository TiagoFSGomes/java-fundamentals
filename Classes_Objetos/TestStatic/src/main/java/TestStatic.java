/*
 * RESUMO: MÉTODOS ESTÁTICOS EM JAVA
 *
 * DEFINIÇÃO:
 * - Métodos estáticos pertencem à classe e **não a instâncias (objetos)** da classe.
 * - São declarados com o modificador `static`.
 *
 * FUNCIONALIDADE:
 * - Podem ser chamados diretamente pela classe, sem precisar criar um objeto.
 *   Ex: NomeDaClasse.metodoEstatico();
 *
 * BENEFÍCIOS:
 * - Úteis para operações utilitárias e funções que não dependem do estado de objetos.
 * - Melhor desempenho em chamadas simples, pois não requerem alocação de instância.
 * - Facilita o acesso a métodos de conveniência (ex: `Math.pow()`, `Arrays.sort()`).

 * REGRAS DE USO:
 * 1. NÃO PODEM ACESSAR ATRIBUTOS OU MÉTODOS NÃO ESTÁTICOS DIRETAMENTE:
 *    - Só podem acessar outros membros estáticos da classe.
 *    - Para acessar atributos ou métodos de instância, é necessário criar um objeto.
 *
 * 2. PODEM SER USADOS COMO MÉTODOS AUXILIARES:
 *    - Ex: funções matemáticas, de formatação, validação etc.
 *
 * 3. PODEM SER UTILIZADOS EM MÉTODOS `main`:
 *    - O método `main` é estático, pois precisa ser executado sem uma instância da classe.
 *
 * 4. PODEM SER HERDADOS, MAS NÃO PODEM SER SOBRESCRITOS:
 *    - Métodos estáticos podem ser redefinidos (ocultar), mas não sobrescritos (override).
 *
 * 5. USO EM CONTEXTOS MULTITHREAD:
 *    - Como são compartilhados por todas as instâncias, devem ser usados com cuidado em ambientes concorrentes.
 */
/*
 * BENEFÍCIOS DOS MÉTODOS ESTÁTICOS EM JAVA
 *
 * 1. ACESSO SEM INSTÂNCIA:
 *    - Podem ser chamados diretamente pelo nome da classe, sem criar objetos.
 *    - Ex: Utilidade rápida como Math.sqrt(), System.out.println(), etc.
 *
 * 2. ECONOMIA DE MEMÓRIA:
 *    - Como não precisam de instâncias, evitam o consumo de memória com objetos desnecessários.
 *
 * 3. MELHOR PERFORMANCE:
 *    - Levemente mais rápidos em tempo de execução, pois o acesso é direto via classe.
 *
 * 4. ORGANIZAÇÃO DE FUNÇÕES UTILITÁRIAS:
 *    - Ideal para agrupar funções auxiliares, como validações, cálculos ou conversões.
 *    - Ex: classes utilitárias como `Math`, `Collections`, `Arrays`, etc.
 *
 * 5. CLAREZA E SIMPLICIDADE:
 *    - Deixam claro que a lógica não depende do estado da instância.
 *    - Facilitam a leitura e manutenção do código.
 *
 * 6. COMPARTILHAMENTO ENTRE INSTÂNCIAS:
 *    - Como são da classe, o mesmo metodo é compartilhado por todas as instâncias.
 *    - Útil para lógica comum ou constante entre objetos.
 */


public class TestStatic {
    //Metodo estatico sobrecarregado #1
    public static void exibirValor(int a){
        System.out.println("O valor inteiro é: " + a);
    }

    //Metodo estatico sobrecarregado #2
    public static void exibirValor(String str) {
        System.out.println("A string é: " + str);
    }

public static void main(String[] args) {
        //Chamando metodo 1
//        TestStatic.exibirValor(10); //Chamando o metodo estatico pelo nome da classe. Sem criar objeto
        //exibirValor(10)

        //Chamando metodo 2
        TestStatic.exibirValor("Métodos estáticos pertencem à classe e não a instâncias (objetos)");

    }
}
