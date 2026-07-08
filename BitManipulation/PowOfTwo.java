import java.util.*;

class PowOfTwo {

    boolean res(int n) {
        if (n <= 0) {
            return false;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PowOfTwo p = new PowOfTwo();

        if (p.res(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}