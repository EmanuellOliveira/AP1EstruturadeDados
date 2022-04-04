package ExercicioLista;

public class ListaEncadeada<T>{

    private No<T> inicio;

    public void adiciona(T elemento) {
        
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
    }
    
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

}