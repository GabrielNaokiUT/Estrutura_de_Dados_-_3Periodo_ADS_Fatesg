package ListaEncadeada;

public class ListaEncadeadaDinamica {

    public static void main(String[] args) {
        ListaEncadeada lista1 = new ListaEncadeada();

        // Testando inserções
        lista1.inserirFinal(10);
        lista1.inserirFinal(20);
        lista1.inserirFinal(30);
        lista1.inserirFinal(40);
        
        System.out.println("Lista Original:");
        lista1.consultar();

        // Testando a busca
        System.out.println("\nExiste o valor 20? " + lista1.buscar(20));

        // Testando a remoção (Exemplo do Slide: remover o 30)
        System.out.println("\nRemovendo o elemento 30...");
        lista1.excluir(30);
        
        System.out.println("Lista Atualizada:");
        lista1.consultar();

        // Testando inserção no início
        System.out.println("\nInserindo o 5 no início...");
        lista1.inserirInicio(5);
        lista1.consultar();
    }
}