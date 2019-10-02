package Excercises;

import java.util.Scanner;

public class TwelveInts {
    public static void main(String[] args) {

        int userInt;

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[12];

        for (int i = 0; i < myArray.length; ++i) {
            System.out.println(i + 1);
        }
        for (int j = 0; myArray.length > j; --j) {
            System.out.println(myArray);
        }
    }
}