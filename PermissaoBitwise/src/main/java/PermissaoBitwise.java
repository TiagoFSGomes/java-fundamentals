/*
 * Projeto: Controle de Permissões com Bits (ACL)
 *
 * Objetivo:
 * Simular um sistema de controle de permissões (como permissões de arquivos)
 * usando flags binárias para indicar permissões como:
 *
 *  1 = leitura / 2 = escrita / 4 = execução
 *
 * Combinação:
 * | Leitura + Escrita | 1 + 2 = 3 | 011 |
 * | Leitura + Execução | 1 + 4 = 5 | 101 |
 * | Todas | 1 + 2 + 4 = 7 | 111 |
 *
 * */


public class PermissaoBitwise {

    /*
     *  DEFINIÇÃO DE CONSTANTES EM JAVA!
     * Essas linhas declaram constantes em Java — ou seja, um valor fixo que não muda durante a execução do programa.
     * public - Visibilidade pública: a constante pode ser acessada de qualquer lugar do programa (inclusive por outras classes).
     * static - A constante pertence à classe, não a uma instância. Pode ser acessada PermissaoBitwise.LEITURA;
     * final - Torna o valor imutável após atribuição. Uma vez definido, você não pode mudar
     * Por convenção, nomes de constantes são escritos em maiúsculas
     * */
    public static final int LEITURA = 1; //0001
    public static final int ESCRITA = 2; //0010
    public static final int EXECUCAO = 4; // 0100

    public static void main(String[] args) {

        int permissoes = 0; // 0000 Nenhuma permissão

        //Conceder permissão
        // Operador OR
        permissoes |= LEITURA;  //0000 | 0001 = 0001 = 1
        permissoes |= ESCRITA; // 0001 | 0010 = 0011 = 3 (atual)

        //print permissão atual
        System.out.println("Nivel de permissão atual: " + permissoes);
        System.out.println("---------------------------------------------");


        //Verificação de permissões
        //Saber se o bit de leitura está ativado.
        // Isso é uma operação bit a bit (bitwise)
        if ((permissoes & LEITURA) != 0) { //0011 & 0001 = 0001
            System.out.println("Nivel de permissão: Leitura");
        }
        //Saber se o bit de leitura está ativado.
        if ((permissoes & ESCRITA) != 0) { //0011 & 0010 = 0010
            System.out.println("Nivel de permissao: Escrita");
        }

        if ((permissoes & EXECUCAO) != 0) {//0011 & 0100 = 0000
            System.out.println("Nivel de permissao: Execucao");
        } else {
            System.out.println("Nivel de permissao: Sem permissao de execucao");
        }


        //Remover permissão escrita
        permissoes &= ~ESCRITA; // Inverte 010 = 101 → AND com 011 = 001
        System.out.println("Permissões após remover escrita: " + permissoes);

        // Alternar (XOR)
        /*XOR (^) — Alternar bits: O resultado é 1 somente se os bits forem diferentes.
        Se o bit já estiver ligado (1), desliga (0).
        Se o bit estiver desligado (0), liga (1).*/

        /*
         * permissoes: 0001
         * EXECUCAO:   0100
         * ----------------
         * Resultado:  0101 → leitura + execução
         *
         * */

        permissoes ^= EXECUCAO; // Adiciona execução
        System.out.println("Permissões após alternar execução: " + permissoes);


        /*
=== Operadores Bit a Bit em Java ===

    1. &  (AND)
       - Verifica se um bit está ativado (1).
       - Usado para checar se uma permissão está presente.
       - Ex: if ((permissoes & LEITURA) != 0)

    2. |  (OR)
       - Ativa (liga) um bit sem afetar os outros.
       - Usado para adicionar permissões.
       - Ex: permissoes |= EXECUCAO;

    3. ^  (XOR)
       - Alterna o estado de um bit (se 1 vira 0, se 0 vira 1).
       - Usado para ligar/desligar uma permissão.
       - Ex: permissoes ^= ESCRITA;

    4. ~  (NOT)
       - Inverte todos os bits.
       - Usado em conjunto com & para remover permissões.
       - Ex: permissoes &= ~ESCRITA;

    === Exemplo prático de permissões ===

    LEITURA  = 1  // 0001
    ESCRITA  = 2  // 0010
    EXECUCAO = 4  // 0100

    permissoes |= LEITURA;            // Ativa leitura
    permissoes |= ESCRITA;            // Ativa escrita
    permissoes &= ~ESCRITA;           // Remove escrita
    permissoes ^= EXECUCAO;           // Alterna execução
    if ((permissoes & LEITURA) != 0)  // Verifica leitura
        System.out.println("Pode ler");

    === Resumo Rápido ===

    &   → verificar bit
    |   → ativar bit
    ^   → alternar bit
    ~   → inverter bit (usado com & para remover)

*/

    }
}


