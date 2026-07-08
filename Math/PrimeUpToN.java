import java.util.*;

class PrimeUpToN {

    boolean Prime(int n) {

        if (n<= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    void printPrime(int n){
        for(int i=2;i<=n;i++){
            if(Prime(i)){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrimeUpToN p = new PrimeUpToN();

        p.printPrime(n);

    }
}
