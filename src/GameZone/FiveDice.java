package GameZone;

import java.util.Random;

public class FiveDice {
    public static void main(String[] args){
        Random rand = new Random();
        int[] dieRolls = new int[5];
        int total = 0;

        for(int i=0; i < 5; ++i){
            int die = rand.nextInt(6)+1;
            total = total + die;
            dieRolls[i] = die;
            System.out.println(die);
        }
//        System.out.println(dieRolls[3]);
        System.out.print(total);
        for(int j=0; j<dieRolls.length; ++j){

        }

    }
}
