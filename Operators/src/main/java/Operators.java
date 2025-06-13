import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {

        //Operadores Aritméticos Básicos
        int a = 10;
        int b = 5;
        int add = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        System.out.println("Operadores Aritméticos Básicos");
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);

        int c = 9;
        int d = 2;
        int mod = c % d; //resto da divisão
        System.out.println("Resto da divisão entre " + c + " e " + d + " é: " + mod);

        //Incremento e decremento
        int x = 10;
        int y = 10;
        x++; // x = x + 1
        y--; // y = y - 1
        System.out.println("Incremento e Decremento");
        System.out.println("x = " + x + " y = " + y);

        //Operadores de Comparação
        //Retorna True ou False
        System.out.println("Operadores de Comparação");
        System.out.println(a > b);

        int e = 5;
        int f = 3;
        System.out.println(e!=f);
        System.out.println(e==f);


        /*Operadores Lógicos
        * && (and) Retorna verdadeiro se ambas as declarações forem verdadeiras
        * || (or) Retorna verdadeiro se uma das declarações forem verdadeira
        * ! (not) Inverte o resultado, retorna falso se o resultado for verdadeiro
        * */

        int g = 5;
        System.out.println("Operadores Lógicos AND OR NOT");
        System.out.println(g > 3 && g < 7); //true
        System.out.println(g < 3 || g > 7); //false
        System.out.println(!(g > 3)); //false
    }
}
