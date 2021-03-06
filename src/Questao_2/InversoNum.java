package Questao_2;
import java.util.Scanner;

public class InversoNum {
    
    public static void main(String[]args){

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Informe o número: ");
            int x = input.nextInt();
            
            System.out.printf("O inverso de " + x + " é ");
            Inverse(x);
        }
    } 

    public static int Inverse(int inv){
        
        if(inv==0) return inv;
            else{
                System.out.printf("%d",inv % 10);
                inv = inv/10;
                return Inverse(inv);
            }
    } 
}
