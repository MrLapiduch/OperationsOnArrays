package OperationsOnArray;

import java.util.Arrays;
import java.util.Random;

public class FindMaxMinArray {
    public static void main(String[] args) {
        int[] MKlausNumbers = new int[10];
        int min = 100, max = 0;
        Random random = new Random();

        for (int i = 0; i < MKlausNumbers.length; i++) {
            int number = (int)(Math.random()*100);
            MKlausNumbers[i] = number;

            if (min > number){
                min = number;
            }

            if (max < number)
                max = number;
        }

        System.out.println("This is what random generate in table: "+ Arrays.toString(MKlausNumbers));
        System.out.println("This is Min Number from table: "+min + " and this is Max: " + max);
    }
}
