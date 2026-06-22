
import java.util.*;
class returnArray {

    void find(int arr[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (int k : hm.keySet()) {
            if (hm.get(k) == 1) {
                System.out.println(k);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 2, 3, 5};

        returnArray r = new returnArray();
        r.find(arr);
    }
}
