package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumber = new ArrayList<>();
        Random rand = new Random();
        int max = 0;
        int slot = 0;
        for (int i = 0;i < 10; i++){
            max = randomNumber.set(i, rand.nextInt(100));
            for (int j = 0; j < randomNumber.size(); j++){
                if (randomNumber.get(i) > max) {
                    max = randomNumber.get(i);
                    slot = j;
                    break;
                }
            }
        }
        System.out.println(randomNumber);
        System.out.println("The largest number is:" + max + "which is in slot:" + slot);
    }
}
