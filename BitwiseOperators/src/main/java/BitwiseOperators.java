public class BitwiseOperators {
    public static void main(String[] args) {
        /*
         * O que são OPERADORES BIT a BIT?
         * Operadores bitwise operam diretamente nos bits individuais (0s e 1s) dos números inteiros.
         * Eles são muito usados em programação de baixo nível, manipulação de hardware,
         * compressão de dados, jogos, e muito mais.
         * */

        /*
         * &= (AND bit a bit)
         * Faz um E lógico entre cada bit dos dois números.
         * O resultado é 1 apenas se ambos os bits forem 1.
         *
         * */

        int x = 5; // binário: 0101
        int y = 3;// binário: 0011
        x &= y;  // 0101 & 0011 = 0001
        System.out.println("AND");
        System.out.println(x); //1

        /* Formatar Numero Binário
         *
         * Integer.toBinaryString(numero) → converte o decimal para binário (ex: 5 → "101").
         * String.format("%4s", ...) → formata para ocupar 4 caracteres (com espaços à esquerda).
         * .replace(' ', '0') → troca os espaços por zeros.
         *
         * */

        String binarioFormatado = String.format("%4s", Integer.toBinaryString(x)).replace(' ', '0');
        System.out.println(binarioFormatado); // Transforma decimal em binário
        System.out.println("---------------------------------------");


        /*
         *  |= (OR bit a bit)
         * Faz um OU lógico entre os bits.
         * O resultado é 1 se pelo menos um dos bits for 1.
         * */
        int z = 5;
        int k = 3;
        z |= k; // 0101 | 0011 = 0111
        System.out.println("OR");
        System.out.println(z); // 7
        String binarioFormatado2 = String.format("%4s", Integer.toBinaryString(x)).replace(' ', '0');
        System.out.println(binarioFormatado2);
        System.out.println("---------------------------------------");

        /*
         * ^= (XOR bit a bit)
         * Faz um OU exclusivo.
         * O resultado é 1 somente se os bits forem diferentes.
         * */
        int l = 5;
        int p = 3;

        l ^= p; // 0101 ^ 0011 = 0110
        System.out.println("XOR - OU exclusivo");
        System.out.println(l); //6
        String binarioFormatado3 = String.format("%4s", Integer.toBinaryString(x)).replace(' ', '0');
        System.out.println(binarioFormatado3);
        System.out.println("---------------------------------------");

        /*
         * >>= (Deslocamento à direita)
         * Desloca os bits para a direita,
         * descartando os bits à direita e inserindo 0 à esquerda (em inteiros positivos).
         * Isso é equivalente a dividir por 2 elevado à quantidade de deslocamentos.
         * */

        /*
         * Na prática:
         *
         * 1000 (8) >> 1 → 0100 (4)
         * 0100 (4) >> 1 → 0010 (2)
         *
         * */

        int right = 8; // binário: 1000
        right >>= 2;  // move 2 bits → 0010
        System.out.println("Deslocamento bits à direita");
        System.out.println(right); //2
        String binarioFormatado4 = String.format("%4s", Integer.toBinaryString(right)).replace(' ', '0');
        System.out.println(binarioFormatado4);
        System.out.println("---------------------------------------");

        /*
         * <<= (Deslocamento à esquerda)
         * Desloca os bits para a esquerda, adicionando 0s à direita.
         * Isso é equivalente a multiplicar por 2 elevado à quantidade de deslocamentos.
         *
         * */

        /*
        * Na prática
        * 0011 (3) << 1 → 0110 (6)
        * 0110 (6) << 1 → 1100 (12)
        *
        * */

        int left = 3; // binário: 0011
        left <<= 2; // move 2 bits → 1100
        System.out.println("Deslocamento bits à esquerda");
        System.out.println(left);
        String binarioFormatado5 = String.format("%4s", Integer.toBinaryString(left)).replace(' ', '0');
        System.out.println(binarioFormatado5);
        System.out.println("---------------------------------------");

    }
}
