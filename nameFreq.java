import java.util.*;

class nameFreq {

    void find(String name) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (char x : hm.keySet()) {
            if (hm.get(x) == 2) {
                System.out.print(x);
            }
        }
    }

    public static void main(String args[]) {
        String name = "DEEPAK";

        nameFreq n = new nameFreq();
        n.find(name);
    }
}
