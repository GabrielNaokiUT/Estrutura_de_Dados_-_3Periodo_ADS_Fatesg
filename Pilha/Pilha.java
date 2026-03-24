package Pilha;

public class Pilha {
    No topo = null;

    // LIFO: insere sempre no topo
    public void empilhar(int valor) {
        No p = new No();
        p.setDado(valor);

        if (topo == null) {
            topo = p;
            p.setProximo(null);
        } else {
            p.setProximo(topo);
            topo = p;
        }
    }

    // Exibe todos os elementos do topo até o fundo
    public void consultar() {
        No aux = topo;
        if (aux == null) {
            System.out.println("A pilha está vazia!");
        }
        while (aux != null) {
            System.out.println("Dados: " + aux.getDado());
            aux = aux.getProximo();
        }
    }

    // LIFO: remove sempre do topo
    public int desempilhar() {
        No aux = topo;
        if (topo != null) {
            topo = topo.getProximo();
        }
        return aux.getDado();
    }
}
