package week2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] arrayNumber = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            arrayNumber[i] = rand.nextInt(50);
        }

        System.out.println(Arrays.toString(arrayNumber));

        // User input
        Scanner search = new Scanner(System.in);
        search.nextInt();
        System.out.println("Value to find:" + search );

        // input search
        for (int i = 0; i < 10; i++){
            if (arrayNumber[i] == search.nextInt()){
                System.out.println(search + "is in slot" + i);
            }else{
                System.out.println(search + "is not in the array");
            }
        }
    }
}
