
import java.util.*;

class longestSubstring {

    int find(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (h.containsKey(ch) && h.get(ch) >= left) {
                left = h.get(ch) + 1;
            }
            h.put(ch, right);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String args[]) {
        String s = "abcabcbba";

        longestSubstring l = new longestSubstring();
        System.out.print(l.find(s));
    }

}
