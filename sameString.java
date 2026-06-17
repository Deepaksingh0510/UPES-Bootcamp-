
import java.util.*;

class sameString {

    void check(String s) {

        StringBuilder rev = new StringBuilder(s).reverse();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == rev.charAt(i)) {
                System.out.print(s.charAt(i));
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        sameString st = new sameString();
        st.check(s);

    }

}
