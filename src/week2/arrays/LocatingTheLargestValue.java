package week2.arrays;

import java.util.Arrays;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] randomNumber = new int[10];
        Random rand = new Random();
        int max = 0;
        int index = 0;
        for (int i = 0; i < 10; i++){
            randomNumber[i] = rand.nextInt(100);
            System.out.println(Arrays.toString(randomNumber));
            max = randomNumber[0];
            for (int j = 0; j < randomNumber.length; j++){
                if (randomNumber[i] > max) {
                    max = randomNumber[i];
                    index = i;
                    break;
                }
            }
        }
        System.out.println("The largest value is:" + max);
        System.out.println("It is in the slot:" + index);
    }
}
