// Criação da subclasse Guerreiro que herda da classe Personagem
public class Guerreiro extends Personagem {
    String arma;

    // Metodo construtor da subclasse Guerreiro que chama o construtor da
    // superclasse Personagem
    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase, String arma) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
        this.arma = arma;
    }

    // Metodo ataqueFlamejante que retorna uma string com o nome do guerreiro e a
    // arma utilizada no ataque
    public String ataqueFlamejante() {
        return "O guerreiro " + super.nome + " realiza um ataque flamejante com a sua arma " + this.arma + "!";
    }

    // Sobrescrita do método exibirStatus da superclasse Personagem para incluir a
    // arma do guerreiro
    @Override
    public String exibirStatus() {
        return super.exibirStatus() + " \nArma: " + arma;
    }

    // Criação/Subscrita do método usarHabilidadeEspecial da superclasse Personagem
    // para exibir uma mensagem de ataque do guerreiro
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(
                "O guerreiro " + super.nome + " ataca com a sua arma " + this.arma + " causando um grande dano!");
    }
}
