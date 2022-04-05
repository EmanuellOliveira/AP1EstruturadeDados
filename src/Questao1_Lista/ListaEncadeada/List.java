package Questao1_Lista.ListaEncadeada;

public class List<T> {
    
    private Node<T> first;
    private int size = 0;

    public void add(T value){
        
        Node<T> no = new Node<T>(value);
        this.first = no;
        this.size++;
    
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        Node<T> p = first;
        while(p != null){
            sb.append(p.getValue()+ " ");
            p = p.getNext();
        }
        
        sb.append("]");
        return sb.toString();

    }
        
    
}
    
