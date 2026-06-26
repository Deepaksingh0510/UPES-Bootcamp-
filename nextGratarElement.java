class nextGratarElement{

    // Brute force 
    int[] find(int arr[]){
        int[] ans=new int[arr.length];
        ans[arr.length-1]=0;
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    ans[i]=arr[j];
                    break;
                }else{
                    ans[i]=0;
                }
            }
        }

        return ans;
    }

    public static void main(String args[]){
        int arr[]={4,-1,2,3,-3};

        nextGratarElement n=new nextGratarElement();
        int res[]=n.find(arr);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}