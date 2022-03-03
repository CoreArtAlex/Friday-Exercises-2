package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumber = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            randomNumber.set(i, rand.nextInt(50));
        }

        System.out.println(randomNumber);

        // user input
        Scanner search = new Scanner(System.in);
        search.nextInt();
        System.out.println("Value to find:" + search );

        // input search
        for (int i = 0; i < 10; i++){
            if (randomNumber.get(i) == search.nextInt()){
                System.out.println(search + "is in slot" + i);
            }else{
                System.out.println(search + "is not in the array");
            }
        }
    }
}
