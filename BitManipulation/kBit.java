// WAP top verify wheathe k th bit of a no is set or not (i.e set=1,nonset =0)
import java.util.*;
class kBit{


    void check(String binary,int k){
         
        int n=Integer.parseInt(binary,2);
        int bit=(n<<k)&1;

        if(bit==1){
            System.out.print("set");
        }
        else{
            System.out.print("non set");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String binary=sc.next();
        int k=sc.nextInt();
        kBit r=new kBit();

        r.check(binary,k);

    }
}