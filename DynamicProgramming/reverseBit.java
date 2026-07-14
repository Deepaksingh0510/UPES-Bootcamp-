public class reverseBit {
    
    int reverse(int n){
        int res=0;

        for (int i = 0; i < 32; i++) {
            res<<=1;
            res=res|(n&1);
            n>>>=1;
        }

        return res;
    }


    public static void main(String[] args) {
        int n=43261596;

        reverseBit s=new reverseBit();
        System.out.print(s.reverse(n));
    }
}
