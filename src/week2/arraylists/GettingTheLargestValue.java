package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValue {

    public static void main(String[] args) {
        ArrayList<Integer> randNumber = new ArrayList<>();
        Random ran = new Random();
        int maxx = 0;
        for (int i = 0;i < 10; i++){
            maxx = randNumber.set(i, ran.nextInt(100));
            for (int k = 0; k < randNumber.size(); k++){
                if (randNumber.get(i) > maxx) {
                    maxx = randNumber.get(i);
                    break;
                }
            }
        }

        System.out.println(randNumber);
        System.out.println("The largest value is:" + maxx);
    }

}
