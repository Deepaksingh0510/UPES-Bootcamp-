class revArrayByK{

    void rotate(int arr[],int k){
        int n=arr.length;
        k%=n;
        rev(arr, 0, n-1);
        rev(arr, 0, k-1);
        rev(arr, k, n-1);
        
    }

    void rev(int arr[],int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }


    public static void main(String[] args) {
            
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        
        revArrayByK r=new revArrayByK();
        r.rotate(arr, k);
        for(int x:arr){
            System.out.print(x);
        }
    }
}