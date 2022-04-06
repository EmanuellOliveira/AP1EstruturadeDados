package Questao1_Lista.ListaEncadeada;

public class Lista<T> {
    
    private Node<T> celula;
    private int tamanho;

    public Lista(){
        this.tamanho = 0;
    }

    public Node<T> getCelula() {
        return celula;
    }

    public void setCelula(Node<T> celula) {
        this.celula = celula;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(T elemento){
        Node<T> celula = new Node<T>(elemento);
        this.celula = celula;
        tamanho++;
    }

    @Override
    public String toString() {
        return "Lista [celula=" + celula + ", tamanho=" + tamanho + "]";
    }

}
