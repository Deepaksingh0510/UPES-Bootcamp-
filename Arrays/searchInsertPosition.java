class searchInsertPosition{

    int search(int nums[],int target){
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int m=(l+r)/2;

            if(nums[m]<target){
                l=m+1;
            }else if(nums[m]>target){
                r=m-1;
            }else{
                return m;
            }
        }
        return l;
    }

    public static void main(String args[]){
        int arr[]={1,2,4,5};
        int target=3;

        searchInsertPosition s=new searchInsertPosition();
        System.out.println(s.search(arr,target));
    }
}