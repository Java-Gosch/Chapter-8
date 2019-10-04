package Excercises;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i = 0;
        int userEntry = 0;
        int count = 0;
        double[] twentyDoubles = new double[20];
        double avg = 0;
        double total = 0;

        while(userEntry != 99999)
        {
            count++;
            System.out.println("Enter Number " + count + " : 99999 to Stop >>>");
            userEntry = input.nextInt();

            if(userEntry != 99999){
                i++;
                twentyDoubles[i] = userEntry;
                total = total + userEntry;
                avg = total/i;
            }
            else
                System.out.println("Good Bye SIR!");
        }
        System.out.println("The average of your entries is " + avg);

        for(int j = 0; j < twentyDoubles.length; j++){
            
        }

    }
}
