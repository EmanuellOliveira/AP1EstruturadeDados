package Questao_3;
public class TorreHanoi {
    
    public static void main (String[]args){
        int disks = 4;
        towerHanoi(disks, 'A', 'B', 'C');

        System.out.println("\nForam feitos " + (int) (Math.pow(2,disks)-1) + " movimentos." );
    }

    private static void towerHanoi(int disks, char origin, char auxiliary, char destination) {

        if(disks > 0){
            towerHanoi(disks-1, origin, destination, auxiliary);
            System.out.printf("\n|Passar do %s para %s| ", origin, destination);
            towerHanoi(disks-1,auxiliary,origin,destination);
        }
    } 
}