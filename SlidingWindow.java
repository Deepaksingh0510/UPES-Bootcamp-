class SlidingWindow{

    int findMax(int arr[],int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        int max=sum;

        for(int j=k;j<arr.length;j++){
            sum+=arr[j]+arr[j-k];
        }

        max=Math.max(sum,max);
        return max;
    }

    public static void main(String args[]){
        int arr[]={-4,6,8,-3,2};

        int k=3;

        SlidingWindow s=new SlidingWindow();
        System.out.print(s.findMax(arr,k));
    }
}