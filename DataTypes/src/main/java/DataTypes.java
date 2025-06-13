public class DataTypes {
    public static void main(String[] args) {
        /*
         * Tipos de dados Java
         * Uma variável em Java deve ser um tipo de dados especificado
         *
         * */


        // tipos de dados primitivos
        int myNum = 5; // inteiro
        float myFloatNum = 5.99f; // ponto flutuante
        char myLetter = 'D'; //caractere
        boolean myBool = true; //booleano
        String myString = "Hello"; //string

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myString);

        //Mostrando o tipo de dado
        /*
         * (Object)(myNum) - "cast" (conversão) para Object
         * myNum vira um Integer, que é um objeto da classe java.lang.Integer
         * .getClass() - retorna a classe real do objeto. No caso de myNum convertido em objeto, será Integer.class.
         * No caso de myNum convertido em objeto, será Integer.class.
         * .getSimpleName() - Esse método retorna apenas o nome simples da classe, sem o pacote.
         *
         * */
        System.out.println("Type: " + ((Object) (myNum)).getClass().getSimpleName());
        System.out.println("Type: " + ((Object) (myFloatNum)).getClass().getSimpleName());
        System.out.println("Type: " + ((Object) (myLetter)).getClass().getSimpleName());
        System.out.println("Type: " + ((Object) (myBool)).getClass().getSimpleName());
        System.out.println("Type: " + ((Object) (myString)).getClass().getSimpleName());


    }
}