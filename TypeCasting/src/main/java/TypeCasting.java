public class TypeCasting {
    public static void main(String[] args) {

        /*
         * 1. Widening Casting (Conversão Ampla / Implícita)
         * É a conversão automática de um tipo menor para um tipo maior, sem risco de perda de dados.
         * byte → short → char → int → long → float → double
         * */

        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myDouble);

        /*
         * 2. Narrowing Casting (Conversão Estreita / Explícita)
         * É a conversão manual de um tipo maior para um tipo menor, o que pode causar perda de dados.
         * double → float → long → int → char → short → byte
         *
         * */

        double myDouble2 = 12.3456789;
        int myInt2 = (int) myDouble2;
        System.out.println(myInt2); //A parte decimal foi perdida, porque int só armazena números inteiros.

        // Exemplo

        int maxScore = 500; //max score
        int userScore = 423; //atual score'
        //type casting - int -> float
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("User score: " + percentage + "%");


    }
}
