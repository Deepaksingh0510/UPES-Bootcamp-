
import java.util.*;

class countFreq {

    void count(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (int x : hm.keySet()) {
            System.out.print(x + ":" + hm.get(x) + " ");
        }

        System.out.println("");
        
        for (int x : hm.keySet()) {
            if (hm.get(x) == 1) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 2, 5, 1, 10};

        countFreq c = new countFreq();
        c.count(arr);
    }
}
