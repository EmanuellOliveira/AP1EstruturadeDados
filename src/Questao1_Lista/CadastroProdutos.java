package Questao1_Lista;

import java.util.Scanner;
import Questao1_Lista.ListaEncadeada.Lista;
import Questao1_Lista.ListaEncadeada.Produtos;


public class CadastroProdutos { 

    public static void main (String[]args){
        
        Lista<Produtos> listaprodutos = new Lista<>();

        int opcao;
        int adicionar = 0;

        do{

            Showmenu();
            System.out.print("Digite uma opção: ");
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();
     
            switch (opcao) {
                case 1: {
               
                System.out.println("\n======= Cadastro de produtos =======");
        		
        		for (int i=0;i<5;i++) { 

        			System.out.println("\nAdicionar item? ");
                    System.out.println("1 para sim \n2 para nao ");
                    adicionar = input.nextInt();
                    
                    	if(adicionar==1) {
                    		System.out.printf("%d Item. \n", (i+1));
                            System.out.print("Digite o código do produto: ");
                            Produtos prod = new Produtos();
                            prod.setCodigo(input.nextInt());
                            input.nextLine();
                            listaprodutos.inserir(prod);

                            System.out.print("Digite o nome do produto: ");
                            prod.setNome(input.next());
                            input.nextLine();

                            System.out.print("Digite o preço do produto: ");
                            prod.setPreco(input.nextDouble());
                            input.nextLine();
                            
                            System.out.print("Digite a quantidade do produto: ");
                            prod.setQuantidade(input.nextInt());
                            input.nextLine();

                            System.out.println("\nProduto cadastrado com sucesso!!!");

        				} else{
                            break;
                        }
                    } 
        		}  	
                break;
            
                case 2: {
                
                System.out.println(listaprodutos);
                break;
                }

                case 3: {

                    System.out.println("Digite quanto de desconto deseja aplicar nos produtos: ");
                    input.nextInt();

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
        System.out.println("    |2 - RELATÓRIO DOS PRODUTOS     |");
        System.out.println("    |3 - DESCONTO SOBRE O PRODUTO   |");
        System.out.println("    |4 - SAIR                       |");
        System.out.println("-------------------------------------------");
    }
        
   
        
}

