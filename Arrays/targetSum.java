
import java.util.*;

class targetSum {

    // void find(int arr[],int target){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]+arr[j]==target){
    //                 System.out.println(arr[i]+" "+arr[j]);
    //             }
    //         }
    //     }
    // }
    // void find(int arr[],int target){ 
    //     int i=arr[0];
    //     int j=arr[arr.length-1];
    //     while(i!=j){
    //     }
    // }
    boolean find(int arr[], int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (hm.containsKey(complement)) {
                return true;
            }
            hm.put(arr[i], i);
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, -3, 4, 8, -1};

        int target = sc.nextInt();

        targetSum ts = new targetSum();
        System.out.println(ts.find(arr, target));
    }
}
