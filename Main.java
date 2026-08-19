package hora_codar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Maria", 8.5));
        alunos.add(new Aluno("João", 7.0));
        alunos.add(new Aluno("Ana", 9.2));
        alunos.add(new Aluno("Pedro", 6.8));
        alunos.add(new Aluno("Ricardo", 7.5));

        System.out.println("Alunos antes da ordenação:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        Collections.sort(alunos);

        System.out.println("\nAlunos após a ordenação por nota final:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
