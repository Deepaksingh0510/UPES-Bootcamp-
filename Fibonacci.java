import java.util.*;
class Fibonacci{
    void printFibo(int n){
        int f=0;
        int s=1;
        System.err.print(f+" "+s+" ");
        for(int i=3;i<=n;i++){
            int no=f+s;
            System.out.print(no+",");
            f=s;
            s=no;
        }
    }
    public static void main(String args[]){


        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        Fibonacci f=new Fibonacci();
        f.printFibo(n);


    }
}