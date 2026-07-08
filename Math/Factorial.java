import java.util.*;

class Factorial {

    int Fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Factorial f=new Factorial();
        int res=f.Fact(n);
        System.out.println(res);

    }
}