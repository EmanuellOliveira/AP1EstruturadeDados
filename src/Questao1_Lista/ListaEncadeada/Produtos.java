package Questao1_Lista.ListaEncadeada;

public class Produtos {
    
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    /*public Produtos(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }*/
    
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nCódigo (" + codigo + ")" + " | Nome -  " + nome + "   | Preço - R$" + preco + "    | Quantidade - " + quantidade + " unidades";
    }

    
    
    
    
    
    
}

