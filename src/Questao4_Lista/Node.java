package Questao4_Lista;

public class Node<T> {
    
    private T dado;
    private Node<T> proximo;

    public Node (T novoDado){
        this.dado = novoDado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public Node<T> getProximo() {
        return proximo;
    }

    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }
}
