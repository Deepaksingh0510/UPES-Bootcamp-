class countOne{

    void count(int n){
        int count=0;

        while(n>0){
            if((n&1)==0){
                count ++;
            }
            n=n>>1;
        }

        System.out.println(count);
    }

    public static void main(String args[]){
        int n=8;

        countOne c=new countOne();
        c.count(n);
    }
}