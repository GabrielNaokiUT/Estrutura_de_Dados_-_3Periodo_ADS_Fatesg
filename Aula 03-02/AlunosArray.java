import java.util.ArrayList;

public class AlunosArray{ 
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Gabriel Naoki");
        alunos.add("Ana");
        alunos.add("João");
        alunos.add("José");
        alunos.add("Maria");
        alunos.add("Cassiano");
        alunos.add("Alex");
        alunos.add("Caio");
        alunos.add("Wyllian");
        alunos.add("Pedro");

        for (int i = 0; i < alunos.size(); i++) {
           System.out.println("Aluno " + (i + 1) + ": " + alunos.get(i));
        }
    }
}





















/* import java.util.ArrayList;

public class AlunosArray {
    public static void main(String[] args) {
        String[] nomes = {
            "Gabriel Naoki", "Ana", "José", "Maria", "Luiz", 
            "João", "Marcelo", "Wyllian", "Alex", "Caio"
        };

        ArrayList<String> listaAlunos = new ArrayList<>();

        for (int i = 0; i < nomes.length; i++) {
            listaAlunos.add(nomes[i]);
        }

        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("aluno " + (i + 1) + ": " + listaAlunos.get(i));
        }
    }
}
 */