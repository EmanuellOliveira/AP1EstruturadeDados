package Questao2;
import java.util.Scanner;

public class Code2Real {
    
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.println(Inverse(x));
    } 

    public static int Inverse(int inv){
        

        if(inv==0) return inv;
            else{
                System.out.printf("%d", inv % 10);
                inv= inv/10;
                return Inverse(inv);
            }
            
    } 
}
