package Questao1_Lista;

import java.util.Scanner;
import Questao1_Lista.ListaEncadeada.List;

public class CadastroProdutos { 
    
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        List <String> list = new List<>();

        int opcao;
        do{

            Showmenu();
            opcao = input.nextInt();
        
            switch (opcao) {
            case 1: {
                    System.out.println(" Digite o nome do produto: ");
                    String value = input.nextLine();
                    list.add(value);
                    break;        
            } 
            case 2: {
                
                System.out.println(list.toString());
                break;
            }
            case 3: {
                
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
