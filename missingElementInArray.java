import java.util.*;

class missingElementInArray{
    
    void find(int[] arr,int size){
        int sum=0;
        for(int x:arr){
            sum+=x;
        }

        int sumN=0;
        for(int i=1;i<=size;i++){
            sumN+=i;
        }

        int res=sumN-sum;
        System.out.print("Missing element :"+res);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        int[] arr=new int[size-1];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        missingElementInArray r=new missingElementInArray();
        r.find(arr,size);


    }
}