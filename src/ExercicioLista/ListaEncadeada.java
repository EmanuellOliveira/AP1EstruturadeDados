package ExercicioLista;

public class ListaEncadeada<T>{

    private No<T> inicio;
    private int tamanho;
    

    public void adiciona(T elemento) {
        
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.tamanho++;
    }

    public int tamanho(){
        return tamanho;
    }
    
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

}