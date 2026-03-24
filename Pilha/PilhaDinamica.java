package Pilha;

public class PilhaDinamica {

    public static void main(String[] args) {

        Pilha pilha1 = new Pilha();
        pilha1.empilhar(3);
        pilha1.empilhar(5);
        pilha1.empilhar(8);

        pilha1.consultar();

        pilha1.desempilhar();
        pilha1.consultar();

        pilha1.desempilhar();
        pilha1.consultar();

        pilha1.desempilhar();
        pilha1.consultar();
    }
}