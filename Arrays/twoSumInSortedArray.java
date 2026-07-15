public class twoSumInSortedArray {
    
    int[] find(int arr[],int target){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int sum=arr[left]+arr[right];

            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};

        int target=9;

        twoSumInSortedArray t=new twoSumInSortedArray();
        int ans[]=t.find(arr, target);
        for(int x:ans){
            System.out.print(x+" ");
        }

    }
}
