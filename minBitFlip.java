class minBitFlip{
    int flip(int st,int end){
        int xor=st ^ end;
        int count =0;

        while(xor!=0){
            count += xor&1;
            xor>>=1;
        }
        return count;
    }

    public static void main(String args[]){
        int st=10;
        int end=7;
        
        minBitFlip m=new minBitFlip();
        System.err.println(m.flip(st,end));
    }
}