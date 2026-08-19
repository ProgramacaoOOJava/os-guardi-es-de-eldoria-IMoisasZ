package desafio;

// Criando a classe Personagem com atributos e métodos
public abstract class Personagem implements Comparable<Personagem> {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Criado o construtor da classe Personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Criado o método exibirStatus para mostrar as informações do personagem
    public String exibirStatus() {
        return "Nome: " + nome + "\nClasse: " + classe + "\nNível: " + nivel + "\nPontos de Vida: "
                + pontosDeVida + "\nPoder Base: " + poderBase;
    }

    public abstract void usarHabilidadeEspecial();

    @Override
    public String toString() {
        return nome + " (Nível: " + nivel + ")";
    }

    @Override
    public int compareTo(Personagem outroPersonagem) {
        return Integer.compare(this.nivel, outroPersonagem.nivel);
    }
}
