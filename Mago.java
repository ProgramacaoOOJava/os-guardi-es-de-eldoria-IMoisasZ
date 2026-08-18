// Criação da subclasse Mago que herda da classe Personagem
public class Mago extends Personagem {
    String elemento;

    // Metodo construtor da subclasse Mago que chama o construtor da superclasse
    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase, String elemento) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
        this.elemento = elemento;
    }

    // Metodo ataqueElemental que retorna uma string com o nome do mago e o elemento
    public String ataqueElemental() {
        return "O mago " + super.nome + " realiza um ataque elemental com o seu poder de " + this.elemento + "!";
    }

    // Sobrescrita do método exibirStatus da superclasse Personagem para incluir o
    // elemento do mago
    @Override
    public String exibirStatus() {
        return super.exibirStatus() + "\nElemento: " + elemento;
    }

    // Criação/Subscrita do método usarHabilidadeEspecial da superclasse Personagem
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(
                "O mago " + super.nome + " conjura uma poderosa magia de " + this.elemento + " causando grande dano!");
    }

}