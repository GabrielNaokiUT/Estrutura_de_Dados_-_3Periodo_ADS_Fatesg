package Fila;

public class Fila {
    No inicio = null;
    No fim = null;

    public void inserir(int valor){
        No p = new No();
        p.setDado(valor);

        if(inicio == null){
            inicio = p;
            fim = p;
            p.setProximo(null);
        }
        else{
            fim.setProximo(p);
            p.setProximo(null);
            fim = p;
        }
    }
    public void consultar(){
        No aux = inicio;
        if(aux == null){
            System.out.println("A fila está vazia!");
        }
        while(aux != null){
            System.out.println("Dados: " + aux.getDado());
            aux = aux.getProximo();
        }
    }
    public int excluir(){
        No aux = inicio;
        if(inicio == fim && inicio != null){
            inicio = null;
            fim = null;
        }
        else{
            inicio = inicio.getProximo();
        }

        return aux.getDado();
    }
}
