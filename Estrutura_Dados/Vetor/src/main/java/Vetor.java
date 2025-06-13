// Importa a classe Scanner, usada para ler entrada do usuário
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        // Declara e inicializa um vetor de Strings com as siglas dos estados brasileiros
        String[] estados = {
                "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT",
                "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"
        };

        // Imprime no console o tamanho do vetor (quantidade de elementos)
        System.out.println(estados.length);

        // Cria um objeto Scanner para ler dados digitados pelo usuário
        Scanner leitor = new Scanner(System.in);

        // Pede ao usuário que digite uma sigla de estado para buscar
        System.out.println("Qual sigla de estado deseja procurar?");

        // Lê a entrada do usuário como uma string (ex: "MG")
        String siglaBusca = leitor.nextLine();

        // Variável booleana que vai indicar se a sigla foi encontrada
        boolean encontrou = false;

        // Laço for para percorrer todo o vetor de estados (busca linear)
        for (int i = 0; i < estados.length; i++) {
            // Armazena o elemento atual do vetor na variável 'elemento'
            String elemento = estados[i];

            // Compara o elemento com a sigla digitada, ignorando maiúsculas/minúsculas
            if (elemento.equalsIgnoreCase(siglaBusca)) {
                encontrou = true; // Marca que encontrou
                break;            // Interrompe o laço pois já encontrou
            }
        }

        // Verifica o resultado da busca e imprime a mensagem apropriada
        if (encontrou == true) {
            System.out.println("O estado " + siglaBusca + " foi encontrado!");
        } else {
            System.out.println("Sigla não encontrada");
        }
    }
}
