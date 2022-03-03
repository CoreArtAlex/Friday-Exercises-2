package week2.arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] randomNumber = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            randomNumber[i] = rand.nextInt(100);
            System.out.println("Slot:" + i + "contains a" + randomNumber[i]);
            System.out.println("/n");
        }
    }
}
