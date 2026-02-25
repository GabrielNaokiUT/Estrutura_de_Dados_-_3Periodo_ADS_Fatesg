import java.util.ArrayList;
import java.util.List;

public class MaonaMassa1{//CompartilhamentoLista//

    public static void main(String[] args) {
        List <String> alunos = new ArrayList<>();
        alunos.add("Ana");
        alunos.add("Bruno");
        
        List <String> professorA = alunos;
        List <String> professorB = alunos;

        professorA.add("Carlos");
        
        System.out.println("Professor A: " + professorA);
        System.out.println("Professor B: " + professorB);
    }
}
