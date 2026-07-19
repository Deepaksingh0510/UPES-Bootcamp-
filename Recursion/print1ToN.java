class  Solution{

    void print(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        print(n-1);
        System.out.print(n);
    }
}
public class print1ToN {
    public static void main(String[] args) {
        int n=10;
        Solution s=new Solution();
        s.print(n);
    }
}
