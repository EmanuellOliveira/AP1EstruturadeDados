package Questao1_Lista.ListaEncadeada;

public class Node<T> {
    
    private T elemento;
    private Node<T> proximo;

    public Node(T elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public Node(T elemento, Node<T> proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }
    
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    
    public Node<T> getProximo() {
        return proximo;
    }
    
    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Node [elemento=" + elemento + ", proximo=" + proximo + "]";
    }
}
