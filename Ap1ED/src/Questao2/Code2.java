package Questao2;
import java.util.Scanner;

public class Code2 {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número: " );
        String Num = input.nextLine();

        System.out.println(Inverse(Num));
    }
    public static String Inverse(String inv){

        return new StringBuilder(inv).reverse().toString();
    }
}
