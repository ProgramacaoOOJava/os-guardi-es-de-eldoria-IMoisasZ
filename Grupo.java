package desafio;

// Pacotes importados
import java.util.ArrayList;
import java.util.List;

// Classe grupo
public class Grupo {
    private String nomeDoGrupo;
    private ArrayList<Personagem> membros;

    // Metodo construtor
    public Grupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
        this.membros = new ArrayList<>();
    }

    // Metodo para obter o nome do grupo
    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    // Adicionando membros
    public void adicionarMembro(Personagem personagem) {
        membros.add(personagem);
    }

    // Metodo para listar os membros
    public void listarMembros() {
        System.out.println("\n--- Membros do grupo " + nomeDoGrupo + " ---");
        for (Personagem membro : membros) {
            System.out.println("- " + membro.nome + " (Nível: " + membro.nivel + ")");
        }
        System.out.println("-----------------------------------");
    }

    // Metodo para realizar as batalhas
    public void batalhar(Personagem p1, Personagem p2) {
        System.out.println("\n--- INICIO DA BATALHA ---- ");

        double poderTotalP1 = p1.nivel * p1.poderBase;
        double poderTotalP2 = p2.nivel * p2.poderBase;

        System.out.println(p1.nome + " Poder Total: " + String.format("%.2f", poderTotalP1));
        System.out.println(p2.nome + " Poder Total: " + String.format("%.2f", poderTotalP2));

        if (poderTotalP1 > poderTotalP2) {
            System.out.println(p1.nome + " venceu a batalha!");
        } else if (poderTotalP1 < poderTotalP2) {
            System.out.println(p2.nome + " venceu a batalha!");
        } else {
            System.out.println("A batalha terminou em empate!");
        }

        System.out.println("--- FIM DA BATALHA ---- ");
    }

    // Ordenando as os membros por nivel
    public void ordernarMembrosPorNivel() {
        membros.sort((m1, m2) -> Integer.compare(m1.nivel, m2.nivel));
        System.out.println("Membros do grupo " + nomeDoGrupo + " ordenados por nivel");
    }

    public List<Personagem> getMembros() {
        return membros;
    }
}
