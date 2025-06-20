public class PassagemParametrosRPG {
    public static void main(String[] args) {
        //Criando objeto
        Personagem heroi = new Personagem("Mago", 50);

        //Passagem por valor
        System.out.println("Antes de tentarAumentarNivelDePoder: " + heroi.nivelDePoder);
        heroi.tentarAumentarNivelDePoder(heroi.nivelDePoder);
        System.out.println("Depois de tentarAumentarNivelDePoder: " + heroi.nivelDePoder);

        //Passagem por referencia
        System.out.println("Antes de mudarNome: " + heroi.nome);
        heroi.mudarNome(heroi);
        System.out.println("Depois de mudarNome: " + heroi.nome);

        //Alterando valor da variavel
        System.out.println("Antes de aumentarNivelDePoder: " + heroi.nivelDePoder);
        heroi.aumentarNivelDePoder();
        System.out.println("Depois de aumentarNivelDePoder: " + heroi.nivelDePoder);
    }
}
