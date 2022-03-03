package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumber = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            randomNumber.set(i, rand.nextInt(100));
        }
        System.out.println(randomNumber);
    }
}
