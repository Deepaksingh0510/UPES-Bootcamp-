class findPivotIndex{

    // int find(int arr[]){
    //     int tsum=0;

    //     for(int x:arr){
    //         tsum+=x;
    //     }

    //     int lsum=0;

    //     for(int i=0;i<arr.length;i++){
    //         int rsum=tsum-lsum-arr[i];
            
    //         if(lsum==rsum){
    //             return i;
    //         }
    //         lsum+=arr[i];
    //     }

    //     return -1;
    // }


    int find(int arr[]){
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];

        left[0]=arr[0];
        for(int i =1;i<arr.length;i++){
            left[i]=left[i-1]+arr[i];
        }

        right[arr.length-1]=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]={2,4,8,3,3};

        findPivotIndex t=new findPivotIndex();
        System.err.println(t.find(arr));
    }
}

