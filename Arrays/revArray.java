class revArray{

    void reverse(int num[]){
        int n=num.length;

        int left=0;
        int right=n-1;

        while(left<right){
            int temp=num[left];
            num[left]=num[right];
            num[right]=temp;

            left++;
            right--;
        }


        for(int x:num){
            System.out.print(x+" , ");
        }
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};

        revArray r=new revArray();
        r.reverse(num);

    }
}