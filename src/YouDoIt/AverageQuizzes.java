package YouDoIt;

import java.util.Scanner;

public class AverageQuizzes {
    public static void main(String[] args){
        int[] scoresArray = new int[10];
        int score;
        int total = 0;
        int high = 0;
        int low = 100;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < scoresArray.length; i++ ){
            System.out.println("Enter quiz score number " + i + " >>> ");
            score = input.nextInt();
            scoresArray[i] = score;
            total = scoresArray[i] + total;

        }
        for(int j = 0; j < scoresArray.length; j++){
            for(int i = 0; i < 4; i++){
                if(scoresArray[j] > high)
                    high = scoresArray[j];
                else if(scoresArray[j] < low)
                    low = scoresArray[j];
            }
        }
        System.out.println("The average is " + total/scoresArray.length);
        System.out.println("The highest is " + high + " and the lowest is " + low);
    }
}
