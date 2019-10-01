package YouDoIt;

public class HighLow {
    public static void displayHighLow(int[] myArray) {

        int high = 0;
        int low = 100;

        for (int j = 0; j < myArray.length; j++)

        {

                if (myArray[j] > high)
                    high = myArray[j];

                else if (myArray[j] < low)
                    low = myArray[j];
            
        }
        System.out.println("The high is " + high + " and the low is " + low);
    }
}