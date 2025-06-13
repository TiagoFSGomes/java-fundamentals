public class Boolean {
    public static void main(String[] args) {
        /*
         * Muitas vezes, na programação, você precisará de um tipo de dados que só pode ter um dos dois valores, como:
         * SIM / NÃO - LIGADO / DESLIGADO - VERDADEIRO / FALSO
         * Java possui um tipo de dados, que só pode receber os valores boolean / true / false*/


        boolean isJavaFun = true;
        System.out.println(isJavaFun);
        System.out.println("Type: "+ ((Object)(isJavaFun)).getClass().getSimpleName());

        boolean isFishTasty = false;
        System.out.println(isFishTasty);
        System.out.println("Type: "+ ((Object)(isFishTasty)).getClass().getSimpleName());

        //O tipo de dados é usado para armazenar um único caractere.
        // O caractere deve ser cercado por aspas simples, como 'A' ou 'c':char

        char myGrade = 'A';
        System.out.println(myGrade);
        System.out.println("Type: "+ ((Object)(myGrade)).getClass().getSimpleName());
        //Uma lista de todos os valores ASCII pode ser encontrada na tabela ASCII.
        char myVar1 = 65, myVar2 = 68, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        //Tipo de dados é usado para armazenar uma sequência de caracteres (texto).
        // Os valores de string devem ser colocados entre aspas
        String greeting = "Hello World!";
        System.out.println(greeting);
        System.out.println("Type: "+ ((Object)(greeting)).getClass().getSimpleName());

    }
}
