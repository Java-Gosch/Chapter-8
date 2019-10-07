package Excercises;

import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args){

        int count = 0;
        int userEntry;

        int[] myArray = new int[10];

        Scanner input = new Scanner(System.in);

        while(count < 10){
            System.out.println("Please enter a number >>>");
            userEntry = input.nextInt();
            myArray[count] = userEntry;
            count++;
        }
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        reverseDisplay(myArray);
        sumOfArray(myArray);

    }
    public static void reverseDisplay(int[] myArray){
        System.out.println("The reverse order is: ");
        for(int i = 9; i < myArray.length; i--){
            System.out.println(myArray[i]);
        }
    }
    public static void sumOfArray(int[] myArray){
        int total = 0;

        for(int i = 0; i < myArray.length; i++){
            total = total + myArray[i];
        }
        System.out.println("The sum of the array is: " + total);
    }
}
