package YouDoIt;

import java.util.Scanner;

public class AverageQuizzes {
    public static void main(String[] args) {
        int userEntry;
        int score;
        int total = 0;
        int high = 0;
        int low = 100;
        int quit = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("How many students? >>>");
            userEntry = input.nextInt();
            int[] scoresArray = new int[userEntry];

            for (int i = 0; i < scoresArray.length; i++) {
                System.out.println("Enter quiz score number " + (i+1) + " >>> ");
                score = input.nextInt();
                scoresArray[i] = score;
                total = scoresArray[i] + total;

            }
            System.out.println("The average is " + total / scoresArray.length);
            System.out.println("The highest is " + high + " and the lowest is " + low);

            HighLow.displayHighLow(scoresArray);

            System.out.println("Are you done? 999 to quit >>> ");
            quit = input.nextInt();
        }while (quit != 999);
    }
}