class findPeakElement{

    int find(int arr[]){
        int low=0;
        int high=arr.length-1;

        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
        }

        return low;
    }


    public static void main(String args[]){
        int arr[]={1,2,1,3,5,6,4};

        findPeakElement f=new findPeakElement();
        System.out.println(f.find(arr));
        
    }
}