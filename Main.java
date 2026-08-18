package nivel_novato.desafio;

// Classe Main para testar a classe Personagem
public class Main {
    public static void main(String[] args) {
        // Istanciando dois objetos da classe Personagem
        Personagem personagem1 = new Personagem("Arthemis", "Mago", 10, 100, 50.0);
        Personagem personagem2 = new Personagem("Thorin", "Guerreiro", 15, 150, 70.0);

        // Exibindo o status dos personagens
        personagem1.exibirStatus();
        personagem2.exibirStatus();
    }
}
