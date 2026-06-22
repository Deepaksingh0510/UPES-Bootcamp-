class modifyArray{
    void mod(int arr[]){
        int[] newArr=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(i==0||i==arr.length-1){
                newArr[i]=arr[i];
            }else{
                newArr[i]=arr[i-1]+arr[i+1];
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=newArr[i];
        }
    }

    void printArr(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String args[]){
        int[] arr={12,1,10,9,8};

        modifyArray m=new modifyArray();
        m.mod(arr);

        m.printArr(arr);
    }
}