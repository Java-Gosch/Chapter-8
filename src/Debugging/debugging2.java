package Debugging;

public class debugging2 {
    public static void main(String args[])
    {
        int[] someNums = {4, 17, 22, 8, 35};
        int tot = 0;
        int x;
        int average = 0;

        for(x = 0; x < someNums.length; ++x) {
            tot = tot + someNums[x];
            average = tot/ someNums.length;

        }
        System.out.println("Sum is " + tot);
        System.out.println("Average is " + average);
    }
}
