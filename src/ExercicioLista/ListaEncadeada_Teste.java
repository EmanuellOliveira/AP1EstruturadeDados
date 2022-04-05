package ExercicioLista;

public class ListaEncadeada_Teste {
    
    public static void main(String[]args){

        ListaEncadeada <Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(456);
        lista.adiciona(3455);
        lista.adiciona(2333);
        lista.adiciona(11122);

        ListaEncadeada <String> nome = new ListaEncadeada<>();

        nome.adiciona("Azul");
        nome.adiciona("Vermelho");
        nome.adiciona("Amarelo");
        nome.adiciona("Rosa");

        System.out.println("Quantidade de números: " + lista.tamanho());
        System.out.println("Quantidade de nomes: "+ nome.tamanho());
    }
}
