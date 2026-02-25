public class BuscaAlunos{
    public static void main(String[] args) {

        String[] alunos = {"Gabriel Naoki", 
                "Ana", 
                "João", 
                "José", 
                "Maria", 
                "Cassiano", 
                "Alex", 
                "Caio", 
                "Wyllian", 
                "Pedro"
        };
        String buscarAluno = "Maria";

        for (int i = 0; i < alunos.length; i++) {
           if(alunos[i].equals(buscarAluno)){
                System.out.println("Aluno encontrado!!!Posição: " + i);
                break;
           }
        }
    }
}