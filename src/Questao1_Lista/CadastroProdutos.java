package Questao1_Lista;

import java.util.Scanner;

import Questao1_Lista.ListaEncadeada.Lista;


public class CadastroProdutos { 
    
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        Lista<String> lista = new Lista<>();
        

        int opcao;
        do{

            Showmenu();
            opcao = input.nextInt();
        
            switch (opcao) {
            case 1: {
                
                System.out.print("Digite um novo Produto:");
                lista.adicionar(input.next());

                    
                break;
            } 
            
            case 2: {
                
                
                break;
            }
            case 3: {

                System.out.println(lista);
                
                break;
            }
            case 4: {
                System.out.println("Programa encerrado com sucesso!");
                break;
            }
            default: {
                System.out.println("OpçãO Inválida!");
                break;
            } 
            }
            
        
        } while(opcao!=4);
    }
    
    public static void Showmenu(){

        System.out.println("----------- LISTA DE PRODUTOS ------------");
        System.out.println("");
        System.out.println("    |1 - CADASTRAR PRODUTOS         |");
        System.out.println("    |2 - DESCONTO SOBRE O PRODUTO   |");
        System.out.println("    |3 - RELATÓRIO DOS PRODUTOS     |");
        System.out.println("    |4 - SAIR                       |");
        System.out.println("-------------------------------------------");
    }
}
