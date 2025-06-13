public class MainApp {
    //metodo main que dispara a aplicacao
    public static void main(String[] args) {
        /*
         * Tipo       Descrição                             Tamanho
         * byte       Inteiro de 8 bits                     1 byte
         * short      Inteiro de 16 bits                    2 bytes
         * int        Inteiro de 32 bits                    4 bytes
         * long       Inteiro de 64 bits                    8 bytes
         * float      Ponto flutuante de  32 bits           4 bytes
         * double     Ponto flutuante de 64 bits            8 bytes
         * char       Caractere Unicode (UTF-16)            2 bytes
         * boolean    Valor lógico 1 byte (na prática)
         */

        String name = "John";
        String lastName = "Doe";
        String fullName = name + " " + lastName;
        String profession = "Software Engineer";
        int age = 30;
        double height = 5.9;
        boolean isStudent = true;
        char grade = 'A';
        String[] hobbies = {"Reading", "Traveling", "Coding"}; //Array vetor de String


        System.out.println("Name: " + name);
        System.out.println("Fullname: " + fullName);
        System.out.println("Profession: " + profession);
        System.out.println("Age: " + age);

        // concatenação de variáveis:
        // Diversar formas de concatenar variáveis em Java

        System.out.println(name + " is a " + profession + " and he is " + age + " years old.");

        // concatenação de variáveis: printf()
        System.out.printf("Name: %s %s\n", name, lastName);

        // concatenação de variáveis: String.format()
        System.out.println(String.format("Name: %s %s", name, lastName));

        // concatenação de variaveis: StringBuilder()
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ");
        sb.append(name);
        sb.append(" ");
        sb.append(lastName);
        System.out.println(sb);

        // join() percorre o array, junta os elementos um por um e insere o delimitador
        // entre eles, mas não no início nem no fim.
        System.out.println(String.join(" - ", hobbies));


        // Identificadores Java
        /*
         * Todas as variáveis Java devem ser identificadas com nomes exclusivos.
         *
         * Esses nomes exclusivos são chamados de identificadores.
         *
         * Os identificadores podem ser nomes curtos (como x e y) ou nomes mais
         * descritivos (idade, soma, totalVolume).
         *
         */

        int minutesPerHour = 60;
        int hoursPerDay = 24;
        int daysPerWeek = 7;
        int weeksPerYear = 52;
        System.out.println("There are " + weeksPerYear + " weeks in a year");
        System.out.println("There are " + daysPerWeek + " days in a week");
        System.out.println("There are " + hoursPerDay + " hours in a day");
        System.out.println("There are " + minutesPerHour + " minutes in an hour");




    }

}
