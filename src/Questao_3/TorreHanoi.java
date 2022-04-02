package Questao_3;

public class TorreHanoi {
    
    public static void main (String[]args){
        int disks = 0;
        towerHanoi(disks, 'A', 'B', 'C');
    }

    private static void towerHanoi(int disks, char origin, char auxiliary, char destination) {

        if(disks > 0){
            towerHanoi(disks-1, origin, destination, auxiliary);
            System.out.printf("\nPassar do %s para %s ", origin, destination);
            towerHanoi(disks-1,auxiliary,origin,destination);
        }
    }
}