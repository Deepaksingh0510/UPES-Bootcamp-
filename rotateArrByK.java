import java.util.*;
class rotateArrByK{

    void rotate(int arr[],int k){
        int n=arr.length;
        int[] newArr=new int[n];
        k=k%n;

        for(int i=0;i<n;i++){
            newArr[i]=arr[(i+k)%n];
        }

        for(int x:newArr){
            System.out.print(x+" ");
        }

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        int[] arr={9,10,4,12};

        rotateArrByK r=new rotateArrByK();
        r.rotate(arr,k);
    }
}