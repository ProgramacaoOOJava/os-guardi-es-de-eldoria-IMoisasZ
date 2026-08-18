package nivel_novato.desafio;

// Classe Main para testar a classe Personagem
public class Main {
    public static void main(String[] args) {
        // Istanciando dois objetos da classe Personagem
        Mago mago = new Mago("Arthemis", "Mago", 10, 100, 50.0, "Fogo");
        Guerreiro guerreiro = new Guerreiro("Thorin", "Guerreiro", 12, 120, 60.0, "Espada");

        // Exibindo o status dos personagens
        System.out.println(mago.exibirStatus());
        System.out.println("\n-------------------------");
        System.out.println(guerreiro.exibirStatus());

        // Criando um array de personagens e chamando o método usarHabilidadeEspecial
        // para cada um

        System.out.println("----------- Personagens - Habilidades especiais --------------");
        Personagem[] personagens = { new Mago("Arthemis", "Mago", 10, 100, 50.0, "Fogo"),
                new Guerreiro("Thorin", "Guerreiro", 12, 120, 60.0, "Espada") };

        // Iteração sobre o array de personagens e chamando o método
        // usarHabilidadeEspecial para cada um
        for (Personagem p : personagens) {
            p.usarHabilidadeEspecial();
        }

        // Ataques prórprios de cada personagem
        System.out.println("----------- Ataques prórprios de cada personagem --------------");
        System.out.println(mago.ataqueElemental());
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println(guerreiro.ataqueFlamejante());

    }
}

