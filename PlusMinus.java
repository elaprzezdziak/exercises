/*
Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
Print the decimal value of each fraction on a new line.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int arrayLen = scan.nextInt();
        int numbersArray [] = new int[arrayLen];
        float positive = 0, negative = 0, zero = 0;
        for(int i = 0; i < arrayLen; i++) {
            numbersArray[i] = scan.nextInt();
        }
        for(int i = 0; i < arrayLen; i++) {
            if (numbersArray[i] == 0) {
                zero = zero + 1;
            } else if (numbersArray[i] > 0) {
                positive = positive + 1;
            } else {
                negative = negative + 1;
            }
        }
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format(zero/arrayLen));
        System.out.println(df.format(positive/arrayLen));
        System.out.println(df.format(negative/arrayLen));
    }
}
