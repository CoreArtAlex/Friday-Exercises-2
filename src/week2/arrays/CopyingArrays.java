package week2.arrays;

import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] randomNumber = new int[10];
        int[] copyRandNum = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            randomNumber[i] = rand.nextInt(100);
            copyRandNum[i] = randomNumber[i];
            System.out.println(Arrays.toString(randomNumber));
            System.out.println(Arrays.toString(copyRandNum));
        }
    }
}
