

public class palindromeNum {
    
    boolean check(int n){
        String s=Integer.toString(n);
        StringBuilder st=new StringBuilder(s).reverse();

        return s.equals(st.toString());
    }

    public static void main(String[] args) {
        int n=121;

        palindromeNum p=new palindromeNum();
        System.out.print(p.check(n));

    }
}
