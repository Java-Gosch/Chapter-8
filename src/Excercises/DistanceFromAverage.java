package Excercises;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] twentyDoubles = new double[20];
        double avg;
        double total = 0;
        int i = 0;
        int userEntry = 0;

        while(userEntry != 99999){

            System.out.println("Enter a number: 99999 to stop >>>");
            userEntry = input.nextInt();

            if(userEntry != 99999){
                i++;
                twentyDoubles[i] = userEntry;
                total = total + userEntry;
            }
            else
                System.out.println("Good Bye SIR!");
        }

        System.out.println("The average of your entries is " + total/i);
    }
}
