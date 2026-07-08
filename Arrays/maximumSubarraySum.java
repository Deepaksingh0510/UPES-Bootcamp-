
class maximumSubArraySum {

//BRUTE FORCE
    // void findSubArray(int arr[]){
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         int sum=0;
    //         for(int j=i;j<arr.length;j++){
    //             sum+=arr[j];
    //         }
    //         max=Math.max(sum,max);
    //     }
    //     System.out.println(max);
    // }


    // OPTIMIZED    "Kadanes algorithm"
    void findSubArray(int arr[]) {
        int fb = 0;
        int mw = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            fb = Math.max(arr[i], arr[i] + fb);
            mw = Math.max(fb, mw);
        }
        System.out.println(mw);

    }

    public static void main(String args[]) {
        int arr[] = {-3, 4, -1, 2};

        maximumSubArraySum m = new maximumSubArraySum();
        m.findSubArray(arr);
    }
}
