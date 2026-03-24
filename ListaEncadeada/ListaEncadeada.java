package ListaEncadeada;

public class ListaEncadeada {
    No inicio = null;

    // Inserção no Início (Conforme slide 9)
    public void inserirInicio(int valor) {
        No p = new No();
        p.setDado(valor);
        p.setProximo(inicio);
        inicio = p;
    }

    // Inserção no Final (Exige percorrer a lista - slide 9)
    public void inserirFinal(int valor) {
        No p = new No();
        p.setDado(valor);
        p.setProximo(null);

        if (inicio == null) {
            inicio = p;
        } else {
            No aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(p);
        }
    }

    // Percurso para exibição (Slide 12)
    public void consultar() {
        No aux = inicio;
        if (aux == null) {
            System.out.println("A lista está vazia!");
        } else {
            while (aux != null) {
                System.out.print("[" + aux.getDado() + "] -> ");
                aux = aux.getProximo();
            }
            System.out.println("null");
        }
    }

    // Busca de elemento (Slide 10)
    public boolean buscar(int valor) {
        No aux = inicio;
        while (aux != null) {
            if (aux.getDado() == valor) {
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }

    // Remoção de elemento específico (Ajuste de referências - slide 11)
    public void excluir(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        // Caso o elemento esteja logo no início
        if (inicio.getDado() == valor) {
            inicio = inicio.getProximo();
            return;
        }

        No atual = inicio;
        No anterior = null;

        while (atual != null && atual.getDado() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null) {
            // "Pula" o nó atual, ligando o anterior ao próximo
            anterior.setProximo(atual.getProximo());
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}