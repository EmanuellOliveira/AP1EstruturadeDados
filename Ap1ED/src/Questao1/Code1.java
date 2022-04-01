package Questao1;
import java.util.Random;

public class Code1 {
    public static void main(String[] args) {
        
        Random random = new Random();         //Instância Random para gerar números aleatórios para o vetor
        int array[] = new int[5];
        for (int i=0; i<array.length; i++) {

            array[i] = random.nextInt(20);    // Atribuição do Random no vetor com o intervalo de números que será randomizado
            System.out.println("|"+ array[i] + "|");  
        }        
        System.out.println("\nO menor número do Vetor é: " + HightNum(5,array)); 
    }
    
    public static int HightNum (int n, int v[]){   //int n = tamanho do vetor & int v[] = nome do vetor
        int x;

        if(n==1) x=v[0];
         else {
            x = HightNum(n-1,v);
            
            if(x>v[n-1]) x=v[n-1];
        }
        return x;  
    }   
}

