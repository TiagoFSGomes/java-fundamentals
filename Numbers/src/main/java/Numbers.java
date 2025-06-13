public class Numbers {
    public static void main(String[] args) {

        //byte
        // armazenar números inteiros de -128 para 127
        byte myNum = 127;
        System.out.println(myNum);
        System.out.println("Type: " + ((Object)(myNum)).getClass().getSimpleName());

        //O tipo de dados pode armazenar números inteiros de -32768 a 32767:short
        short myNum2 = 32767;
        System.out.println(myNum2);
        System.out.println("Type: " + ((Object)(myNum2)).getClass().getSimpleName());

        //O tipo de dados pode armazenar números inteiros de -2147483648 a 2147483647.
        int myNum3 = 2147483647;
        System.out.println(myNum3);
        System.out.println("Type: " + ((Object)(myNum3)).getClass().getSimpleName());

        //O tipo de dados pode armazenar números inteiros de -9223372036854775808 a 9223372036854775807.
        // Isso é usado quando int não é grande o suficiente para armazenar o valor.
        // Observe que você deve terminar o valor com um "L":long

        long myNum4 = 9223372036854775807L;
        System.out.println(myNum4);
        System.out.println("Type: " + ((Object)(myNum4)).getClass().getSimpleName());

        //Os tipos de dados and podem armazenar números fracionários.
        // Observe que você deve terminar o valor com um "f" para floats e "d" para doubles:floatdouble
        float myNum5 = 3.14159265358979323846f;
        double myNum6 = 3.14159265358979323846d;
        System.out.println(myNum5);
        System.out.println("Type: " + ((Object)(myNum5)).getClass().getSimpleName());
        System.out.println(myNum6);
        System.out.println("Type: " + ((Object)(myNum6)).getClass().getSimpleName());
    }
}
