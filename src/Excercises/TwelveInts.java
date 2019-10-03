package Excercises;

import java.util.Scanner;

public class TwelveInts {
    public static void main(String[] args) {

        int userInt;

        Scanner input = new Scanner(System.in);

        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12};

        for (int i = 0; i < myArray.length; ++i) {
            System.out.println(myArray[i]);
        }
        for (int j = 11; j <= myArray.length; --j) {
            System.out.println(myArray[j]);

        }
    }
}