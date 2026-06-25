class findPivotIndex{

    int find(int arr[]){
        int tsum=0;

        for(int x:arr){
            tsum+=x;
        }

        int lsum=0;

        for(int i=0;i<arr.length;i++){
            int rsum=tsum-lsum-arr[i];
            
            if(lsum==rsum){
                return i;
            }
            lsum+=arr[i];
        }

        return -1;
    }

    public static void main(String args[]){
        int arr[]={1,7,3,6,5,6};

        findPivotIndex t=new findPivotIndex();
        System.err.println(t.find(arr));
    }
}

