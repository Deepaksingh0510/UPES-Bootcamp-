import java.util.*;
class swapTwoNo{
    void res(int a , int b){
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.print("a = "+a+" b = "+b);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();


        swapTwoNo s=new swapTwoNo();
        s.res(a,b);
    }
}