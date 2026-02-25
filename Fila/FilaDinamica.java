package Fila;

public class FilaDinamica {

    public static void main(String[] args) {
        
        Fila fila1 = new Fila();
        fila1.inserir(3);
        fila1.inserir(5);
        fila1.inserir(8);

        fila1.consultar();

        fila1.excluir();
        fila1.consultar();

        fila1.excluir();
        fila1.consultar();

        fila1.excluir();
        fila1.consultar();
    }
}