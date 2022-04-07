package Questao1_Lista.ListaEncadeada;

public class Lista<T> {
    
    private Node<T> primeiro;
    private Node<T> ultimo;
    private int tamanho;
    
    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
        tamanho = 0;
    }

    public void inserir(T elemento){

        Node<T> novoNode = new Node<T>(elemento);

        if(eVazia()){
            this.primeiro = novoNode;
            this.ultimo = novoNode;
        } else {
            this.ultimo.setProximo(novoNode);
            this.ultimo = novoNode;
        }
        tamanho++;    
    }

    private boolean eVazia() {
        return this.tamanho == 0;
    }

    @Override
    public String toString() {
        
        if(eVazia()) {
            return "Lista Vazia.";
            }else {
                Node<T> nodeatual = this.primeiro;
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append("[");
                stringbuilder.append(nodeatual.getElemento() != null ? nodeatual.getElemento().toString() :"<nulo>");
                stringbuilder.append(" ");

            while(nodeatual.getProximo() != null){
                stringbuilder.append(nodeatual.getProximo().getElemento() != null ? nodeatual.getProximo().getElemento().toString() : "<nulo>");
                stringbuilder.append(" ");
                nodeatual = nodeatual.getProximo();
                }
                stringbuilder.append("]");
                return stringbuilder.toString();
        }
    }
    
    public Node<T> get(int posicao) {
		Node<T> atual = this.primeiro;
		for(int i = 0; i < posicao; i++) {
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}
}
